package CFB;

public class switch_ {
  public static void main(String[] args){
    int pos = 4;

    switch (pos) {
      case 1:
        System.out.println("primeiro lugar");
        break;

      case 2:
        System.out.println("segundo lugar");
        break;

      case 3:
        System.out.println("terceiro lugar");
        break;

      case 4: case 5: case 6:
        System.out.println("premio de participação");
        break;

      default: System.out.println("não subiu ao pódio");
        break;
    }
  }
}
