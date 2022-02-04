package com.proy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.proy.service.IPersonService;

@SpringBootApplication
public class SpringBootProySampleApplication implements CommandLineRunner{

	private static Logger LOG = LoggerFactory.getLogger(SpringBootProySampleApplication.class);

	@Autowired
	private IPersonService person;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootProySampleApplication.class, args);
		LOG.info("APP Running < Custom log");
	}

	@Override
	public void run(String... args) throws Exception {
		this.person.register("Service");
	}

}
