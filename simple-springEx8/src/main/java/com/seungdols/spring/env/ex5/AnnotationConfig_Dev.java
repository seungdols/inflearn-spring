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
@Profile("dev")
public class AnnotationConfig_Dev {

	@Bean
	public ServerInfo serverInfo() {
		ServerInfo serverInfo = new ServerInfo();
		serverInfo.setIp("127.0.0.1");
		serverInfo.setPort("8080");

		return serverInfo;
	}
}
