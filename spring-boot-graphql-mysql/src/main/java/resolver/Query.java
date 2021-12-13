package resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLQueryResolver;
import model.Author;
import model.Tutorial;
import repository.AuthorRepository;
import repository.TutorialRepository;
@Component
public class Query implements GraphQLQueryResolver{
	  private AuthorRepository authorRepository;
	  private TutorialRepository tutorialRepository;

	  @Autowired
	  public Query(AuthorRepository authorRepository, TutorialRepository tutorialRepository) {
	    this.authorRepository = authorRepository;
	    this.tutorialRepository = tutorialRepository;
	  }

	  public Iterable<Author> findAllAuthors() {
	    return authorRepository.findAll();
	  }

	  public Iterable<Tutorial> findAllTutorials() {
	    return tutorialRepository.findAll();
	  }

	  public long countAuthors() {
	    return authorRepository.count();

}
	  public long countTutorials() {
		    return tutorialRepository.count();
		  }
}
