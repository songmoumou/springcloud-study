package com.song.cloud.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author AJohn
 */
@RestController
public class StudentController {
  @RequestMapping(value = "/echoStudentName/{name}")
  public String echoStudentName(@PathVariable(name = "name") String name) {
    return "Hello  " + name + " Responsed on : " + new Date();
  }

  @RequestMapping(value = "/getStudentDetails/{name}")
  public Student getStudentDetails(@PathVariable(name = "name") String name) {
    return new Student(name, "Pune", "MCA");
  }
}
