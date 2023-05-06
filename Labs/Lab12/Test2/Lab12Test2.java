public class Lab12Test2 {
    public static void main(String[] args) {
        SequentialIncrementer seqInt = new SequentialIncrementer();
        
        RandomIncrementer ranInt = new RandomIncrementer();
        
        System.out.println("Initially, seqInt: " + seqInt.getValue());
        
        System.out.println("Initially, ranInt: " + ranInt.getValue());
        
        Incrementable[] integers = { seqInt, ranInt };
        
        for (int i = 0; i < integers.length; i++) {
            System.out.println("Inside the loop, " + integers[i]);
            integers[i].increment();
        }
        
        System.out.println("After the loop, seqInt: " + seqInt.getValue());
        
        System.out.println("After the loop, ranInt: " + ranInt.getValue());
        
        ((Incrementable) seqInt).increment();
        
        ((Incrementable) ranInt).increment();
        
        System.out.println("After increment, seqInt: " + seqInt.getValue());
        
        System.out.println("After increment, ranInt: " + ranInt.getValue());
    }
}
