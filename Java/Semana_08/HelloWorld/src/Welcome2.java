import javax.swing.JOptionPane;

public class Welcome2 {
  public static void init() {
    String firstNumber;
    String secondNumber;
    int n1,n2,sum;

    firstNumber = JOptionPane.showInputDialog("Enter first integer");
    secondNumber = JOptionPane.showInputDialog("Enter second integer");

    n1 = Integer.parseInt(firstNumber);
    n2 = Integer.parseInt(secondNumber);

    sum = n1 + n2;

    JOptionPane.showMessageDialog(null, "The sum is: " + sum, "Results", JOptionPane.INFORMATION_MESSAGE);

    System.exit(0);
  }
}
