package CFB;
import java.util.Scanner;

public class scanner {
  public static void main(String[] args){
    try (Scanner scan = new Scanner(System.in)) {
      int n1, n2 = 0, res = 0;
      String nome = "";

      System.out.println("digite seu nome:");
      nome = scan.nextLine();

      System.out.println("digite um numeral:");
      n1 = scan.nextInt();

      System.out.println("digite outro numeral:");
      n2 = scan.nextInt();

      res = n1 + n2;
      System.out.printf("%s, a soma de %d com %d é igual a %d",nome,n1,n2,res);
    }
  }
}
