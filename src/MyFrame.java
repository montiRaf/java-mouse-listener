import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	private JButton b = new JButton("Clicca qui!");
	private MyMouseListener listener = new MyMouseListener();
	
	public MyFrame() {
		super("Mouse");
		init();
	}
	
	private void init() {
		Container c = this.getContentPane();
		c.add(b);
		
		b.addMouseListener(listener);
		this.setSize(200, 300);
		this.setLocationRelativeTo(null);
	}
}
