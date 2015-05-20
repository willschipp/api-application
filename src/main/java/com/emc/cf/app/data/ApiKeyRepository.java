package com.emc.cf.app.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ApiKeyRepository extends JpaRepository<ApiKey, String> {

	ApiKey findByApplicationId(String appGuid);

	ApiKey findByInstanceId(String serviceInstanceId);

}
