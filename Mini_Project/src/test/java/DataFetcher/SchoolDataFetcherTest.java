package DataFetcher;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.example.packagename.types.School;
import com.example.packagename.types.SchoolInput;





public class SchoolDataFetcherTest {
	
	 @InjectMocks
	 SchoolDataFetcher schooldatafetcher;
	 
	 @Mock
		public SchoolRepository schoolrepo;
	 
	 @BeforeEach
		void setUp() throws Exception {
			MockitoAnnotations.initMocks(this);
		}
	 @Test
	 void testgetSchool() {
		 School school=new School();
		 SchoolInput schoolInput= new SchoolInput();
		 school.setStars("5");
		 schoolInput.setCourses("abd");
		 when(schoolrepo.findAll()).thenReturn((Iterable<School>) school);
	     //School s= schooldatafetcher.getSchool(schoolInput);
		 School s =schooldatafetcher.updateSchool(schoolInput);
	     assertNotNull(s);
	     assertEquals("5",s.getStars());
		 
		 
		 
	 }
}
