package DataFetcher;

import org.springframework.stereotype.Service;

import com.example.packagename.types.School;
@Service
public class schoolService {
	 public SchoolRepository schoolrepo;

public School getSchool(String courses) {
	schoolrepo.findAll();
	return null;
}
public School addSchool(String courses) {
	schoolrepo.save(addSchool(courses));
	return null;
}
public School deleteSchool(String courses) {
	schoolrepo.delete(deleteSchool(null));
	return null;
}
public School updateSchool(String courses) {
	schoolrepo.save(addSchool(courses));
	return null;
}
}
