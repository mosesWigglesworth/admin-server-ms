package com.stc.admin.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.wavefront.WavefrontProperties.Application;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

//@SpringBootApplication
//@EnableAdminServer
//public class AdminServerMsApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(AdminServerMsApplication.class, args);
//	}
//
//}

@SpringBootApplication
@EnableAdminServer
public class AdminServerMsApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

}