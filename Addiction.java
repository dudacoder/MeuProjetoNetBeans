// Figura 14.2: Addition.java 
// Programa de adição que utiliza JOptionPane para entrada e saída. 
import javax.swing.JOptionPane; // programa utiliza JOptionPane 

public class Addition { 
    // método principal
    public static void main(String[] args) { 
        // exibe um diálogo de entrada e retorna o valor digitado pelo usuário
        String firstNumber = JOptionPane.showInputDialog("Enter first integer"); 
        String secondNumber = JOptionPane.showInputDialog("Enter second integer"); 
        
        // converte String em valores int para utilização em um cálculo
        int number1 = Integer.parseInt(firstNumber); 
        int number2 = Integer.parseInt(secondNumber); 
        
        // soma os números
        int sum = number1 + number2; 
        
        // exibe o resultado em um diálogo de mensagem
        JOptionPane.showMessageDialog(null, "The sum is " + sum, "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE); 
    } 
}
