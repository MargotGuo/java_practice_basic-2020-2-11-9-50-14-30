package com.thoughtworks;

import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

public class App {

  public static void main(String[] args) throws ParseException {
    Student ZhangSan = new Student("张三", "001", "2019.02.11");
    Student LiSi = new Student("李四", "002", "2019.02.10");
    Student WangWu = new Student("王五", "001", "2019.02.09");

    Teacher ZhangLong = new Teacher("张龙", Arrays.asList(ZhangSan, LiSi, WangWu));
    List<Student> duplicateStudents = ZhangLong.checkDuplicates();
    duplicateStudents.forEach(System.out::println);
  }
}
