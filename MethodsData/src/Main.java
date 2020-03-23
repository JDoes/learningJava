// Gordon Bates
// gordondonphx@gmail.com
// github.com/jdoes
// started on 03/21/2020
// based on https://www.udemy.com/course/java-for-absolute-beginners under Arrays
// Purchase feeble public access cable show and exploit it

public class Main {

    public static void main(String[] args) {
        //These next two lines do the same thing:
        System.out.println(coneVol(4, 5));
        System.out.println(Math.PI * 4 * 4 * 5 / 3);


    }

    public static double coneVol(double r, double h){
        return Math.PI *r *r *h / 3;
    }


}

//    public static int add(int a, int b) {
//        return a + b;
//
//    }

//============================================================

//public class Main {
//
//    public static void main(String[] args) {
//        foo(10);
//        System.out.println(bar());
//        System.out.println("Finished...");
//    }
//
//    public static void foo(int a) {
//        if (a < 5) {
//            return;
//        }
//        System.out.println(a);
//    }
//
//    public static double bar() {
//        return 49.5;
//    }
//}

//====================================================================

//public class Main {
//
//    public static void main(String[] args) {
//        int var;
//        var = 5;
//        foo(var, 57.5, " caramel ");
//
//
//    }
//
//    public static void foo(int a, double b, String c) {
//        // The "+" is doing two things here:
//        // When it's a+b, it is doing arithmetic.
//        // When it is +c, it is concatinating the
//        // string caramel with the arithmetic of a+b.
//        System.out.println(a + b + c);
//
//    }
//}
