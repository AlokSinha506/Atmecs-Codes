package com.example.packagename.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class SchoolInput {
  private String SchoolName;

  private String School_City;

  private String Courses;

  public SchoolInput() {
  }

  public SchoolInput(String SchoolName, String School_City, String Courses) {
    this.SchoolName = SchoolName;
    this.School_City = School_City;
    this.Courses = Courses;
  }

  public String getSchoolName() {
    return SchoolName;
  }

  public void setSchoolName(String SchoolName) {
    this.SchoolName = SchoolName;
  }

  public String getSchool_City() {
    return School_City;
  }

  public void setSchool_City(String School_City) {
    this.School_City = School_City;
  }

  public String getCourses() {
    return Courses;
  }

  public void setCourses(String Courses) {
    this.Courses = Courses;
  }

  @Override
  public String toString() {
    return "SchoolInput{" + "SchoolName='" + SchoolName + "'," +"School_City='" + School_City + "'," +"Courses='" + Courses + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SchoolInput that = (SchoolInput) o;
        return java.util.Objects.equals(SchoolName, that.SchoolName) &&
                            java.util.Objects.equals(School_City, that.School_City) &&
                            java.util.Objects.equals(Courses, that.Courses);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(SchoolName, School_City, Courses);
  }

  public static com.example.packagename.types.SchoolInput.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String SchoolName;

    private String School_City;

    private String Courses;

    public SchoolInput build() {
                  com.example.packagename.types.SchoolInput result = new com.example.packagename.types.SchoolInput();
                      result.SchoolName = this.SchoolName;
          result.School_City = this.School_City;
          result.Courses = this.Courses;
                      return result;
    }

    public com.example.packagename.types.SchoolInput.Builder SchoolName(String SchoolName) {
      this.SchoolName = SchoolName;
      return this;
    }

    public com.example.packagename.types.SchoolInput.Builder School_City(String School_City) {
      this.School_City = School_City;
      return this;
    }

    public com.example.packagename.types.SchoolInput.Builder Courses(String Courses) {
      this.Courses = Courses;
      return this;
    }
  }
}
