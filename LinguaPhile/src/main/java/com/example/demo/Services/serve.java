package com.example.demo.Services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.Model.pojo;
import com.example.demo.Repository.PDrepo;
import com.example.demo.Repository.repo;

@Service
public class serve {
	@Autowired
	repo ss_repo;
	@Autowired
	PDrepo ss_Mapping;
	public String addSS(pojo ss_model)
	{
		ss_repo.save(ss_model);
		return "Added!";
	}
	public List<pojo> getSS()
	{
		return ss_repo.findAll();
	}
	public Optional<pojo> getSSById(int id)
	{
		return ss_repo.findById(id);
	}
	public String updateSS(pojo ss_model)
	{
		ss_repo.save(ss_model);
		return "Updated!";
	}
	public String deleteByRequestParamId(int sign_no)
	{
		ss_repo.deleteById(sign_no);
		return "Deleted!";
	}
	public String checkLogin(String uname, String pwd){
		pojo user = ss_repo.findByuname(uname);
		if(user == null) {
			return "no user found";
		}
		else {
			if(user.getPwd().equals(pwd)) {
				return"Login Succesfull";
			}
			else 
			{
				return "Login Failed";
			}
		}
	}
	public pojo addUser(pojo game) {
		return ss_repo.save(game);
	}
	public List<pojo> getUser(){
		return ss_repo.findAll();
	}
	//sorting
	public List<pojo>sort(String field)
	{
		return ss_repo.findAll(Sort.by(Sort.Direction.ASC, field));
	}
	//pagination
	public List<pojo>paging( int offset,int pagesize)
	{
		Page<pojo> page=ss_repo.findAll(PageRequest.of(offset,  pagesize));
		return page.getContent();
	}
}