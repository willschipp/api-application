package com.emc.cf.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class CoreController {

	
	@RequestMapping(method=RequestMethod.GET)
	public long getTime() throws Exception {
		//now look up the key
		return System.currentTimeMillis();
	}
	
	
}
