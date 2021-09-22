package com.swe645.hw3.RestAPI;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.swe645.hw3.model.SurveyForm;
import com.swe645.hw3.service.EntityManager;

@Path("/students")
public class Student {

    @GET
    @Path("/id/{studentId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStudentDetails(@PathParam("studentId") String studentId) {
        System.out.println("StudentId is " + studentId);
        return Response.ok().
                entity(EntityManager.getSurvey(studentId))
                .header("Access-Control-Allow-Origin", "*")
                .build();
    }

    @GET
    @Path("all")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllSurveys() {
        return Response.ok().
                entity(EntityManager.getAllSurveys())
                .header("Access-Control-Allow-Origin", "*")
                .build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStudentIds() {
        return Response.ok().
                entity(EntityManager.getAllStudentIDs())
                .header("Access-Control-Allow-Origin", "*")
                .build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(SurveyForm survey) {
        return Response.ok().
                entity(EntityManager.addSurvey(survey))
                .header("Access-Control-Allow-Origin", "*")
                .build();

    }

   
}

