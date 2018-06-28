package com.klaus.configuration.center;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigurationCenter {
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(ConfigurationCenter.class);
		application.setBannerMode(Banner.Mode.CONSOLE);
		application.run(args);
	}
}
