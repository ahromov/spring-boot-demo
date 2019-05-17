package ua.lviv.lgs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
@Slf4j
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext appContext = SpringApplication.run(SpringBootDemoApplication.class, args);

		CustomConfiguration configuration = (CustomConfiguration) appContext.getBean("customConfiguration");

		log.info(configuration.getBean("baseBean").toString());
		log.info(configuration.getBean("customBean1").toString());
		log.info(configuration.getBean("customBean2").toString());
	}
}
