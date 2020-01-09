package com.breeze.eurekaclient;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientApplication.class, args);
	}

}

@RestController
@RefreshScope
@Slf4j
class VodConfigController {

	@Autowired
	private VodConfig vodConfig;

	@GetMapping("/vod/config")
	public VodConfig config() {
		log.info("###### vod config - {}", vodConfig);
		return vodConfig;
	}

	@GetMapping("/")
	public String home() {
		log.info("### Hello Test APP !!");
		return "Hello !!!";
	}
}

@Configuration
class VodClientConfiguration {

	@Bean
	@ConfigurationProperties(prefix = "streaming.cdn")
	public VodConfig vodConfig() {
		return new VodConfig();
	}
}
