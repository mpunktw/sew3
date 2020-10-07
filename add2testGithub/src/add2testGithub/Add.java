package add2testGithub;

import java.util.Scanner;

public class Add {
  public static void main(String[] args) {
    int s1;
    int s2;
    
    Scanner sc = new Scanner(System.in);
    
    try {
      System.out.print("S1   : ");
      s1 = sc.nextInt();
      
      System.out.print("S2   : ");
      s2 = sc.nextInt();
      
      System.out.println("Summe: " + (s1 + s2));
    }
    catch (Exception e) {
      System.out.println("Nur Zahlen eingeben!");
    }
  }
}
