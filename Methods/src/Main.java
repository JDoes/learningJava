// Gordon Bates
// gordondonphx@gmail.com
// github.com/jdoes
// started on 03/21/2020
// based on https://www.udemy.com/course/java-for-absolute-beginners under Arrays
// Purchase feeble public access cable show and exploit it



public class Main {

    //This is called the main method:
    public static void main(String[] args) {

        System.out.println(1);
        bar();
        foo();
        foo();
        System.out.println(2);
        foo();
        bar();

    }

    //This is a new method that I just now made:
    public static void foo() {

        int x = 10;
        System.out.println(x);
        System.out.println(20);
        System.out.println(30);

    }

    //This is another method that I just now made:
    public static void bar() {

        int y = 100;
        System.out.println(y);
        foo();
        System.out.println(200);

    }
}
