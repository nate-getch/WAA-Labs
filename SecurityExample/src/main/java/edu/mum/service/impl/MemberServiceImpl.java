package edu.mum.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.domain.Member;
import edu.mum.repository.MemberRepository;
import edu.mum.service.UserCredentialsService;

@Service
@Transactional 
public class MemberServiceImpl implements edu.mum.service.MemberService {
	
 	@Autowired
	private MemberRepository memberRepository;

 	@Autowired
 	UserCredentialsService credentialsService;

 	@PreAuthorize("hasRole('ROLE_ADMIN')")
 	    public void save( Member member) {  		
		memberRepository.save(member);
	}
	
 	
    @Override
 	@PreAuthorize("hasRole('ROLE_ADMIN')")
       	public void saveFull( Member member) {  		
  		credentialsService.save(member.getUserCredentials());
  		memberRepository.save(member);
	}
  	

	public List<Member> findAll() {
		return (List<Member>)memberRepository.findAll();
	}

 	public Member findOne(Long id) {
		return memberRepository.findOne(id);
	}
	
	public Member findByMemberNumber(int memberId) {
		return memberRepository.findByMemberNumber(memberId);
	}
 

}
