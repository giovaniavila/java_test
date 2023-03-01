import javax.swing.JOptionPane;

public class ex {
    public static void main(String[] args){
        String n1=JOptionPane.showInputDialog("digite um número:");
        int numero = Integer.parseInt(n1);

        StringBuilder sb = new StringBuilder();
        sb.append("número: ");
        sb.append(numero);
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}