
/* Name: Elysé Ntigirishari
* Student ID: 040924425
* Course & Section: CST8132_300
* Assignment: Lab 8
* Date: April 5, 2019
*/


	import java.awt.Dimension;
	import java.awt.FlowLayout;
	import java.text.DecimalFormat;

	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JOptionPane;
	import javax.swing.JSlider;
	import javax.swing.JTextField;
	import javax.swing.event.DocumentEvent;
	import javax.swing.event.DocumentListener;

	public class TipCalculatorController extends JFrame {
		private static final long serialVersionUID = 1L;
		
		JLabel amountLabel;
		JLabel tipPercentageLabel; 
		JLabel tipLabel;
		JLabel totalLabel;
		JTextField amountTextField;
		
		/** slider that varies from 0 to 30 **/
		JSlider tipPercentageSlider;
		JTextField totalTextField;
		JButton calculateButton;
		JTextField tipTextField;
		
		/** current tip percentage **/
		int tipPercentage = 15;
		static final DecimalFormat DF = new DecimalFormat("$0.00");
		
		public TipCalculatorController() {
			super("Tip Calculator");
			int width = 290;
			int height = 220;
			this.setSize(width, height); 
			 
		    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    this.setLayout(new FlowLayout(FlowLayout.CENTER));
		    this.setLocationRelativeTo(null);
		    
		    this.amountLabel = new JLabel("Amount: ");
		    this.amountTextField = new JTextField(width/19);
		    
		    this.tipPercentageLabel = new JLabel("       " + this.tipPercentage + "% ");
		    this.tipPercentageSlider = new JSlider();
		    this.tipPercentageSlider.setValue(this.tipPercentage); 
		    this.tipPercentageSlider.setPaintTicks(true);  
		    this.tipPercentageSlider.setPaintLabels(true);
		    this.tipPercentageSlider.setPreferredSize(new Dimension(208, 30));
		    this.tipLabel = new JLabel("        Tip: ");
		    this.tipTextField = new JTextField(width/19);
		    this.totalLabel = new JLabel("     Total: ");
		    this.totalTextField = new JTextField(width/19);
		    this.calculateButton = new JButton(" Calculate ");
		    JLabel buttonLabel = new JLabel("              ");
		    this.calculateButton.setPreferredSize(new Dimension(195, 30));
		    
		    
		    this.add(this.amountLabel);
		    this.add(this.amountTextField);
		    this.add(this.tipPercentageLabel);
		    this.add(this.tipPercentageSlider);
		    this.add(this.tipLabel);
		    this.add(this.tipTextField);
		    this.add(this.totalLabel);
		    this.add(this.totalTextField);
		    this.add(buttonLabel);
		    this.add(this.calculateButton);
		    
		    this.calculateButton.addActionListener(e -> this.calculateResults());
		    this.tipPercentageSlider.addChangeListener(
		    		e -> this.setTipPercentage(this.tipPercentageSlider.getValue())
		    );
		    this.amountTextField.getDocument().addDocumentListener(new DocumentListener() {
		      public void changedUpdate (DocumentEvent e) { error(); }
		      public void removeUpdate  (DocumentEvent e) { error(); }
		      public void insertUpdate  (DocumentEvent e) { error(); }
		      public void error() {
		    	String amount = amountTextField.getText().trim();
		    	amount = amount.contains("$") ? amount.replace("$", "") : amount;
		    	if (amount != null && amount.length() > 0 && !amount.chars().allMatch(Character::isDigit)) {
		    		String message = "value for amount " + amount + " is invalid. Please enter a valid amount";
		    		JOptionPane.showMessageDialog(null, "Error: " + message, "Error Message", JOptionPane.ERROR_MESSAGE);
		    	}
		      }
		    });
		}
		
		/** 
		 * 
		 * ChangeListener for slider 
		 * @param int - current value of the slider
		 * 
		 */
		public void setTipPercentage(int value) {
			try {
				this.tipPercentage = value;
				this.tipPercentageLabel.setText("       " + this.tipPercentage + "%");
				String amount = this.amountTextField.getText().trim();
				amount = amount.contains("$") ? amount.replace("$", "") : amount;
				if (amount != null && amount.length() > 0 && amount.chars().allMatch(Character::isDigit)) {
					double percentage = Double.valueOf(this.tipPercentage) / 100;
					double tipAmount = Integer.valueOf(amount) * percentage;
					this.tipTextField.setText(DF.format(tipAmount));
				} else {
					this.tipTextField.setText("$0.00");
				}
			} catch(Exception e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error Message", JOptionPane.ERROR_MESSAGE);
			}
		}
		
		/** 
		 * 
		 * ActionListener for button 
		 * 
		 */
		public void calculateResults() {
			try {
				double total = 0.0;
				String amount = this.amountTextField.getText().trim();
				amount = amount.contains("$") ? amount.replace("$", "") : amount;
				double percentage = Double.valueOf(this.tipPercentage) / 100;
				double tipAmount = Integer.valueOf(amount) * percentage;
				total += tipAmount + Integer.valueOf(amount);
				this.tipTextField.setText(DF.format(tipAmount));
				this.totalTextField.setText(DF.format(total));
			} catch(Exception e) {
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error Message", JOptionPane.ERROR_MESSAGE);
			}
		}
		
	}

