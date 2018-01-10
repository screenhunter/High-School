import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Path2D;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class zp {

	private JFrame mainMap;
	private Polygon poly;
	public static int[][] edges;
	public static double[][] coor;
	public static ArrayList<Path2D.Double> quad;
	public static BufferedReader in;
	public static int N, M;

	public zp() {
		initComponents();
	}
	
	public static String fix(String s) {

		return s.trim().replaceAll(" +", " ");

	}

	public void input() throws IOException {

		quad = new ArrayList<Path2D.Double>();

		in = new BufferedReader(new FileReader("xy00009.txt"));

		M = Integer.parseInt(fix(in.readLine()));
		coor = new double[M][2];

		for (int i = 0; i < M; i++) {

			String[] line = fix(in.readLine()).split(" ");

			for (int j = 0; j < 2; j++)
				coor[i][j] = Double.parseDouble(line[j + 1]) * 500;

		}

		in.close();

		in = new BufferedReader(new FileReader("el00009.txt"));

		N = Integer.parseInt(fix(in.readLine()));
		edges = new int[N][4];

		for (int i = 0; i < N; i++) {

			Path2D.Double path = new Path2D.Double();
			String[] line = fix(in.readLine()).split(" ");
			for (int j = 0; j < 4; j++) {

				edges[i][j] = Integer.parseInt(line[j]);
				boolean check = true;
				if (edges[i][j] >= 0)
					if (check) {
						path.moveTo(coor[edges[i][j]][0], coor[edges[i][j]][1]);
						check = false;
					} else
						path.lineTo(coor[edges[i][j]][0], coor[edges[i][j]][1]);

			}

			path.closePath();

			quad.add(path);

		}

		in.close();

	}

	private void initComponents() {

		mainMap = new JFrame();
		mainMap.setResizable(false);

		mainMap.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		int xPoly[] = { 150, 250, 325, 375, 450, 275, 100 };
		int yPoly[] = { 150, 100, 125, 225, 250, 375, 300 };

		poly = new Polygon(xPoly, yPoly, xPoly.length);

		JPanel p = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.setColor(Color.BLUE);
				g.drawPolygon(poly);
			}

			@Override
			public Dimension getPreferredSize() {
				return new Dimension(800, 600);
			}
		};

		MouseAdapter ma = new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent me) {
				super.mouseClicked(me);

				if (poly.contains(me.getPoint())) {
					System.out.println("Clicked polygon");
				}

			}
		};
		p.addMouseListener(ma);// add listener to panel
		mainMap.add(p);

		mainMap.pack();
		mainMap.setVisible(true);

	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new zp();
			}
		});
	}
}