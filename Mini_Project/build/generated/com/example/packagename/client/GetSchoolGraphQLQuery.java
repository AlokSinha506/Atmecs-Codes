package com.example.packagename.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class GetSchoolGraphQLQuery extends GraphQLQuery {
  public GetSchoolGraphQLQuery() {
    super("query");
  }

  @Override
  public String getOperationName() {
     return "getSchool";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    public GetSchoolGraphQLQuery build() {
      return new GetSchoolGraphQLQuery();                                     
    }
  }
}
