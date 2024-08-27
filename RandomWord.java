package hello;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) { 

        for (int i = 1; true; i++) {
            if(StdIn.isEmpty()){
                //  System.out.println(1/i);
                break;
            }
            String words=StdIn.readString();
           
            if(StdRandom.bernoulli(1/i)){
                StdOut.println(words);
            }
           
        }
    }
}
