package com.zocdoc.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.io.Serializable;

/**
 * Created by root on 26.09.15.
 */

@Path(value = "doctor")
public class DoctorService implements Serializable {


    String json = "[{\n" +
            "            \"firstName\":\"Anton\",\n" +
            "            \"lastName\":\"Antonovich\"\n" +
            "            \"hospital\":\"Hospital 1\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"firstName\":\"Vasa\",\n" +
            "            \"lastName\":\"Vasilivich\"\n" +
            "            \"hospital\":\"Hospital 2\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"firstName\":\"Ivan\",\n" +
            "            \"lastName\":\"Petrovich\"\n" +
            "            \"hospital\":\"Hospital 3\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"firstName\":\"Sveta\",\n" +
            "            \"lastName\":\"Ivanova\"\n" +
            "            \"hospital\":\"Hospital 4\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"firstName\":\"Natalia\",\n" +
            "            \"lastName\":\"Petrova\"\n" +
            "            \"hospital\":\"Hospital 5\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"firstName\":\"Nazar\",\n" +
            "            \"lastName\":\"Simenovich\"\n" +
            "            \"hospital\":\"Hospital 6\"\n" +
            "        },\n" +
            "        {\n" +
            "            \"firstName\":\"Slavic\",\n" +
            "            \"lastName\":\"Coperfild\"\n" +
            "            \"hospital\":\"Hospital 7\"\n" +
            "        }]";

    @GET
//    @Produces(MediaType.APPLICATION_JSON)
    public String getDoctors() {
            System.out.println("User get data");
        return json;
    }
}
