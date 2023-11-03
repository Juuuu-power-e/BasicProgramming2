public class UnitConverter {

    private static double lb = 2.2046;
    private static double cm = 30.48;

    public static double toPound(double d) {
        return lb * d;
    }

    public static double toKilogram(double d) {
        return d / lb;
    }

    public static double toFeet(double d) {
        return d / cm;
    }

    public static double toCentimeter(double d) {
        return cm * d;
    }
}
