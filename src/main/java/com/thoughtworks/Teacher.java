package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
  private String name;
  private List<Student> students;

  public Teacher(String name, List<Student> students) {
    this.name = name;
    this.students = students;
  }

  public List<Student> checkDuplicates() {
    List<Student> duplicateStudents = new ArrayList<>();
    for(Student student : students) {
      if(students.indexOf(student) != students.lastIndexOf(student)) {
        duplicateStudents.add(student);
      }
    }
    return duplicateStudents;
  }
}
