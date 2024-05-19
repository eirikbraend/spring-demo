package org.eirik;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {

		String s = "2";
		if (s.equals(2)) {
			System.out.println("nogo");
		}
		
		SpringApplication.run(SpringDemoApplication.class, args);
	}

}
