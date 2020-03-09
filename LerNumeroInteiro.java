import javax.swing.JOptionPane;

public class LerNumeroInteiro{
   public static void main(String [] args){
      int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
      
           
      JOptionPane.showMessageDialog(null,"O valor do nuúmero digitado é: " + n1); 
   }
}