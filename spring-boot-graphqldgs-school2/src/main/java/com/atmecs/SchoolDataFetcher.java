package com.atmecs;

import com.example.packagename.types.School;
import com.example.packagename.types.SchoolInput;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.InputArgument;

@DgsComponent
public class SchoolDataFetcher {	
	  @DgsData(parentType = "Mutation", field = "addSchool")
	  public School addSchool(@InputArgument("input") SchoolInput schoolInput) {
		  System.out.println("School Name " +schoolInput.getSchoolName() + " with " + schoolInput.getSchool_City() + " School_City") ;  
		  return new School(schoolInput.getCourses());
	  }

}
