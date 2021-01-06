package by.mjc.core;

import by.mjc.dziadkouskaya.StringUtils;

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
