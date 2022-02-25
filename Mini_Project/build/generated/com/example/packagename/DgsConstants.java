package com.example.packagename;

import java.lang.String;

public class DgsConstants {
  public static final String QUERY_TYPE = "Query";

  public static class QUERY {
    public static final String TYPE_NAME = "Query";

    public static final String GetSchool = "getSchool";
  }

  public static class MUTATION {
    public static final String TYPE_NAME = "Mutation";

    public static final String AddSchool = "addSchool";

    public static final String DeleteSchool = "deleteSchool";

    public static final String UpdateSchool = "updateSchool";
  }

  public static class SCHOOLINPUT {
    public static final String TYPE_NAME = "SchoolInput";

    public static final String SchoolName = "SchoolName";

    public static final String School_City = "School_City";

    public static final String Courses = "Courses";
  }

  public static class SCHOOL {
    public static final String TYPE_NAME = "School";

    public static final String Stars = "stars";
  }
}
