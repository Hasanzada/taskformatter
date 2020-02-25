package warmup.t3;

public class Formatter3 extends Formatter0 {

    String s;

    Formatter3(String s){
        super(s);
        StringBuilder builder = new StringBuilder();
        builder.append("**********\n");
        builder.append("  *   ");
        builder.append(s);
        builder.append("   *\n");
        builder.append("  **********\n");
        this.s = builder.toString();
    }

    @Override
    public String toString() {
        return "s='" + s + '\'';
    }
}
