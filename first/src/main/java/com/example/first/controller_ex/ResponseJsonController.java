package com.example.first.controller_ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ResponseJsonController {
  @GetMapping("response-hello")
  @ResponseBody
  public Hello response(String id, String name) { // @RequestParam("name") 생략 가능
    Hello hello = new Hello();
    hello.setName(name);
    hello.setId(id);
    return hello;
  }

  class Hello {
    private String name;
    private String id;

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getId() {
      return id;
    }

    public void setId(String id) {
      this.id = id;
    }
  }
}
