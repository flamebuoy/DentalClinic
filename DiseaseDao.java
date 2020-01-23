package com.spr.dao;

import java.util.List;



import com.spr.dto.Disease;


public interface DiseaseDao {
	void adddisease(Disease disease);
	void removedisease(int diseaseId);
	Disease selectById(int diseaseId);
	List<Disease> selectAll();
	
	

}
