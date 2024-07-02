package sber.spring.aspect.SpringAspect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringAspectApplication implements CommandLineRunner {

	@Autowired
	private ApplicationContext applicationContext;

	public static void main(String[] args) {
		SpringApplication.run(SpringAspectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		JustClass js = applicationContext.getBean(JustClass.class);
//		js.againAndAgain(null);
//		js.shizofrenia(null, null, null);
	}
}
