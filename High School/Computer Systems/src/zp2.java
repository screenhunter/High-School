import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Path2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class zp2 extends JPanel {

	public static int[][] edges;
	public static double[][] coor;
	public static ArrayList<Path2D.Double> quad;
	public static BufferedReader in;
	public static int N, M;

	public static void main(String[] args) throws IOException {

		JFrame frame = new JFrame();
		frame.setTitle("Lab");
		frame.setSize(500, 500);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		Container contentPane = frame.getContentPane();
		contentPane.add(new zp2());
		frame.setVisible(true);

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2d = (Graphics2D) g.create();
		
		g2d.setColor(Color.BLACK);
		
		for (Path2D.Double p : quad)
			g2d.fill(p);

		g2d.dispose();
	}

	public static String fix(String s) {

		return s.trim().replaceAll(" +", " ");

	}

}
