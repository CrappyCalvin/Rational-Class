import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter the numerator:");
    int numerator = input.nextInt();
    System.out.println("Enter the denominator");
    int denominator = input.nextInt();
    Rational fraction = new Rational(numerator, denominator);
    System.out.println(fraction);
  }
}
//test