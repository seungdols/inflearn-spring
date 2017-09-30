package com.seungdols.spring.env.ex5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @PACKAGE com.seungdols.spring.env.ex5
 * @AUTHOR seungdols
 * @DATE 2017. 10. 1.
 */
@Configuration
@Profile("real")
public class AnnotationConfig_Real {

	@Bean
	public ServerInfo serverInfo() {
		ServerInfo serverInfo = new ServerInfo();
		serverInfo.setIp("192.168.0.2");
		serverInfo.setPort("80");

		return serverInfo;
	}
}
