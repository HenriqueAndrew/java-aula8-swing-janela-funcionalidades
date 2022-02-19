//Aula 8 - Adicionando Funcionalidades a Botoes utilizando Interface ActionListener

package janela;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Janela implements ActionListener {
    private static JTextField entrada1= new JTextField(20);
    private static JButton bt1= new JButton("Clique aqui");
    private static JFrame jan1= new JFrame("Título da Janela");
    private static JLabel rot1= new JLabel("Nome");
    private static Janela cj= new Janela();
 
    public static void main(String[] args) {
        int larg= 300, alt=250;
        jan1.setSize(larg,alt);
        jan1.add(rot1);
        jan1.add(entrada1);
        bt1.setMnemonic('C');
        jan1.add(bt1);
        jan1.setLayout(new FlowLayout());
        jan1.setVisible(true);
        bt1.addActionListener(cj);
    }// Fim do método Main  
    
    public void actionPerformed(ActionEvent evt){
      Object obj = evt.getSource();
      
      if(obj.equals(bt1)){
          String frase = "Eu te amo!!!";
          jan1.setVisible(true);
          JOptionPane.showMessageDialog(null,"" + frase, "Exibição de Dados", JOptionPane.INFORMATION_MESSAGE);          
      }//fim do if
    }//fim do metodo ActionPerformed
}//fim da classe
