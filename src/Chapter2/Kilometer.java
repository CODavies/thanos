package Chapter2;

public class Kilometer {
    public static void main(String[] args) {
        double miles = 100;
        double KILOMETERS_PER_MILE = 1.609;
        double kilometers = miles * KILOMETERS_PER_MILE;

        System.out.println(kilometers);

        int b = 10;
        int c = 2;
        int a = b % c;
        double e = 5.0;
        int f = c;
        double d = e % f;
        System.out.println(a);
        System.out.println(d);
        System.out.println();
        System.out.println(Math.pow(f, 3));
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.pow(2, 3.5));
        System.out.println();
        System.out.println(56 % 6);
        System.out.println(78 % -4);
        System.out.println(-34 % 5);
        System.out.println(-34 % -5);
        System.out.println(5 % 1);
        System.out.println(1 % 5);
        System.out.println();
        System.out.println(2 * (5 / 2 + 5 / 2));
        System.out.println(2 * 5 / 2 + 2 * 5 / 2);
        System.out.println(2 * (5 / 2));
        System.out.println(2 * 5 / 2);
        System.out.println();
        System.out.println("25 / 4 is " + 25 / 4);
        System.out.println("25 / 4.0 is " + 25 / 4.0);
        System.out.println("3 * 2 / 4 is " + 3 * 2 / 4);
        System.out.println("3.0 * 2 / 4 is " + 3.0 * 2 / 4);


        int m = 3;
        int r = 2;
        System.out.println(m * (Math.pow(r, 2.7)));
        System.out.println();
        System.out.println(0B1111);
        System.out.println(071111);
        System.out.println();
    }
    {
        int r = 2;
        int a = 4;
        int b = 5;
        int c = 1;
        int d = 7;
        int e = 4/(3* (r +34));
        int f= 9 * (a +(b*c));
        int g = 3 + (d*(2 +a));
        int h = a + (b*d);
        int i = a - f + (g/h);
        System.out.println(i);
        System.out.println();
        int t = 3;
        double s = r + 2.5;
        double u = 2.5 + t;
        System.out.println(u);
        System.out.println(5.5 * (Math.pow(s,u)));

    }
}
