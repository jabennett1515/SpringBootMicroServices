package com.plantplaces.service;

import com.plantplaces.dto.SpecimenDTO;



/**
 * CRUD operation
 * @author Administrator
 *
 */
public interface ISpecimenService {
	/**
	 * GET specimen from persistence layer
	 * @param id a unique lookup
	 * @return a specimen with a matching id
	 */

	SpecimenDTO fetchByID(int id);
	/**
	 * Persist the given DTO
	 * @param specimenDTO
	 *
	 */

	void save(SpecimenDTO specimenDTO);

}