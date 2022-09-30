package com.greatlearning.library.model;

import lombok.Getter;
import lombok.Setter;

public class GreatLearning {

	@Getter
	@Setter
	private String courseName;
	private String courseType;
	private String instructorName;
	
	
	@Override
	public String toString() {
		return "GreatLearning [courseName=" + courseName + ", courseType=" + courseType + ", instructorName="
				+ instructorName + "]";
	}
	
	


}
