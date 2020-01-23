package com.spr.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "disease")
public class Disease {
	
	public int getDiseaseId() {
		return DiseaseId;
	}
	public void setDiseaseId(int diseaseId) {
		DiseaseId = diseaseId;
	}
	public String getDiseaseName() {
		return DiseaseName;
	}
	public void setDiseaseName(String diseaseName) {
		DiseaseName = diseaseName;
	}
	@Id
	@Column(name = "Disease_id")
	private int DiseaseId;
	@Column(name = "Disease_name")
	private String DiseaseName;
	
	public Disease(int DiseaseId) {
		super();
		this.DiseaseId = DiseaseId;
	}
	public Disease() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}


