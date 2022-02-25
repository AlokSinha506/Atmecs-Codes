package com.atmecs;

import java.util.List;

import com.example.packagename.DgsConstants;
import com.example.packagename.types.School;

import com.example.packagename.types.SchoolInput;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;

@DgsComponent
public class SchoolDataFetcher {	
	
	 public schoolService schoolservice;
	  @DgsData(parentType = "Query", field = "getSchool")
	  public School getSchool(@InputArgument("input") SchoolInput schoolInput) {
		  System.out.println("School Name " +schoolInput.getSchoolName() + " with " + schoolInput.getSchool_City() + " School_City") ;  
		  return schoolservice.getSchool(schoolInput.getCourses());
	  }	 
    
	  @DgsData(parentType = "Mutation", field = "addSchool")
	  public School addSchool(@InputArgument("input") SchoolInput schoolInput) {
		  System.out.println("School Name " +schoolInput.getSchoolName() + " with " + schoolInput.getSchool_City() + " School_City") ;  
		  return new School(schoolInput.getCourses());
	  }
	  @DgsData(parentType = "Mutation", field = "deleteSchool")
	  public School deleteSchool(@InputArgument("input") SchoolInput schoolInput) {		   
		  return new School(schoolInput.getCourses());
	  }
	  @DgsData(parentType = "Mutation", field = "deleteSchool")
	  public School updateSchool(@InputArgument("input") SchoolInput schoolInput) {		   
		  return new School(schoolInput.getCourses());
	  }

}
