package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

public class Student {
  private String name;
  private Integer rollNumber;
  private HashSet<Subject> subjects = new HashSet<>();

  public Student(String name, int rollNumber) {
    this.name = name;
    this.rollNumber = rollNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getRollNumber() {
    return rollNumber;
  }

  public void setRollNumber(Integer rollNumber) {
    this.rollNumber = rollNumber;
  }

  public HashSet<Subject> getSubjects() {
    return subjects;
  }

  public void setSubjects(HashSet<Subject> subjects) {
    this.subjects = subjects;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Student student = (Student) o;
    return rollNumber == student.rollNumber;
  }

  @Override
  public int hashCode() {
    return Objects.hash(rollNumber);
  }
}
