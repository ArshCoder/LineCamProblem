package linecomparison;

public class LineEquality {
	double distance1(int x1, int y1, int x2, int y2) {
		double dist;
		dist = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		return dist;

	}

	public static void main1(String[] args) {
		LineCampare object = new LineCampare();
		Double Line1 = object.distance(1, 2, 3, 4);
		Double Line2 = object.distance(5, 6, 7, 8);
		System.out.println("Line Equality of Line1 and Line2 : " + Line1.equals(Line2));

	}

}
