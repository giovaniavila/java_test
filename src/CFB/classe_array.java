package CFB;

import java.util.Arrays;

public class classe_array {
  public static void main(String[] args){
    final int tam = 5; 
    int[] num = {9,3,4,23,6};
    int[] numeros = new int[tam];

    //o método sort ordena os elementos do array
    Arrays.sort(num);

    //Arrays.fill serve para preencher a array com determinado elemento
    Arrays.fill(numeros, 10);

    //copiar arrays uma para outra => source, posição, destino, posição de destino, numero de elementos
    System.arraycopy(num, 0, numeros, 0, tam);

    //Arrays equals serve para comparar as duas arrays => ? (if) "sim" (true) :(else) "não" (false)
    Arrays.equals(num, numeros);
    System.out.printf("Arrays são iguais: %s", Arrays.equals(num, numeros) ? "sim " : "não ");

    // for para trabalhar com arrays, cada elemento da variavel num é incrementada no "n"
    //serve para LER os elementos de um array, não para adicionar elementos;
    for(int n:numeros){
      System.out.printf("%d  ", n);
    }
  }
}


