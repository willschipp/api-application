package com.emc.cf.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.emc.cf.app.data.ApiKeyRepository;

@RestController
@RequestMapping("/app")
public class CoreController {

	@Autowired
	private ApiKeyRepository repository;
	
	@RequestMapping(method=RequestMethod.GET)
	public long getTime(@RequestHeader(value="api-key",required=true) String apiKey) throws Exception {
		lookupKey(apiKey);
		//now look up the key
		return System.currentTimeMillis();
	}
	
	private void lookupKey(String key) throws Exception {
		if (repository.findOne(key) == null) {
			throw new Exception("Key not valid");
		}//end if
	}
	
}
