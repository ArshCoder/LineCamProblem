package linecomparison;

public class LineCampare {
	double distance(int x1, int y1, int x2, int y2) {
		double dist;
		dist = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		return dist;
	}

	public static void main(String[] args) {
		LineCampare object = new LineCampare();
		double ans = object.distance(1, 2, 3, 4);
		System.out.println("Distance between point is : " + ans);
	}

}
