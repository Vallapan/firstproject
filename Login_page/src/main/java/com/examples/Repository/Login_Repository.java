package com.examples.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examples.bean.Login_page;

public interface Login_Repository extends JpaRepository<Login_page, Integer> {

	Login_page findByEmailAndPassword(String email, String password);

}
