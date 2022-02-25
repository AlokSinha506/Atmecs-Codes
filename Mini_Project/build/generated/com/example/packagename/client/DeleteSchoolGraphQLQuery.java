package com.example.packagename.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class DeleteSchoolGraphQLQuery extends GraphQLQuery {
  public DeleteSchoolGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
     return "deleteSchool";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    public DeleteSchoolGraphQLQuery build() {
      return new DeleteSchoolGraphQLQuery();                                     
    }
  }
}
