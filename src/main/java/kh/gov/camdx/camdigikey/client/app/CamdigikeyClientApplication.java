package kh.gov.camdx.camdigikey.client.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan(basePackages = {"kh.gov.camdx.camdigikey.client"})
@EnableJpaRepositories(basePackages = {"kh.gov.camdx.camdigikey.client"})
@EntityScan(basePackages = {"kh.gov.camdx.camdigikey.client"})
@EnableScheduling
public class CamdigikeyClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(CamdigikeyClientApplication.class, args);
    }

}
