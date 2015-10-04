package com.zocdoc.api;

import com.zocdoc.models.*;
import com.zocdoc.models.service.DoctorDAO;
import com.zocdoc.models.service.HospitalDAO;

import javax.ejb.TransactionAttribute;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 26.09.15.
 */

@Path(value = "api/doctor")
@RequestScoped
public class DoctorService implements Serializable {

    @Inject
    private DoctorDAO doctorDAO;

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Doctor> getDoctors() {
        Doctor doctor = new Doctor();
        doctor.setFirstName("Andriy");
        doctor.setLastName("Andrievich");
        doctor.setSpecialty("Some specialty");
        doctor.setLocation("Some location");

        Doctor nextDoctor = new Doctor();
        nextDoctor.setFirstName("Ivan");
        nextDoctor.setLastName("Pethrovich");
        nextDoctor.setLocation("Some location2");
        nextDoctor.setSpecialty("Some specialty2");


        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(doctor);
        doctors.add(nextDoctor);

        return doctors;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Doctor getDoctor(@PathParam("id") int doctorId){


        return new Doctor();
    }

    @PUT
    @Path("/")
    public Response addDoctor(Doctor doctor) {

        return Response.ok().build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteDoctor(@PathParam("id") int doctorId) {

        return Response.ok().build();
    }
}
