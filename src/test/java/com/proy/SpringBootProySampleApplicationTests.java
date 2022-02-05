package com.proy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.proy.model.User;
import com.proy.repo.IUserRepo;
import static org.junit.Assert.assertTrue;

@SpringBootTest
class SpringBootProySampleApplicationTests {
	@Autowired
	private IUserRepo userRepo;
	
	@Autowired
	private BCryptPasswordEncoder passEncoder;
	
	@Test
	void createUserTest() {
		User user = new User();
		user.setId(1);
		user.setName("admin");
		user.setPassword(passEncoder.encode("admin1234"));
		User uAux = this.userRepo.save(user);
		
		assertTrue(user.getPassword().equals(uAux.getPassword()));
	}

}
