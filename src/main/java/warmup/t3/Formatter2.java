package warmup.t3;


public class Formatter2 extends Formatter0 {
    String s;

    Formatter2(String s){
        super(s);
        this.s = s.toUpperCase();
    }

    @Override
    public String toString() {
        return "s='" + s + '\'';
    }}
