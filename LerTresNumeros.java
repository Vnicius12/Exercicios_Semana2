import javax.swing.JOptionPane;

public class LerTresNumeros{
   public static void main(String [] args){
      
      JOptionPane.showMessageDialog(null,"Digite uma data:");
      int d = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia: "));
      int m = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês: "));
      int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: "));
      
      String resultado = d + "/" + m + "/" + a;
      
      JOptionPane.showMessageDialog(null, "A data digitada foi: " + resultado);
   }
}