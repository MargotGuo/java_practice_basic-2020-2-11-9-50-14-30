package com.thoughtworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Teacher {
  private String name;
  private Student[] students;

  public Teacher(String name, Student[] students) {
    this.name = name;
    this.students = students;
  }

  public List<Student> checkDuplicates() {
    List<Student> allStudent = Arrays.asList(students);
    List<Student> duplicateStudents = new ArrayList<>();
    for(Student student : students) {
      if(allStudent.indexOf(student) != allStudent.lastIndexOf(student)) {
        duplicateStudents.add(student);
      }
    }
    return duplicateStudents;
  }
}
