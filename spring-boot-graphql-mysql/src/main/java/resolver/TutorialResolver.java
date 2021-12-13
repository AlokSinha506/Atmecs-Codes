package resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLResolver;
import model.Author;
import model.Tutorial;
import repository.AuthorRepository;

@Component
public class TutorialResolver implements GraphQLResolver<Tutorial> {
	 @Autowired
	  private AuthorRepository authorRepository;

	  public TutorialResolver(AuthorRepository authorRepository) {
	    this.authorRepository = authorRepository;
	  }

	  public Author getAuthor(Tutorial tutorial) {
	    return authorRepository.findById(tutorial.getAuthor().getId()).orElseThrow(null);
	  }
	

}
