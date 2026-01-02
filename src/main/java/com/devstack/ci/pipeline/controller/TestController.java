package com.devstack.ci.pipeline.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/tests")
public class TestController {

  public String test(){
    return " ";
  }
  
  
}
