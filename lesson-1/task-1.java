/*Реализуйте 3 метода, чтобы в каждом из них получить разные исключения*/

class Main {  
  public static void main(String args[]) { 
    f3();
  } 

  public static void f1() {
    Thread.currentThread().setPriority(-1000);
  }/* Exception in thread "main" java.lang.IllegalArgumentException*/

  public static void f2() {
    int a = 4;
    while( 4 == a ) {
      f2();
    }
  }/*Exception in thread "main" java.lang.StackOverflowError*/

  public static void f3() {
    String s = "Bond007";
    Integer.parseInt(s);
  }/*Exception in thread "main" java.lang.NumberFormatException: For input string: "Bond007"*/
}