package com.almajedhs.demospringbootgradle.Web;


import org.springframework.web.bind.annotation.*;

@RestController
public class StudentUpdateController {

    @RequestMapping(method = RequestMethod.PUT, value="/update/student")
    @ResponseBody
    public String registerStudent(@RequestBody Student student) {
        System.out.println("In updateStudent");
        return StudentRegistration.getInstance().updateStudent(student);

    }

    @RequestMapping(method = RequestMethod.DELETE, value="/delete/student")
    @ResponseBody
    public String deleteStudent(@RequestBody Student student) {
        System.out.println("In deleteStudent");
        return StudentRegistration.getInstance().deleteStudent(student.registrationNumber);

    }


}
