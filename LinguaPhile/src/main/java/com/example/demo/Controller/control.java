package com.example.demo.Controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;


import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Model.pojo;
import com.example.demo.Services.serve;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.*;


@RestController

public class control{
	@Autowired
	serve ss_service;

	@Operation(summary = "Creates a new employee")
	@ApiResponses(value = {@ApiResponse(responseCode = "201", description = "Employee Created Successfully!"), @ApiResponse(responseCode = "400", description = "Employee is Invalid"), @ApiResponse(responseCode = "401", description = "Invalid Credentials")})
	@ResponseStatus(HttpStatus.CREATED)
	
	@PostMapping(value = "/post", produces = "application/json", consumes = "application/json")
	public String create(@RequestBody pojo ss_model)
	{
		return ss_service.addSS(ss_model);
	}
	@Operation(summary = "Creates a new employee")
	@ApiResponses(value = {@ApiResponse(responseCode = "201", description = "Employee Created Successfully!"), @ApiResponse(responseCode = "400", description = "Employee is Invalid"), @ApiResponse(responseCode = "401", description = "Invalid Credentials")})
	@ResponseStatus(HttpStatus.CREATED)
	
	@GetMapping(value = "/get", produces = "application/json", consumes = "application/json")
	public List<pojo> read()
	{
		return ss_service.getSS();
	}
	@Operation(summary = "Creates a new employee")
	@ApiResponses(value = {@ApiResponse(responseCode = "201", description = "Employee Created Successfully!"), @ApiResponse(responseCode = "400", description = "Employee is Invalid"), @ApiResponse(responseCode = "401", description = "Invalid Credentials")})
	@ResponseStatus(HttpStatus.CREATED)
	
	@GetMapping(value = "/{sign_no}", produces = "application/json", consumes = "application/json")
	public Optional<pojo> readById(@PathVariable int sign_no)
	{
		return ss_service.getSSById(sign_no);
	}
	@Operation(summary = "Creates a new employee")
	@ApiResponses(value = {@ApiResponse(responseCode = "201", description = "Employee Created Successfully!"), @ApiResponse(responseCode = "400", description = "Employee is Invalid"), @ApiResponse(responseCode = "401", description = "Invalid Credentials")})
	@ResponseStatus(HttpStatus.CREATED)
	
	@PutMapping(value = "/update_ss")
	public String update(@RequestBody pojo ss_model) 
	{
		return ss_service.updateSS(ss_model);
	}
	@Operation(summary = "Creates a new employee")
	@ApiResponses(value = {@ApiResponse(responseCode = "201", description = "Employee Created Successfully!"), @ApiResponse(responseCode = "400", description = "Employee is Invalid"), @ApiResponse(responseCode = "401", description = "Invalid Credentials")})
	@ResponseStatus(HttpStatus.CREATED)
	
	@DeleteMapping(value = "/delete")
	public String delete(@RequestParam ("num") int id)
	{
		return ss_service.deleteByRequestParamId(id);
	}
	//sorting
	@PostMapping("/login")
	public String login(@RequestBody Map<String, String> loginData) {
		String uname = loginData.get("uname");
		String pwd = loginData.get("pwd");
		String result = ss_service.checkLogin(uname, pwd);
		return result;
	}
	@PostMapping("/adduser")
	  public pojo AddUser(@RequestBody pojo model) {
		return ss_service.addUser(model);
	}
    @GetMapping("/getuser")
    public List<pojo>listAll(){
	return ss_service.getUser();
    }
    //sorting
    @GetMapping("/sort/{field}")
    public List<pojo>sorting(@PathVariable String field)
    {
   	 return ss_service.sort(field);
    }
    //pagination
    @GetMapping("/sort/{offset}/{pagesize}")
    public List<pojo>paging(@PathVariable int offset,@PathVariable int pagesize)
    {
   	 return ss_service.paging(offset, pagesize);
    }
}