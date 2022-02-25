package com.example.packagename.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class School {
  private String stars;

  public School() {
  }

  public School(String stars) {
    this.stars = stars;
  }

  public String getStars() {
    return stars;
  }

  public void setStars(String stars) {
    this.stars = stars;
  }

  @Override
  public String toString() {
    return "School{" + "stars='" + stars + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School that = (School) o;
        return java.util.Objects.equals(stars, that.stars);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(stars);
  }

  public static com.example.packagename.types.School.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String stars;

    public School build() {
      com.example.packagename.types.School result = new com.example.packagename.types.School();
          result.stars = this.stars;
          return result;
    }

    public com.example.packagename.types.School.Builder stars(String stars) {
      this.stars = stars;
      return this;
    }
  }
}
