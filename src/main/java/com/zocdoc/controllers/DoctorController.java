package com.zocdoc.controllers;

import com.sun.jersey.api.view.Viewable;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * Created by root on 03.10.15.
 */

@Path("doctors")
public class DoctorController {

    @GET
    public Response get() {
        return Response.ok(new Viewable("/WEB-INF/pages/doctors.jsp")).build();
    }
}
