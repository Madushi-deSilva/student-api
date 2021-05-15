package com.example.studentapi;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class StudentController {

    StudentRepository repository = new InMemoryStudentRepository();
    //REST ENDPOINTS

    //create a student
    @PostMapping("/student")
    public void createStudent(@RequestBody Student student){
        repository.save(student);
    }

    //retrieve a student
    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable String id){
        return repository.get(id);
    }

    //delete a student
    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable String id){
        repository.delete(id);
    }

    //update a student

}
