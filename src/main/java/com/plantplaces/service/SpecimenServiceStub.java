package com.plantplaces.service;

import org.springframework.stereotype.Component;

import com.plantplaces.dto.SpecimenDTO;

@Component
public class SpecimenServiceStub implements ISpecimenService {

	@Override
	public SpecimenDTO fetchByID(int id) {
		SpecimenDTO specimenDTO = new SpecimenDTO();
		specimenDTO.setSpecimenID(43);
		specimenDTO.setLatitude("123, 456");
		specimenDTO.setLongititude("345,123");
		specimenDTO.setDescription("this is the description");
		return specimenDTO;	
	}
	
	@Override
	public void save(SpecimenDTO specimenDTO) {
		
	}
	
	
}
