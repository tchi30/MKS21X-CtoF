//The function celsiusToFahrenheight should have one double c as a parameter, which is a degree value in celsius.
//The function fahrenheitToCelsius should have one double f as a parameter, which is a degree value in fahrenheight.
//Both functions should be of the type double, since they are returning a double value (since doubles are more precise than ints, they would be better to use.)
//The functions should both return a double.

public class CtoFTester {

  public static double celsiusToFahrenheight (double c){
    return (((9.0 / 5.0) * c) + 32);
  }

  public static double fahrenheitToCelsius (double f){
    return ((5.0/9.0) * (f - 32));
  }
  public static void main(String[] args) {
    System.out.println(celsiusToFahrenheight (15.0));
    System.out.println(celsiusToFahrenheight (3.5));
    System.out.println(fahrenheitToCelsius (32.7));
  }
}
