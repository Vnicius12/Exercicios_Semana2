import javax.swing.JOptionPane;

public class LerTresPalavras{
   public static void main (String[] args){
      String a1 = JOptionPane.showInputDialog("Digite a primeira palavra: ");
      String a2 = JOptionPane.showInputDialog("Digite a segunda palavra: ");
      String a3 = JOptionPane.showInputDialog("Digite a terceira palavra: ");
     
      String resultado = a3 + " " + a2 + " " + a1;
     
     JOptionPane.showMessageDialog(null, resultado);
   }
}