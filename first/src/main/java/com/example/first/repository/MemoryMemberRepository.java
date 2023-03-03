package com.example.first.repository;

import com.example.first.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.*;


public class MemoryMemberRepository implements MemberRepository{
  private static Map<Long, Member> map = new HashMap<>();
  private static long nextId = 1L;
  // primitive data type = int, char  // , long, float, double, boolean
  @Override
  public Member save(Member member){
    long id = nextId++;
    member.setId(id);
    map.put(id, member);
    return member;
  }
  @Override
  public Member findById(long id){ // select * from member where id = 1;
    Member member = map.get(id);
    return member;
  }
  @Override
  public List<Member> findAll(){ // select * from member;
    List<Member> values = new ArrayList<>(map.values());
    return values;
  }
}
