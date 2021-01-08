package com.company;
import java.util.HashSet;
import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean isResumed = true;
    while (isResumed) {
      System.out.println("Please choose one of the options");
      System.out.println("1. Add one Student Record.");
      System.out.println("2. Add multiple Student Records.");
      System.out.println("3. Add a subject to a student record.");
      System.out.println("4. Print Students' records.");
      System.out.println("5. Find all the student for a particular subject.");
      int option = scanner.nextInt();
      switch (option) {
        case 1:
          StudentUtil.addAStudentRecord();
          break;
        case 2:
          StudentUtil.addMultipleStudentRecords();
          break;
        case 3:
          StudentUtil.addASubjectToAStudentRecord();
          break;
        case 4:
          StudentUtil.printCompleteStudentRecords();
          break;
        case 5:
          StudentUtil.findStudentsForASubjectCode();
          break;
        default:
          break;
      }
      System.out.println("Do you want to continue ? enter true/false");
      isResumed = scanner.nextBoolean();
    }
  }

}
