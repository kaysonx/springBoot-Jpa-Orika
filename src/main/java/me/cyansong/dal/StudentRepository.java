package me.cyansong.dal;

import me.cyansong.model.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StudentRepository extends CrudRepository<Student,Integer>{
    @Query("SELECT s FROM Student s")
    List<Student> getAll();
}
