package com.example.packagename.client;

import com.netflix.graphql.dgs.client.codegen.BaseProjectionNode;

public class UpdateSchoolProjectionRoot extends BaseProjectionNode {
  public UpdateSchoolProjectionRoot stars() {
    getFields().put("stars", null);
    return this;
  }
}
