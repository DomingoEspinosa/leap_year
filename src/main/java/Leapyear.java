public class Leapyear {
    public static boolean isLeap(int year) {
        return isDivisible(year, 100 ) ? isDivisible(year, 400) : isDivisible(year, 4);
    }

    private static boolean isDivisible(int year, int value) {
        return year % value == 0;
    }
}
