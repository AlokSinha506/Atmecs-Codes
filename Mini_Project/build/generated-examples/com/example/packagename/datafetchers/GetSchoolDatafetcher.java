package com.example.packagename.datafetchers;

import com.example.packagename.types.School;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import graphql.schema.DataFetchingEnvironment;

@DgsComponent
public class GetSchoolDatafetcher {
  @DgsData(
      parentType = "Query",
      field = "getSchool"
  )
  public School getGetSchool(DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
