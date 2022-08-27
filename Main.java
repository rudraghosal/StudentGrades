import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList; 
class Main {
  public static void main(String[] args) throws Exception {
    ArrayList<Double> studentGrades = new ArrayList<>();
    ArrayList<Student> allStudents = new ArrayList<>();
    double g1 = 0;
    double g2 = 0;
    double g3 = 0;
    double g4 = 0;
    double g5 = 0;
    String studentName = "";
    int count=0;
    File file = new File("grades.txt");
    Scanner sc = new Scanner(file);
    
  
    while(sc.hasNext())
      {
        String next = sc.next();
        char ch = next.charAt(1);
        if(Character.isDigit(ch) == false)
        {
          studentName = next;
          //System.out.println(studentName);
        }
        else if(Character.isDigit(ch))
        {
          g1 = Double.parseDouble(next);
          g2 = Double.parseDouble(sc.next());
          g3 = Double.parseDouble(sc.next());
          g4 = Double.parseDouble(sc.next());
          g5 = Double.parseDouble(sc.next());   
          
        }

        else
        {
          break;
        }

        //System.out.println("" + studentName + " " + g1 + " " + g2 + " " + g3 + " " + g4 + " " + g5);

        Student newStudent = new Student(studentName, g1, g2, g3, g4, g5);
        allStudents.add(newStudent);
        //System.out.println(allStudents);
        

          

        //System.out.println(studentGrades);
       // Student newStudent = new Student(studentName, studentGrades);

        //System.out.println(newStudent);
        
      }
    //System.out.println("" + g1 + g2 + g3 + g4 +g5);

    //System.out.println(studentName);
    //System.out.println(allStudents);
    System.out.println(allStudents.toString());
    
  
  }
}
