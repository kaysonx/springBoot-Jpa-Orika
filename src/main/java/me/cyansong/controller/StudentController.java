package me.cyansong.controller;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import me.cyansong.dal.StudentRepository;
import me.cyansong.model.MappedStudent;
import me.cyansong.model.Student;

import javax.ws.rs.*;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("students")
//@Component
public class StudentController {

    ////@Autowired
    //@Inject
    //private StudentRepository studentRepository;
    private MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

    @GET
    @Path("{stuId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Student getStudent(@PathParam("stuId")Integer stuId,
                              @Context StudentRepository studentRepository){
        return studentRepository.findOne(stuId);
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public MappedStudent createStudent(Student student, @Context ContainerRequestContext requestContext,@Context StudentRepository studentRepository){
        System.out.println(requestContext.getUriInfo());
        Student savedStudent =  studentRepository.save(student);
        mapperFactory.classMap(Student.class, MappedStudent.class)
                .field("name", "studentName")
                .byDefault()
                .register();
        MapperFacade mapper = mapperFactory.getMapperFacade();
        MappedStudent mappedStudent = mapper.map(savedStudent,MappedStudent.class);
        return  mappedStudent;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student> getAll(@Context StudentRepository studentRepository){
        return studentRepository.getAll();
    }

}
