package p10_19;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

public class HousePic extends JComponent
{

	public void paintComponent(Graphics g)
	{
	//Drawing the outer frame of House, Door, Window
//		g.fillRect(100, 0, 200, 200);
		g.setColor(Color.PINK);
		g.fillRect(300, 400, 200, 200);
		
//		g.fillRect(120, 0, 40, 120);
		g.setColor(Color.RED);
		g.fillRect(320, 480, 70, 120);
	
		
//		g.fillRect(230, 50, 40, 40);
		g.setColor(Color.RED);
		g.fillRect(430, 520, 40, 40);

		
	//Drawing the shade of the House
		
//		g.drawLine(100, 200, 200, 300);
//		g.drawLine(200, 300, 300, 200);
		
		g.setColor(Color.BLUE);
		g.drawLine(300, 400, 400, 300);
		g.setColor(Color.BLUE);
		g.drawLine(400, 300, 500, 400);
		
	}
	
}


-----------------------------------------------------------------------------------------------------------------------

package p10_19;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class DrawHousePic {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		
		frame.setSize(400,  400);
		frame.setTitle("Picture of a House drawin using JAVA GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JComponent component = new HousePic();
		frame.add(component);
		
		frame.setVisible(true);

	}

}
