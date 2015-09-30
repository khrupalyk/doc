import com.zocdoc.models.Doctor;
import com.zocdoc.models.Hospital;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Query;
import org.hibernate.cfg.Configuration;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import java.util.Map;

/**
 * Created by root on 30.09.15.
 */
public class Main {
    private static final SessionFactory ourSessionFactory;
    private static final ServiceRegistry serviceRegistry;

    static {
        try {
            Configuration configuration = new Configuration();

            configuration.configure("hibernate.cfg.xml");

            serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
            ourSessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Throwable ex) {
            System.out.println(ex.toString());
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSessionFactory() throws HibernateException {
        return ourSessionFactory.openSession();
    }



    public static void main(final String[] args) throws Exception {
        final Session session = getSession();
        try {
            System.out.println("querying all the managed entities...");
            session.beginTransaction();
            Hospital hospital = new Hospital();
            Doctor doc = new Doctor();
            doc.setHospital(hospital);
            session.save(hospital);
            session.save(doc);
            session.save(new Hospital());
            session.getTransaction().commit();
            session.createQuery("select d.hospitalId FROM Hospital d").list().forEach(System.out::println);
        } finally {
            session.close();
        }
    }
}
