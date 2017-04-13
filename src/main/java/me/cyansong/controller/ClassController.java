package me.cyansong.controller;

import me.cyansong.dal.StudentMockData;
import me.cyansong.model.StudentMock;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("classes")
public class ClassController {

    @GET
    @Path("{studentClass}/students/{studentId}/{studentCourse}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStudentCourse(@HeaderParam("teacherClass") String teacherClass,
                                     @HeaderParam("teacherCourse") String teacherCourse,
                                     @PathParam("studentClass") String studentClass,
                                     @PathParam("studentId") String studentId,
                                     @PathParam("studentCourse") String studentCourse) {
        if(!studentClass.toLowerCase().equals(teacherClass.toLowerCase())){
            return Response.status(Response.Status.FORBIDDEN).entity("permission denied: teacher class not match!").build();
        }
        if (!studentCourse.toLowerCase().equals(teacherCourse.toLowerCase())) {
            return Response.status(Response.Status.FORBIDDEN).entity("permission denied: teacher course not match!").build();
        }

        StudentMock student = new StudentMockData().getStudents()
                .stream()
                .filter(studentMock -> studentMock.getStrId().equals(studentId))
                .findAny()
                .orElseThrow(() -> new WebApplicationException(Response.Status.NOT_FOUND));
        if (!student.getClassName().toLowerCase().equals(studentClass.toLowerCase())) {
            return Response.status(Response.Status.FORBIDDEN).entity("permission denied: student class not match!").build();
        }
        try {
            Double score = StudentMockData.getStudentScore(student, studentCourse);
            return Response.ok(score).build();
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity("wrong course name").build();
        }
    }
}
