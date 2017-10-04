package mum.edu.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mum.edu.domain.Advice;
import mum.edu.repository.AdviceRepository;
import mum.edu.service.AdviceService;

@Service
public class AdviceServiceImpl implements AdviceService {
	
	@Autowired
	AdviceRepository adviceRepository;
	
	public List<Advice> getAll(){
		return this.adviceRepository.getAllAdvice();
	}
	
	public Advice getAdvice(String name) {
		return this.adviceRepository.getAdvice(name);
	}
}
