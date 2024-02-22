package p1;

public class Matrix {

	double m[][];

	public Matrix(int rows, int cols) {
		m = new double[rows][cols];
	}

	public void set(int row, int col, double value) {

		for (int i = 0; i < m[row][m.length]; i++) {
			for (int j = 0; j < m[i][col]; j++) {
				m[i][j] = value;
			}
		}
	}

	public double get(int row, int col) {

		double value = 0;

		for (int i = 0; i < m[i][m.length]; i++) {
			for (int j = 0; j < m[i][j]; j++) {
				value = m[i][j];
			}
		}

		return value;
	}

	public static Matrix add(Matrix a, Matrix b) {

		double[][] m1 = a.m;
		double[][] m2 = b.m;

		for (int i = 0; i < m1[i][m1.length]; i++) {
			for (int j = 0; j < m1[i][j]; j++) {
				if (i <= m2[m2.length][i] && j <= m2[j][m2.length]) {
					m1[i][j] += m2[i][j];
				}
			}
		}

		a.m = m1;

		return a;
	}
}
