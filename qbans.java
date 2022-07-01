import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ArithmeticOperations extends JFrame {
  JLabel lblNum1, lblNum2, lblResult; // JLabels
	JTextField txtNum1, txtNum2, txtResult; // JTextFields
	JButton btnAdd;//Jbutton
  int num1, num2, result; // integer values for computation purposes
	
	public ArithmeticOperations() {
		
		super("Arithmetic Operations"); // Setting Window Title via Super Constructor
		//setTitle("Arithmetic Operations"); // Setting Windows Title via setTitle Method
		
		// Instantiate JLables
		lblNum1 = new JLabel("Enter num1: ", SwingConstants.RIGHT);
		lblNum2 = new JLabel("Enter num2: ", SwingConstants.RIGHT);
		lblResult = new JLabel("Result: ", SwingConstants.RIGHT);
		// Instantiate JTextFields
		txtNum1 = new JTextField("0",10);
		txtNum2 = new JTextField("0",10);
		txtResult = new JTextField("0",10);
		txtResult.setEditable(false); // This makes txtResult uneditable by the user
		
		// Instantiate JButtons
		btnAdd = new JButton("+");
    
		add(lblNum1); //(1,1)
		add(txtNum1); //(1,2)
		add(lblNum2); //(2,1)
		add(txtNum2); //(2,2)
		add(btnAdd);
    add(lblResult); //(6,1)
		add(txtResult); //(6,2)
    
    btnAdd.addActionListener(e -> {
			num1 = Integer.parseInt(txtNum1.getText());
			num2 = Integer.parseInt(txtNum2.getText());
			result = num1 + num2;
			txtResult.setText(result+"");
		});
    
    public static void main(String[] args) {
		new ArithmeticOperations();
	}
}
