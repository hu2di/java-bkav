package com.bkav.degree;

public class Degree {
	private String name;
	private String discipline;
	private String university;
	private int dateAwarded;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDiscipline() {
		return discipline;
	}

	public void setDiscipline(String discipline) {
		this.discipline = discipline;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public int getDateAwarded() {
		return dateAwarded;
	}

	public void setDateAwarded(int dateAwarded) {
		this.dateAwarded = dateAwarded;
	}

	public Degree() {

	}

	public Degree(String name, String discipline, String university,
			int dateAwarded) {
		this.name = name;
		this.discipline = discipline;
		this.university = university;
		this.dateAwarded = dateAwarded;
	}

}
