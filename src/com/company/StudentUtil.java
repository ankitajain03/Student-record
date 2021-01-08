package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class StudentUtil {
  static Scanner scanner = new Scanner(System.in);
  static HashSet<Student> students = new HashSet<>();

  public static void printDataForOneStudent(Student student) {
    System.out.println("=========================================================================");
    System.out.println("name : " + student.getName() + ", rollNumber : " + student.getRollNumber());
    for (Subject subject: student.getSubjects()) {
      System.out.println("Subject : " + subject.getSubCode() + ", Marks : " + subject.getMarks());
    }
    System.out.println("=========================================================================");
  }

  public static void printCompleteStudentRecords(){
    for (Student student: students) {
      printDataForOneStudent(student);
    }
  }

  public static void addAStudentRecord() {
    System.out.println("Please enter the name of student : ");
    String name = scanner.next();
    System.out.println("Please enter the roll number of student : ");
    int rollNumber = scanner.nextInt();
    Student student = new Student(name, rollNumber);
    if (students.contains(student)) {
      System.out.println("Student already exists!");
    } else {
      students.add(student);
    }
  }

  public static void addMultipleStudentRecords() {
    System.out.println("Add number of student records : ");
    int numberOfStudents = scanner.nextInt();
    for (int i = 0; i < numberOfStudents; i++) {
      StudentUtil.addAStudentRecord();
    }
  }

  public static void addASubjectToAStudentRecord() {
    System.out.println("Please enter the roll number of student : ");
    int rollNumber = scanner.nextInt();
    boolean found = false;
    for (Student student :students) {
      if (student.getRollNumber().equals(rollNumber)){
        Subject subject = new Subject();
        System.out.println("Please enter subject code : ");
        subject.setSubCode(scanner.next());
        System.out.println("Please enter marks : ");
        subject.setMarks(scanner.nextInt());
        student.getSubjects().add(subject);
        found = true;
      }
    }
    if (!found) {
      System.out.println("Student with this roll number doesn't exist, please add student to the records first.");
    }
  }

  public static void findStudentsForASubjectCode() {
    System.out.println("Please enter subject Code : ");
    String subCode = scanner.next();
    for (Student student : students) {
      if (student.getSubjects().stream().anyMatch(subject -> subject.getSubCode().equalsIgnoreCase(subCode))){
        printDataForOneStudent(student);
      }
    }


  }
}
