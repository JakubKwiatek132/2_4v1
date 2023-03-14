import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner skan = new Scanner(System.in);
    System.out.println("Kalkulator");
    
    while (true) {
      System.out.println("1.Dodawanie 2.Odejmowanie 3.Mnożenie 4:Dzielenie");
      int wybor = skan.nextInt();
      System.out.println("Podaj liczbe a:");
      float a = skan.nextFloat();
      System.out.println("Podaj liczbe b:");
      float b = skan.nextFloat();
      
      switch (wybor) {
        case 1:
          System.out.println(a + b);
          break;
        case 2:
          System.out.println(a - b);
          break;
        case 3:
          System.out.println(a * b);
          break;
        case 4:
          System.out.println(a / b);
          break;
        default:
          System.out.println("Nieprawidłowy wybor");
          break;
      }
    }
  }
}