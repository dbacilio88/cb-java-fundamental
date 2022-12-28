
public class Variables {

    public static void main(String[] args) {

        /* String */
        String var = "cbacilio";
        System.out.println(var.toUpperCase());
        System.out.println(var.toLowerCase());
        System.out.println(var.length());
        System.out.println(var.substring(1));

        /* Integer */
        int i = 10;
        System.out.println("number integer: " + i);
        /* Length */
        System.out.println("MIN: " + Integer.MIN_VALUE);
        System.out.println("MAX: " + Integer.MAX_VALUE);

        /* Long */
        long l = 10;
        System.out.println("number long: " + l);
        /* Length */
        System.out.println("MIN: " + Long.MIN_VALUE);
        System.out.println("MAX: " + Long.MAX_VALUE);

        /* Shor */
        short s = 10;
        System.out.println("number short: " + s);
        /* Length */
        System.out.println("MIN: " + Short.MIN_VALUE);
        System.out.println("MAX: " + Short.MAX_VALUE);

        /* Doble */
        double d = 10;
        System.out.println("number double: " + d);
        /* Length */
        System.out.println("MIN: " + Double.MIN_VALUE);
        System.out.println("MAX: " + Double.MAX_VALUE);

        /* Float */
        float f = 10;
        System.out.println("number float: " + f);
        /* Length */
        System.out.println("MIN: " + Float.MIN_VALUE);
        System.out.println("MAX: " + Float.MAX_VALUE);
    }
}