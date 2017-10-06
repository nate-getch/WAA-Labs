package mum.edu.repositoryimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import mum.edu.domain.Advice;
import mum.edu.repository.AdviceRepository;

@Repository
public class AdviceRepositoryImpl implements AdviceRepository {

	List<Advice> adviceList;

	AdviceRepositoryImpl() {
		adviceList = new ArrayList<Advice>();

		ArrayList<String> darkList = new ArrayList<String>();
		darkList.add("Sumatra");
		darkList.add("Verona");
		darkList.add("French Roast");
		Advice dark = new Advice("dark", darkList);

		ArrayList<String> medList = new ArrayList<String>();
		medList.add("Breakfast Blend");
		medList.add("Colombia");
		medList.add("Yukon");
		medList.add("Pike Place");
		medList.add("House Blend");
		Advice medium = new Advice("medium", medList);

		ArrayList<String> lightList = new ArrayList<String>();
		lightList.add("Willow");
		lightList.add("Aria");
		lightList.add("Bright Sky");
		lightList.add("Veranda");
		Advice light = new Advice("light", lightList);

		adviceList.add(dark);
		adviceList.add(medium);
		adviceList.add(light);
	}

	public Advice getAdvice(String name) {
		for (Advice adv : adviceList) {
			if (name.equals(adv.getAdviceTitle())) {
				return adv;
			}
		}
		return null;
	}

	public List<Advice> getAllAdvice() {
		return adviceList;
	}
}
