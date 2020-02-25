package warmup.t1;


public class Formatter1 extends Formatter0 {

    String s;

    @Override
     void print(String a, Formatter0 f) {
        s = a.toLowerCase();
        System.out.println(s);
    }
}
