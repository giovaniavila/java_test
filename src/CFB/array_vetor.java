package CFB;

public class array_vetor {
  public static void main(String[] args){
    final int tam = 5; //const
    char[] gabarito = {'a','b','c','b','e'}; //aray
    char[] respostas = new char[tam];
    int nota = 0; //variável de incremento

    respostas[0] = 'a'; respostas[1] = 'b'; respostas[2] = 'c'; respostas[3] = 'b'; respostas[4] = 'e';

    for(int i = 0; i<gabarito.length; i++){
      if(respostas[i] == gabarito[i]){
        nota++;

      }
    }
    System.out.printf("nota do aluno: %d", nota);     
  }
}
