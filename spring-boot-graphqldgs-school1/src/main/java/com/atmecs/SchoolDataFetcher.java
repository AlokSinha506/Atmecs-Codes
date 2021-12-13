package com.atmecs;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.example.packagename.types.School;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.DgsMutation;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import com.netflix.graphql.dgs.internal.InputObjectMapper;

import graphql.schema.DataFetchingEnvironment;

@DgsComponent
public class SchoolDataFetcher {	
	  @DgsData(parentType = "Mutation", field = "addSchool")
	  public School addSchool(@InputArgument("input") SchoolInput schoolInput) {
		  System.out.println("School Name " +schoolInput.getSchool_Name() + " with " + schoolInput.getSchool_City() + " School_City") ;  
		  return new School(schoolInput.getCourses);
	  }
 }
	
		  
		  
	



