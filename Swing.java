import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ArithmeticOperations extends JFrame {
	/*
	 * Only 3 Swing Components are required in this activity namely:
	 * (a) JLabel
	 * (b) JTextField
	 * (c) JButton
	 */
	
	JLabel lblNum1, lblNum2, lblResult; // JLabels
	JTextField txtNum1, txtNum2, txtResult; // JTextFields
	JButton btnAdd, btnSub, btnMul, btnDiv, btnMod, btnDef; // JButtons
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
		btnSub = new JButton("-");
		btnMul = new JButton("*");
		btnDiv = new JButton("/");
		btnMod = new JButton("%");
		btnDef = new JButton("Cancel");
		
		/*
		 * We need a Layout Manager to arrange the JLabels, JTextFields, and JButtons.
		 * There are around 10 Layout Managers out there but we will use GridLayout.
		 */
		
		setLayout(new GridLayout(6, 2)); // Based on the sample JFrame, there are 6 rows and 2 columns
		
		add(lblNum1); //(1,1)
		add(txtNum1); //(1,2)
		add(lblNum2); //(2,1)
		add(txtNum2); //(2,2)
		add(btnAdd); //(3,1)
		add(btnSub); //(3,2)
		add(btnMul); //(4,1)
		add(btnDiv); //(4,2)
		add(btnMod); //(5,1)
		add(btnDef); //(5,2)
		add(lblResult); //(6,1)
		add(txtResult); //(6,2)
		
		// Add Action Listeners to all the Buttons (via Lambda Expressions)
		btnAdd.addActionListener(e -> {
			num1 = Integer.parseInt(txtNum1.getText());
			num2 = Integer.parseInt(txtNum2.getText());
			result = num1 + num2;
			txtResult.setText(result+"");
		});
		
		btnSub.addActionListener(e -> {
			num1 = Integer.parseInt(txtNum1.getText());
			num2 = Integer.parseInt(txtNum2.getText());
			result = num1 - num2;
			txtResult.setText(result+"");
		});
		
		btnMul.addActionListener(e -> {
			num1 = Integer.parseInt(txtNum1.getText());
			num2 = Integer.parseInt(txtNum2.getText());
			result = num1 * num2;
			txtResult.setText(result+"");
		});
		
		btnDiv.addActionListener(e -> {
			num1 = Integer.parseInt(txtNum1.getText());
			num2 = Integer.parseInt(txtNum2.getText());
			result = num1 / num2;
			txtResult.setText(result+"");
		});
		
		btnMod.addActionListener(e -> {
			num1 = Integer.parseInt(txtNum1.getText());
			num2 = Integer.parseInt(txtNum2.getText());
			result = num1 % num2;
			txtResult.setText(result+"");
		});
		
		btnDef.addActionListener(e -> System.exit(0));
		
		// Finishing Touches...
		setVisible(true); // This is to make JFrame VISIBLE because it is invisible by default
		setSize(300, 250); // This is to set the size of the JFrame Window
		setResizable(false); // This is to not make the JFrame resizable
		setLocationRelativeTo(null); // This is to make the JFrame appear at middle of screen 
		setDefaultCloseOperation(EXIT_ON_CLOSE); // This is for the [x] button
	}
	
	public static void main(String[] args) {
		new ArithmeticOperations();
	}
}
