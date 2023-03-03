package com.example.first.service;

import com.example.first.domain.Member;
import com.example.first.repository.JdbcTemplateMemberRepository;
import com.example.first.repository.MemberRepository;
import com.example.first.repository.MemoryMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.sql.DataSource;
import java.util.List;

@Service
public class MemberService {

  private final MemberRepository memberRepository ;
//      new MemoryMemberRepository();
  @Autowired
  public MemberService(MemberRepository memberRepository) {
    this.memberRepository = memberRepository;
  }

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
