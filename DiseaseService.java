package com.spr.serv;

import java.util.List;

import com.spr.dto.Disease;

public interface DiseaseService {
	void add(Disease disease);
	void remove(int diseaseId);
	void edit(Disease disease);
	Disease selectById(int diseaseId);
	List<Disease> selectAll();
}
