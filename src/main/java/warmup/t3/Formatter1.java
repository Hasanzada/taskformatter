package warmup.t3;


public class Formatter1 extends Formatter0 {

    String s;

    Formatter1(String s){
        super(s);
        this.s = s.toLowerCase();
    }

    @Override
    public String toString() {
        return "s='" + s + '\'';
    }
}
