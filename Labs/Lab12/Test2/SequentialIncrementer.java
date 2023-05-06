public class SequentialIncrementer implements Incrementable {
    private int seqInt;

    public SequentialIncrementer() {
        seqInt = 0;
    }

    public void increment() {
        seqInt++;
    }

    public int getValue() {
        return seqInt;
    }
}
