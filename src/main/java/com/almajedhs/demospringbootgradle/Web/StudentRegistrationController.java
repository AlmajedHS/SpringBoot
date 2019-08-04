package com.almajedhs.demospringbootgradle.Web;


import org.springframework.web.bind.annotation.*;

@RestController
public class StudentRegistrationController {



    @RequestMapping(method = RequestMethod.POST, value="/register/student")
    @ResponseBody
    public StudentRegistrationReply registerStudent(@RequestBody Student student) {
        System.out.println("In registerStudent");
        StudentRegistrationReply stdregreply = new StudentRegistrationReply();
        StudentRegistration.getInstance().add(student);
        stdregreply.setName(student.getName());
        stdregreply.setAge(student.getAge());
        stdregreply.setRegistrationNumber(student.getRegistrationNumber());
        stdregreply.setRegistrationStatus("Successful");
        return stdregreply;
    }
}
