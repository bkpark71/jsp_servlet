package com.example.first.controller_ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class MainController {
  @GetMapping("/main")  // localhost:8080/main 으로 접속하면 main.html 띄워주기
  public String main(){
      return "main";
  }


  @GetMapping("/main1")  // localhost:8080/main1?id=aaa 으로 접속하면 main1.html 띄워주기
  public String main1(@RequestParam(required = true) String id,
                      @RequestParam(value="name", required = false, defaultValue = "aaa") String name,
                      Model model){
    model.addAttribute ("name", name);
    model.addAttribute("id", id);
    return "main1";
  }
  @GetMapping("/main2")  // localhost:8080/main2?id=111&name=aaa 으로 접속하면 main1.html 띄워주기
  public String main2(@RequestParam Map<String, String> param,
                      Model model){
    String id = param.get("id");
    String name = param.get("name");
    model.addAttribute ("name", name);
    model.addAttribute("id", id);
    return "main1";
  }
}
