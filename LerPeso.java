import javax.swing.JOptionPane;

public class LerPeso{
   public static void main(String[] args){
      double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso: "));
      
      JOptionPane.showMessageDialog(null, "O peso informado foi: " + peso);
   }
}