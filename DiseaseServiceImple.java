package com.spr.serv;

import java.util.List;

import com.spr.dto.Disease;

public class DiseaseServiceImple implements DiseaseService {

	@Override
	public void add(Disease disease) {
		// TODO Auto-generated method stub
		diseaseDao.add(disease);
		
	}

	@Override
	public void remove(int diseaseId) {
		// TODO Auto-generated method stub
		diseaseDao.remove(diseaseId);
		
	}


	@Override
	public Disease selectById(int diseaseId) {
		// TODO Auto-generated method stub
		return diseaseDao.selectById;
	}

	@Override
	public List<Disease> selectAll() {
		// TODO Auto-generated method stub
		return diseaseDao.selectAll();
	}

}
