package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.pojo;

@Repository
public interface repo extends JpaRepository<pojo, Integer>{
	pojo findByuname(String uname);

}
