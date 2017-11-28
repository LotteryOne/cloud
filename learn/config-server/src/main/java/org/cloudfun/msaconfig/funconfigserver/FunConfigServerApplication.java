package org.cloudfun.msaconfig.funconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class FunConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FunConfigServerApplication.class, args);
	}
}
