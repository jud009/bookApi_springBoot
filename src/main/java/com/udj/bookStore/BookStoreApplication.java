package com.udj.bookStore;

import com.udj.bookStore.domain.Book;
import com.udj.bookStore.domain.Category;
import com.udj.bookStore.repository.BookRepository;
import com.udj.bookStore.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class BookStoreApplication {
	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}
}
