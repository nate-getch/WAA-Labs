package mum.edu.repository;

import java.util.List;

import mum.edu.domain.Advice;;

public interface AdviceRepository {
	public Advice getAdvice(String name);
	public List<Advice> getAllAdvice();
}
