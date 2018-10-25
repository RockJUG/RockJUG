package org.jug.littlerock.rockjug;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import static org.lightadmin.core.util.LightAdminConfigurationUtils.LIGHT_ADMINISTRATION_BACK_TO_SITE_URL;
import static org.lightadmin.core.util.LightAdminConfigurationUtils.LIGHT_ADMINISTRATION_BASE_PACKAGE;
import static org.lightadmin.core.util.LightAdminConfigurationUtils.LIGHT_ADMINISTRATION_BASE_URL;

@SpringBootApplication
public class RockjugApplication extends SpringBootServletInitializer {
	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		servletContext.setInitParameter(LIGHT_ADMINISTRATION_BASE_URL, "/admin");
		servletContext.setInitParameter(LIGHT_ADMINISTRATION_BACK_TO_SITE_URL, "http://lightadmin.org");
		servletContext.setInitParameter(LIGHT_ADMINISTRATION_BASE_PACKAGE, "org.lightadmin.administration");

		super.onStartup(servletContext);
	}
	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder builder) {
		return builder.sources(RockjugApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(RockjugApplication.class, args);
	}
}
