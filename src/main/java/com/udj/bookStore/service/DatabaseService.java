package com.udj.bookStore.service;

import com.udj.bookStore.domain.Book;
import com.udj.bookStore.domain.Category;
import com.udj.bookStore.repository.BookRepository;
import com.udj.bookStore.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Arrays;

@Service
public class DatabaseService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    public void init() {
        Category politica = new Category("Política", "fique por dentro das atualidades");

        Book governoX = new Book("GovernoX", "Bruno", "História dos governos", politica);
        Book capitalismo = new Book("capitalismo", "marx", "Marx comunista fdp", politica);

        politica.getBooks().addAll(Arrays.asList(governoX, capitalismo));

        categoryRepository.save(politica);
        bookRepository.saveAll(Arrays.asList(governoX, capitalismo));
    }
}
