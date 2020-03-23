// Gordon Bates
// gordondonphx@gmail.com
// github.com/jdoes
// started on 03/21/2020
// based on https://www.udemy.com/course/java-for-absolute-beginners under Methods
// Purchase feeble public access cable show and exploit it


public class Main {

    public static void main(String[] args) {

        int a = 16;
        int b = a;
        b = 91;

        int [] x = {3, 22, 45, 1, 8};
//        int [] y = new int[5];
//        x = y;

        int [] d = foo(x);
        d[4] = 35;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println();

        for (int i = 0; i < x.length; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
    public static int[] foo (int[] c) {
        c[1] = 50;
        return c;
    }
}


//
//        System.out.println();
//        System.out.println("The memory address for x is: " + x);
//        System.out.println("The memory address for y is: " + y);

//        System.out.println();
//        for (int i = 0; i < y.length; i++) {
//            System.out.println("y[" + i + "] = " + y[i]);
//        }