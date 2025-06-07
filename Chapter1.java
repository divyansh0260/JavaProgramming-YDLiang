public class Chapter1 {

    public static void main(String[] args) {
        System.out.println("QUESTION 1");           question1();
        System.out.println("\n\nQUESTION 2");       question2();
        System.out.println("\n\nQUESTION 3");       question3();
        System.out.println("\n\nQUESTION 4");       question4();
        System.out.println("\n\nQUESTION 5");       question5();
        System.out.println("\n\nQUESTION 6");       question6();
        System.out.println("\n\nQUESTION 7");       question7();
        System.out.println("\n\nQUESTION 8");       question8();
        System.out.println("\n\nQUESTION 9");       question9();
        System.out.println("\n\nQUESTION 10");      question10();
        System.out.println("\n\nQUESTION 11");      question11();
        System.out.println("\n\nQUESTION 12");      question12();
    }

    public static void question1() {
        System.out.println("Welcome to Java\nWelcome to Computer Science\nProgramming is Fun!");
    }

    public static void question2() {
        System.out.println("Welcome to Java!");
        System.out.println("Welcome to Java!");
        System.out.println("Welcome to Java!");
        System.out.println("Welcome to Java!");
        System.out.println("Welcome to Java!");
    }

    public static void question3() {
        System.out.println("   J     A    V      V   A");
        System.out.println("   J    A A    V    V   A A");
        System.out.println("J  J   AAAAA    V  V   AAAAA");
        System.out.println(" JJ   A     A    V    A     A");
    }

    public static void question4() {
        System.out.println("a\ta^2\ta^3");
        for (int i = 1; i <= 4; i++) {
            System.out.println(i + "\t" + (int) Math.pow(i, 2) + "\t" + (int) Math.pow(i, 3));
        }
    }

    public static void question5() {
        System.out.println("Answer: "+((9.5 * 4.5) - (2.5 * 3)) / (45.5 - 3.5));
    }

    public static void question6() {
        int sum = 0;
        for (int i = 1; i < 10; i++) sum += i;
        System.out.println("Sum: " + sum);
    }

    public static void question7() {
        double pi = 0;
        for (int i = 1, a = 1; i < 6; i++, a += 2) {
            pi = (i % 2 != 0) ? (pi + 1.0 / a) : (pi - 1.0 / a);
        }
        System.out.println("Approximate PI(upto 1/11): " + (4 * pi));
        System.out.println("Approximate PI(upto 1/13): " + ((4 * pi) + (1.0 / 13.0)));
    }

    public static void question8() {
        double w = 4.5, h = 7.9, area = w * h;
        double perimeter = 2 * (w + h);
        System.out.println("Width: " + w + "\nHeight: " + h);
        System.out.println("Area: " + area + "\nPerimeter: " + perimeter);
    }

    public static void question9() {
        double km = 14.0, time = 45 / 60.0 + 30 / 3600.0, miles = km / 1.6;
        //learnt about system.out.format can be used as printf in C which also could have been used here
        System.out.format("Average speed in miles per hour: %.2f\n", miles / time);
    }

    public static void question10() {
        System.out.println("Given Data:\n+1 in 7s\n-1 in 13s\n+1 in 45s");
        System.out.println("Population increase every second: " + 1.0 / 39.0);
        System.out.println("Population increase in 1825days: " + (1.0 / 39.0) * 86400 * 1825);
        System.out.println("Final Population after 1825days: " + Math.floor((1.0 / 39.0) * 86400 * 1825 + 312032486));
    }

    public static void question11() {
        double miles = 24, km = miles * 1.6;
        double time = 1 + (40 / 60.0) + (35 / 3600.0);
        System.out.printf("Average speed in km/h: %.2f\n", km / time);
    }

    public static void question12() {
        double a = 3.4, b = 50.2, e = 44.5;
        double c = 2.1, d = 0.55, f = 5.9;
        double dr = a * d - b * c;
        double x = (e * d - b * f) / dr;
        double y = (a * f - e * c) / dr;
        System.out.printf("x = %.4f\ny = %.4f\n", x, y);
    }
}
