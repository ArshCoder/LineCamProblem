package linecomparison;

public class LineCampared {
	double distance(int x1, int y1, int x2, int y2) {
		double dist;
		dist = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		return dist;

	}

	public static void main(String[] args) {
		LineCampared object = new LineCampared();
		Double Line1 = object.distance(1, 2, 3, 4);
		Double Line2 = object.distance(1, 2, 3, 4);
		if (Double.compare(Line1, Line2)==0) {
			System.out.println("Two lines are equal");
		}
		else if (Double.compare(Line1, Line2) < 0);{
			System.out.println("Line1 is less than Line2");
		}
		else


			System.out.println("Line1 is Greater than Line2");

	}

}
