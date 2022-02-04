package com.proy.repo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.proy.SpringBootProySampleApplication;

@Repository
public class PersonRepo implements IPersonRepo {

	private static Logger LOG = LoggerFactory.getLogger(SpringBootProySampleApplication.class);

	@Override
	public void register(String name) {
		LOG.info("Registro de: "+name);
	}

}
