public class Rational
{
  private int numerator;
  private int denominator;

  public Rational(int numerator, int denominator)
  {
    this.numerator = numerator;
    this.denominator = denominator;
  }

  public String getRational()
  {
    return numerator + "/" + denominator;
  }
  public double getDecimal()
  {
    return (double) numerator / (double) denominator;
  }
  public double getGCF()
  {
    int gcd = 0;
    for (int i = 1; i <= numerator && i <= denominator; i++)
    {
      if(numerator % i ==0 && denominator % i == 0)
      {
        gcd = i;
      }
    }
    return gcd;
  }
  public String toString()
  {
    double reduceNum = numerator / getGCF();
    double reduceDen = denominator / getGCF();
    return numerator + "/" + denominator + " equals " + getDecimal() +  "\nand reduces to " + (int) reduceNum + "/" + (int) reduceDen;
  }
}








