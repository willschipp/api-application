package com.emc.cf.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.emc.cf.app.data.ApiKey;
import com.emc.cf.app.data.ApiKeyRepository;

@RestController
@RequestMapping("/app/key")
public class ApiKeyController {

	@Autowired
	private ApiKeyRepository repository;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<ApiKey> getAll() {
		return repository.findAll();
	}
	
}
