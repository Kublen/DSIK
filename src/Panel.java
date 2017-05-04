import java.awt.*;
import java.awt.geom.*;

import javax.swing.JPanel;

public class Panel extends JPanel {
	public Panel() {
		setPreferredSize(new Dimension(400, 400));
	}

	public int x = 200;
	public int y = 200;

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		Rectangle2D rectangle = new Rectangle2D.Double(x, y, 100, 100);
		g2d.draw(rectangle);
	}

	public void moveup() {
		y = y - 10;
		repaint();
	}

	public void movedown() {
		y = y + 10;
		repaint();
	}

	public void moveleft() {
		x = x - 10;
		repaint();
	}

	public void moveright() {
		x = x + 10;
		repaint();
	}
}
