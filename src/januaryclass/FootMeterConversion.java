package januaryclass;

public class FootMeterConversion {

	public static void main(String[] args) {
		System.out.printf("Feet\tMeters\t|  Meters\tFeet\n");

		for (int i = 1, j = 20; i <= 10; i++, j += 5) {
			System.out.printf("%2d.0\t%.3f\t|   %d.0\t%7.3f\n", i, footToMeter(i), j, meterToFoot(j));
		}

	}

	public static double footToMeter(double foot) {
		return 0.305 * foot;
	}

	public static double meterToFoot(double meter) {
		return  3.279 * meter;
	}
}
