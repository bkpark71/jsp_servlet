package com.example.first.repository;

import com.example.first.domain.Member;

import java.util.List;

public interface MemberRepository {
  public Member save(Member member);
  public Member findById(long id);
  public List<Member> findAll();
}
