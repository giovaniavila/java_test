package CFB;
import java.security.SecureRandom;

public class matrizes {
  //matriz é uma array de arrays
  // a cada posição de uma array, cria-se uma outra array

  public static void main(String[] args){
    final int linhas = 3;
    final int colunas = 5;
    //[0,1,2,4,5,],[0,1,2,4,5,],[0,1,2,4,5,] três linhas com 5 elementos em cada
    // dois índices [][] indica a criação de uma matriz
    int[][] numeros = new int[linhas][colunas];
    int [][] num = {{2,43,54,6},{2,43,56,76,90},{32,52,534,6}}; //desse modo é possivel criar as matrizes com seus respectivo valores já inclusos''

    for(int l = 0; l<linhas; l++){
      for(int c = 0; c < colunas; c++){
        numeros[l][c] = new SecureRandom().nextInt(100);
      }
    }

    for(int l = 0; l<linhas; l++){
      for(int c = 0; c < colunas; c++){
        System.out.printf("%n", numeros[l][c]);
      }
    }

  }
}
