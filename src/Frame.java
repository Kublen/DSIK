
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Frame extends JFrame implements KeyListener {
	public Panel panel;

	public Frame() {
		super("Multiplayer Game");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(800, 400));
		panel = new Panel();
		add(panel);
		addKeyListener(this);
		pack();

		setLocation(100, 100);
		setVisible(true);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			panel.moveright();
		}
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			panel.moveleft();
		}
		if (e.getKeyCode() == KeyEvent.VK_UP) {
			panel.moveup();
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN) {
			panel.movedown();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
}
