/* Name: Elysé Ntigirishari
* Student ID: 040924425
* Course & Section: CST8132_300
* Assignment: Lab 8
* Date: April 5, 2019
*/


import java.awt.EventQueue;

public class TipCalculator {
	/**
	 * Launch the application
	 */
	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			 public void run() {
                 try {
                	 TipCalculatorController frame = new TipCalculatorController();
                	 frame.setVisible(true);
                 } catch (Exception e) {
                     e.printStackTrace();
                 } 
                 
			 }
		});
	}

}