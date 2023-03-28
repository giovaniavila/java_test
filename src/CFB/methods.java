package CFB;

public class methods {
    public static void main(String[] args){

        for(int i=0; i<10; i++){
            canal();
        }

        canal(); //** o método só funcionará caso seja chamado no método principal main */

    }

    public static void canal(){             
        /* canal é um método */
        System.out.println("testando o método");
    }
}

