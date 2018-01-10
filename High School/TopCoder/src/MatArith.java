import java.util.HashMap;

public class MatArith {

	public final String[] empty = new String[0];
	public int cur;
	public HashMap<Character, Matrix> map;
	public String eq;

	public String[] calculate(String[] A, String[] B, String[] C,
			String equation) {

		cur = 68;
		map = new HashMap<Character, Matrix>();
		eq = equation;
		
		map.put('A', new Matrix(A));
		map.put('B', new Matrix(B));
		map.put('C', new Matrix(C));

		int index = eq.indexOf('*');
		while (index >= 0) {
			
			Matrix inter = multiply(index - 1, index + 1);
			if (inter == null)
				return empty;
			map.put((char) cur, inter);
			eq = eq.substring(0, index - 1) + (char)cur + eq.substring(index + 2);
			cur++;
			index = eq.indexOf('*');

		}
		
		index = eq.indexOf('+');
		while (index >= 0) {

			Matrix inter = add(index - 1, index + 1);
			if (inter == null)
				return empty;
			map.put((char) cur, inter);
			eq = eq.substring(0, index - 1) + (char)cur + eq.substring(index + 2);
			cur++;
			index = eq.indexOf('+');

		}
		
		return getAns(map.get(eq.charAt(0)));

	}

	private String[] getAns(Matrix matrix) {
		
		String[] ans = new String[matrix.N];
		
		for (int i = 0; i < matrix.N; i++) {
			
			String temp = "";
			for (int j = 0; j < matrix.M; j++)
				temp += " " + (int)matrix.mat[i][j];
			ans[i] = temp.substring(1);
			
		}
		
		return ans;
		
	}

	private Matrix multiply(int num1, int num2) {

		Matrix a = map.get(eq.charAt(num1));
		Matrix b = map.get(eq.charAt(num2));

		if (a.M != b.N)
			return null;

		Matrix c = new Matrix(a.N, b.M);

		for (int i = 0; i < a.N; i++)
			for (int j = 0; j < b.M; j++)
				for (int k = 0; k < a.M; k++) {

					c.mat[i][j] += a.mat[i][k] * b.mat[k][j];
					if (c.mat[i][j] > Integer.MAX_VALUE)
						return null;

				}

		return c;

	}

	private Matrix add(int num1, int num2) {

		Matrix a = map.get(eq.charAt(num1));
		Matrix b = map.get(eq.charAt(num2));

		if (a.M != b.M || a.N != b.N)
			return null;

		Matrix c = new Matrix(a.N, b.M);

		for (int i = 0; i < a.N; i++)
			for (int j = 0; j < b.M; j++) {

				c.mat[i][j] += a.mat[i][j] + b.mat[i][j];
				if (c.mat[i][j] > Integer.MAX_VALUE)
					return null;

			}

		return c;

	}

}

class Matrix {

	public String rep[];
	public int N, M;
	public double[][] mat;

	public Matrix(String[] s) {

		rep = s;
		N = s.length;
		M = s[0].split(" ").length;
		mat = new double[N][M];

		convert();

	}

	public Matrix(int a, int b) {

		N = a;
		M = b;
		rep = new String[N];
		mat = new double[N][M];

	}

	private void convert() {

		String[] temp;
		for (int i = 0; i < N; i++) {

			temp = rep[i].split(" ");
			for (int j = 0; j < M; j++)
				mat[i][j] = Double.parseDouble(temp[j]);

		}

	}

}