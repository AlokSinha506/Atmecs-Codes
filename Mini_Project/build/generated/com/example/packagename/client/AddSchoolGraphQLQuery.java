package com.example.packagename.client;

import com.example.packagename.types.SchoolInput;
import com.netflix.graphql.dgs.client.codegen.GraphQLQuery;
import java.lang.Override;
import java.lang.String;
import java.util.HashSet;
import java.util.Set;

public class AddSchoolGraphQLQuery extends GraphQLQuery {
  public AddSchoolGraphQLQuery(SchoolInput input, Set<String> fieldsSet) {
    super("mutation");
    if (input != null || fieldsSet.contains("input")) {
        getInput().put("input", input);
    }
  }

  public AddSchoolGraphQLQuery() {
    super("mutation");
  }

  @Override
  public String getOperationName() {
     return "addSchool";
                    
  }

  public static Builder newRequest() {
    return new Builder();
  }

  public static class Builder {
    private Set<String> fieldsSet = new HashSet<>();

    private SchoolInput input;

    public AddSchoolGraphQLQuery build() {
      return new AddSchoolGraphQLQuery(input, fieldsSet);
               
    }

    public Builder input(SchoolInput input) {
      this.input = input;
      this.fieldsSet.add("input");
      return this;
    }
  }
}
