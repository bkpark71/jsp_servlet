package com.example.first.controller_ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ResponseController {
  @GetMapping("response")
  @ResponseBody
  public String response(String name) { // @RequestParam("name") 생략 가능
    return "response => " + name;
  }
}
