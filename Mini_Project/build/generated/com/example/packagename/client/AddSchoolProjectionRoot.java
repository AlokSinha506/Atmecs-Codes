package com.example.packagename.client;

import com.netflix.graphql.dgs.client.codegen.BaseProjectionNode;

public class AddSchoolProjectionRoot extends BaseProjectionNode {
  public AddSchoolProjectionRoot stars() {
    getFields().put("stars", null);
    return this;
  }
}
