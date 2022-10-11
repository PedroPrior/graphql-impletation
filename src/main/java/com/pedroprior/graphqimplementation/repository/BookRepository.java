package com.pedroprior.graphqimplementation.repository;
import com.pedroprior.graphqimplementation.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
