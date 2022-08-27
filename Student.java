import java.util.ArrayList;

public class Student {
  public static ArrayList<Double> grades = new ArrayList<Double>();
  private String name;
  private double grade1;
  private double grade2;
  private double grade3;
  private double grade4;
  private double grade5;

  public Student(String name, double grade1, double grade2, double grade3, double grade4, double grade5) {
    this.grade1 = grade1;
    this.grade2=grade2;
    this.grade3=grade3;
    this.grade4=grade4;
    this.grade5=grade5;
    this.name = name;
    
  }

  public String toString()
  {
    return("" + name + " " + grade1 + " " + grade2 + " " + grade3 + "  " + grade4 + " " + grade5);
  }

}
