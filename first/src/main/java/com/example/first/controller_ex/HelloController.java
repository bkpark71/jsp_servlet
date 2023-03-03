package com.example.first.controller_ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

  @GetMapping("/hello")   // localhost:8080/hello 라고 get 요청이 들어오면
  public String hello(){
      return "hello"; // template folder 아래에 있는 hello.html, hello.jsp 찾아서 화면을 보여줘
  }

  @GetMapping("/hello1")   // localhost:8080/hello1?name=aaa 라고 get 요청이 들어오면
  public String hello1(@RequestParam("name") String name){
    return "hello1"; // template folder 아래에 있는 hello1.html, hello1.jsp 찾아서 화면을 보여줘
  }

  @GetMapping("/hello2")   // localhost:8080/hello2?name=aaa 라고 get 요청이 들어오면
  public String hello2(@RequestParam("name") String name, Model model){
    model.addAttribute("name", name);
    return "/exercise/hello2"; // template folder 아래에 있는 hello2.html, hello2.jsp 찾아서 화면을 보여줘
  }
}
