package com.seungdols.spring.env.ex3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * @PACKAGE com.seungdols.spring.env.ex3
 * @AUTHOR seungdols
 * @DATE 2017. 9. 30.
 */
@Configuration
public class AnnotationConfiguration {

	@Value("${admin.id}")
	private String adminId;
	@Value("${admin.pw}")
	private String adminPw;

	@Bean
	public static PropertySourcesPlaceholderConfigurer Properties() {
		PropertySourcesPlaceholderConfigurer configurer = new PropertySourcesPlaceholderConfigurer();

		Resource location = new ClassPathResource("admin.properties");

		configurer.setLocation(location);

		return configurer;

	}

	@Bean
	public AdminConnection adminConfig() {
		AdminConnection adminConnection = new AdminConnection();
		adminConnection.setDbAdminId(adminId);
		adminConnection.setDbAdminPw(adminPw);
		return adminConnection;
	}


}
