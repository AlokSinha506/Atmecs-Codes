package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

}
