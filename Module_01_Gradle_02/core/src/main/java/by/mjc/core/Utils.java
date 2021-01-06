package by.mjc.core;

public class Utils {

   public static boolean isAllPositiveNumbers(String... str) {
        for (String arg : str) {
            boolean isPositive = StringUtils.isPositiveNumber(arg);

            if (!isPositive) {
                return false;
            }
        }
        return true;
    }
}
