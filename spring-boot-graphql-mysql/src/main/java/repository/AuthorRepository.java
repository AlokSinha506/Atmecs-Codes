package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
