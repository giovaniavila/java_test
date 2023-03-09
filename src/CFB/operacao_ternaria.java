package CFB;

public class operacao_ternaria {
  public static void main(String[] args){
    int nota = 85;
    int media = 60;
    String res;

    res= (nota >= media ? "aprovado" : "reprovado");
    System.out.println("resultado: " + res);
  }
}
