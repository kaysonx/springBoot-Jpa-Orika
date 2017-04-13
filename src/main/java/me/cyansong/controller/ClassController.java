package me.cyansong.controller;

import me.cyansong.dal.StudentMockData;
import me.cyansong.model.StudentMock;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("classes")
public class ClassController {

    @GET
    @Path("{classId}/students/{studentId}/{studentCourse}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getStudentCourse(@HeaderParam("class") String clazz,
                                   @HeaderParam("teacherCourse") String teacherCourse,
                                   @PathParam("classId")String classId,
                                   @PathParam("studentId")String studentId,
                                   @PathParam("studentCourse")String studentCourse){
        if(!studentCourse.toLowerCase().equals(teacherCourse.toLowerCase())){
            return Response.status(Response.Status.FORBIDDEN).entity("permission denied: course not match!").build();
        }
        StudentMock student = new StudentMockData().getStudents()
                .stream()
                .filter(studentMock -> studentMock.getStrId().equals(studentId))
                .findAny()
                .orElseThrow(() -> new WebApplicationException(Response.Status.NOT_FOUND));
        if(!student.getClassName().toLowerCase().equals(classId.toLowerCase())){
            return Response.status(Response.Status.FORBIDDEN).entity("permission denied: class not match!").build();
        }
        try {
            Double score = StudentMockData.getStudentScore(student,studentCourse);
            return Response.ok(score).build();
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).entity("wrong course name").build();
        }
    }
}
