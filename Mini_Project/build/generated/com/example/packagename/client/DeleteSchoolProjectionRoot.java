package com.example.packagename.client;

import com.netflix.graphql.dgs.client.codegen.BaseProjectionNode;

public class DeleteSchoolProjectionRoot extends BaseProjectionNode {
  public DeleteSchoolProjectionRoot stars() {
    getFields().put("stars", null);
    return this;
  }
}
