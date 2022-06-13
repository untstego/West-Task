package loops;


public class Task1 {
    public static String calcFactorialFromArray(long x) {

        if (x <= 0) {
            return "Incorrect number entered";
        }

        long resultLong = 1;
        StringBuilder builder = new StringBuilder();

        for (int i = 1; i <= x; i++) {
            resultLong = resultLong * i;
            builder.append(i + " * ");

            if (resultLong < 0) {
                builder.append("= Attention! An overflow has occurred!   ");
                break;
            }
        }

        builder.replace(builder.length() - 2, builder.length(), "= " + resultLong);

        return builder.toString();
    }




    public static String calcFactorialFromRecursion(long x) {

        if (x <= 0) {
            return "Incorrect number entered";
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= x; i++) {
            builder.append(i + " * ");
        }
        builder.replace(builder.length() - 2, builder.length(), "= " + calcInside(x));

        return builder.toString();
    }

    public static long calcInside(long x) {
        if (x == 1) {
            return 1;
        }
        return x * calcInside(x - 1);
    }


}
