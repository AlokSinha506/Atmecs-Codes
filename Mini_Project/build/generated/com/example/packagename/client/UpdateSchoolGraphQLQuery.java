package com.example.packagename.client;

import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class UpdateSchoolGraphQLQuery extends GraphQLQuery {
  public UpdateSchoolGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
     return "updateSchool";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    public UpdateSchoolGraphQLQuery build() {
      return new UpdateSchoolGraphQLQuery();                                     
    }
  }
}
