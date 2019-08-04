package p10_12;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ShowSavingsBalance extends JFrame 
{

	private static final int FRAME_WIDTH = 450, FRAME_HEIGHT = 100;
	private static final double DEFAULT_RATE = 5, INITIAL_BALANCE = 1000, DEFAULT_PERIOD = 10;
	
	private JLabel rateLabel, balLabel, yearLabel, resultLabel;
	private JTextField rateField, balField, yearField;
	private JButton button;
	private double balance;
	private JPanel panel;
	
	public ShowSavingsBalance()
	{
	balance = INITIAL_BALANCE;
	resultLabel = new JLabel("Balance : " + balance);
	
	createTextField();
	createTextBal();
	createTextYear();
	createButton();
	createPanel();
	setSize(FRAME_WIDTH, FRAME_HEIGHT);		
	}
	
	public void createTextField()
	{
	rateLabel = new JLabel("Interest rate: ");
	final int FIELD_WIDTH = 10;
	rateField = new JTextField(FIELD_WIDTH);
	rateField.setText("" + DEFAULT_RATE);
	}
	
	
	public void createTextBal()
	{
		balLabel = new JLabel("Initial Balance: ");
		final int FIELD_WIDTH = 10;
		balField = new JTextField(FIELD_WIDTH);
		balField.setText("" + INITIAL_BALANCE);
	}
	
	public void createTextYear()
	{
		yearLabel = new JLabel("Number of Years: ");
		final int FIELD_WIDTH = 10;
		yearField = new JTextField(FIELD_WIDTH);
		yearField.setText("" + DEFAULT_PERIOD);
	}
	
	
	class AddInterestListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
		double rate = Double.parseDouble(rateField.getText());
		double interest = balance * rate / 100;
		balance = balance + interest ;
		resultLabel.setText("Balance: " + balance);	
		}	
	}
	
	private void createButton()
	{
	button = new JButton("Add Interest");
	ActionListener listener = new AddInterestListener();
	button.addActionListener(listener);
	}
	
	private void createPanel()
	{
	panel = new JPanel();
	panel.add(rateLabel);
	panel.add(rateField);
	panel.add(balLabel);
	panel.add(balField);
	panel.add(yearLabel);
	panel.add(yearField);
	panel.add(button);
	panel.add(resultLabel);
	add(panel);
		
	}

}

===========================================================
package p10_12;
import javax.swing.JComponent;
import javax.swing.JFrame;
import p10_30.BarChartComponent;

public class ViewSavingsBalance {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		JFrame frame = new ShowSavingsBalance();		
		frame.setSize(400,  400);
		frame.setTitle("BAR Chart using JAVA GUI");	
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}
