package com.pedroprior.graphqimplementation;

import com.pedroprior.graphqimplementation.entities.Author;
import com.pedroprior.graphqimplementation.entities.Book;
import com.pedroprior.graphqimplementation.repository.AuthorRepository;
import com.pedroprior.graphqimplementation.repository.BookRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class GraphqlImplementationApplication {

    public static void main(String[] args) {
        SpringApplication.run(GraphqlImplementationApplication.class, args);



        }

    @Bean
    ApplicationRunner applicationRunner(AuthorRepository authorRepository, BookRepository bookRepository) {
        return args -> {
            Author eduardo = authorRepository.save(new Author("Eduardo Henrique"));
            Author pedro = authorRepository.save(new Author("Pedro Carlos"));
            bookRepository.saveAll(List.of(
                    new Book("Kotlin in Action", "Kotlin", eduardo),
                    new Book("Algorithms", "Algorithms", pedro),
                    new Book("Learn to Study", "Study", eduardo),
                    new Book("Homo sapiens", "Yuval", pedro)
            ));
        };


    }

}
