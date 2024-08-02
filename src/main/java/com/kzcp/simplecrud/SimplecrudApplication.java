package com.kzcp.simplecrud;

import com.kzcp.simplecrud.entity.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class SimplecrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimplecrudApplication.class, args);
	}

}
