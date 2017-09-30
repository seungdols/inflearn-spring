package com.seungdols.spring.env.ex2;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

/**
 * @PACKAGE com.seungdols.spring.env.ex1
 * @AUTHOR seungdols
 * @DATE 2017. 9. 30.
 */
public class AdminConnection implements EnvironmentAware, InitializingBean, DisposableBean {

	private Environment environment;
	private String dbAdminId;
	private String dbAdminPw;

	public Environment getEnvironment() {
		return environment;
	}

	public String getDbAdminId() {
		return dbAdminId;
	}

	public void setDbAdminId(String dbAdminId) {
		this.dbAdminId = dbAdminId;
	}

	public String getDbAdminPw() {
		return dbAdminPw;
	}

	public void setDbAdminPw(String dbAdminPw) {
		this.dbAdminPw = dbAdminPw;
	}

	public void destroy() throws Exception {
		System.out.println("destroy()");
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()");
	}

	public void setEnvironment(Environment environment) {
		System.out.println("setEnvironment()");
		this.environment = environment;
	}
}
