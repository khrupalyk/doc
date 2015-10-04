package hibernateMapping;

import org.hibernate.SessionFactory;
import org.junit.Assert;
import org.junit.Test;
import org.unitils.UnitilsJUnit4;
import org.unitils.orm.hibernate.HibernateUnitils;
import org.unitils.orm.hibernate.annotation.HibernateSessionFactory;

/**
 * Created by root on 03.10.15.
 */
public class UserAndDoctorTest extends UnitilsJUnit4 {

    @HibernateSessionFactory("hibernate.cfg.xml")
    SessionFactory sessionFactory;

    @Test
    public void userAndDoctorMapping(){

//        HibernateUnitils.assertMappingWithDatabaseConsistent();
        Assert.assertNotEquals("SessionFactor is null", null, sessionFactory);
    }
}
