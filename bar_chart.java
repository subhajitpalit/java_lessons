package p10_30;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JComponent;

public class BarChartComponent extends JComponent
{
private ArrayList<Double> values;
private double maxValue;

public BarChartComponent(double max)
{
  values = new ArrayList<Double>();
  maxValue = max;
}

//public void append(double value)
//{
//values.add(value);
//repaint();
//}

public void paintComponent(Graphics g)
{
 final int GAP = 5;
 final int BAR_HEIGHT = 10;
 
 values.add(4200.0);
 values.add(1595.0);
 values.add(2150.0);
 values.add(3800.0);
 
 int y = GAP;
 for (double value: values)
 {
	int barWidth = (int) ((getWidth()*value)/maxValue);
	g.setColor(Color.BLUE);
	g.fillRect(0,  y,  barWidth,  BAR_HEIGHT);
	y = (y + BAR_HEIGHT + GAP);
 } 
}

}



--------------------------------------------------------------------------------------------------------------------

package p10_30;

import javax.swing.JComponent;
import javax.swing.JFrame;

import p10_19.HousePic;

public class BarChartViewer {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		
		frame.setSize(400,  400);
		frame.setTitle("BAR Chart using JAVA GUI");	
		JComponent component = new BarChartComponent(4200.0);
		frame.add(component);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
