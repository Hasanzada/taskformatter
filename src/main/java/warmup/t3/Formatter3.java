package warmup.t3;

public class Formatter3 extends Formatter0 {

    String s;

    Formatter3(String s){
        super(s);
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 3; j++) {
                if(i == 0 || i == 9 || j == 0 || j == 2){
                    builder.append("*");
                }
            }
        }
        s = builder.toString();
    }

    @Override
    public String toString() {
        return "s='" + s + '\'';
    }
}
