package com.example.first.controller;

import com.example.first.domain.Member;
import com.example.first.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MemberController {
  private final MemberService memberService;

  @Autowired
  public MemberController(MemberService memberService) {
    this.memberService = memberService;
  }

  @GetMapping("/member/home")
  public String home() {
    return "member/home";
  }

  @GetMapping("/member/new")
  public String newMember() { // parameter 방식으로 전달
    return "member/newMember";
  }

  @PostMapping("member/new")
  public String newMember(MemberForm memberForm) { // form 객체들 통해 내용 전달
    Member member = new Member();
    member.setName(memberForm.getName());
    System.out.println(memberService.join(member) + "번 사용자가 가입 완료");
    return "member/home";
  }

//  @GetMapping("/members")
//  @ResponseBody
//  public List<Member> memberList(Model model) {
//    List<Member> members = memberService.memberList();
//    model.addAttribute("members", members);
//    return members;
//  }

  @GetMapping("/members")
  public String memberList(Model model) {
    List<Member> members = memberService.memberList();
    model.addAttribute("members", members);
    return "member/memberlist";
  }
}
