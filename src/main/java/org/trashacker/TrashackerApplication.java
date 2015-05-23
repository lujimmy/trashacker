package org.trashacker;

import org.h2.tools.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.web.client.RestTemplate;

import java.sql.SQLException;

@SpringBootApplication
public class TrashackerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrashackerApplication.class, args);
    }

//    @Bean
//    @Profile("h2")
//    public ServletRegistrationBean h2servletRegistration() {
//        ServletRegistrationBean registration = new ServletRegistrationBean(new WebServlet());
//        new WebServlet()
//        registration.addUrlMappings("/h2/*");
//        return registration;
//    }

    @Bean(name = "h2WebServer", initMethod = "start", destroyMethod = "stop")
    @Profile("h2")
    Server createWebServer() throws SQLException {
        return Server.createWebServer("-web", "-webAllowOthers", "-webPort", "8082");
    }

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
