package com.zocdoc.api;

import com.zocdoc.models.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 26.09.15.
 */

@Path(value = "doctor")
public class DoctorService implements Serializable {


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Doctor> getDoctors() {


        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor());
        doctors.add(new Doctor());
        doctors.add(new Doctor());

        return doctors;
    }
}
