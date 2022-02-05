package com.proy.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proy.model.User;

public interface IUserRepo extends JpaRepository<User, Integer> {
	User findByName(String name);
}
