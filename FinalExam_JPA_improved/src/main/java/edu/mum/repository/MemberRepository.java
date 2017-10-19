package edu.mum.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.mum.domain.Member;

@Repository
public interface MemberRepository extends CrudRepository<Member,Long> {
	public Member findByMemberNumber(Integer memberNumber);
 	}
