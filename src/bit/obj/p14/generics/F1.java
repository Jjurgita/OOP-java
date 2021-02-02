package bit.obj.p14.generics;

public class F1 implements Function<Integer, String> {
    @Override
    public String function(Integer p) {
        return String.valueOf(p * 2);
    }
}
