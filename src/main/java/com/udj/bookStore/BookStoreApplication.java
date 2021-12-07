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
public class BookStoreApplication implements CommandLineRunner {

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category politica = new Category("Política", "fique por dentro das atualidades");

		Book governoX = new Book("GovernoX", "Bruno", "História dos governos", politica);
		Book capitalismo = new Book("capitalismo", "marx", "Marx comunista fdp", politica);

		politica.getBooks().addAll(Arrays.asList(governoX, capitalismo));

		categoryRepository.save(politica);
		bookRepository.saveAll(Arrays.asList(governoX, capitalismo));
	}
}
