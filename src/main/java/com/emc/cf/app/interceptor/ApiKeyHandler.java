package com.emc.cf.app.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.emc.cf.app.data.ApiKey;
import com.emc.cf.app.data.ApiKeyRepository;

public class ApiKeyHandler extends HandlerInterceptorAdapter {
	
	private static final Log logger = LogFactory.getLog(ApiKeyHandler.class);

	public static final String API_KEY = "api-key";
	
	@Autowired
	private ApiKeyRepository repository;
	
	@Override
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response, Object handler) throws Exception {
		if (StringUtils.isEmpty(request.getHeader(API_KEY))) {
			logger.error("no api-key passed");
			return false;
		} else {
			//look it up
			ApiKey key = repository.findOne(request.getHeader(API_KEY));
			if (key == null) {
				logger.error("api-key not found");
				return false;
			}//end if
		}//end if
		return true;
	}

}
