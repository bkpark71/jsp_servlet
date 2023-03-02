package com.example.first.service;

import com.example.first.domain.Member;
import com.example.first.repository.MemoryMemberRepository;

import java.util.List;

public class MemberService {
  MemoryMemberRepository memberRepository = new MemoryMemberRepository();

  public long join(Member member){
    Member newMember = memberRepository.save(member);
    return newMember.getId();
  }

  public List<Member> memberList(){
    return memberRepository.findAll();
  }

  public Member findMember(long id){
    return memberRepository.findById(id);
  }
}
