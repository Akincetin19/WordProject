package firstProject.io.first;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@SpringBootApplication

public class FirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}

	@Bean
	public ModelMapper getModelMapper() {return new ModelMapper();}
}
