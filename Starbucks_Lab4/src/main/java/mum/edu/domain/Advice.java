package mum.edu.domain;

import java.util.ArrayList;
import java.util.List;

public class Advice {
	private String adviceTitle;
	private List<String> adviceContent;
	
	public Advice(){
		
	}
	
	public Advice(String adviceTitle, List<String> adviceContent) {
		this.adviceContent = new ArrayList<>();
		this.adviceTitle = adviceTitle;
		this.adviceContent = adviceContent;
	}

	public String getAdviceTitle() {
		return adviceTitle;
	}

	public void setAdviceTitle(String adviceTitle) {
		this.adviceTitle = adviceTitle;
	}

	public List<String> getAdviceContent() {
		return adviceContent;
	}

	public void setAdviceContent(List<String> adviceContent) {
		this.adviceContent = adviceContent;
	}
	
}
