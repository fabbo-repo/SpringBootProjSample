package com.proy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proy.repo.IPersonRepo;

@Service
public class PersonService implements IPersonService {
	
	@Autowired
	private IPersonRepo person;

	@Override
	public void register(String name) {
		this.person.register(name);
	}

}
