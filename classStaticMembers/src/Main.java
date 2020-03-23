// Gordon Bates
// gordondonphx@gmail.com
// github.com/jdoes
// started on 03/22/2020
// based on https://www.udemy.com/course/java-for-absolute-beginners under Methods
// Purchase feeble public access cable show and exploit it


public class Main {

    static int x = 6;

    public static void main(String[] args) {

        System.out.println(x);

        foo ();
        bar ();


    }

    static void foo () {
        System.out.println(x);
        x = 10;

    }

    static void bar () {
        System.out.println(x);

    }

}
