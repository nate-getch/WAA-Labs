package mum.edu.service;

import java.util.List;

import mum.edu.domain.Advice;

public interface AdviceService {
	public List<Advice> getAll();
	public Advice getAdvice(String name);
}
