/**
 * method that tells the user their letter grade
 * @author Darian
 */
public class Main {
  // creae examGrade method
  public static void examGrade(int num){
    // this if statement will give the user their letter grade according to their number grade
    if (num >= 80){
      System.out.println("A");
    }else if (num >= 70 && num <= 79) {
      System.out.println("B");
    }else if (num >= 60 && num <= 69) {
      System.out.println("C");
    }else if (num >= 50 && num <= 59) {
      System.out.println("D");
    }else {
      System.out.println("F");
    }
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // call out the method
    examGrade(95);
    examGrade(74);
    examGrade(68);
    examGrade(55);
    examGrade(43);
    
  }
}
