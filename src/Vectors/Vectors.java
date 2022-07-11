package Vectors;

import java.util.Arrays;

public class Vectors {
    public static void main(String[] args) {

        char[] source = {'a','b','c','d','e','f','g','h'};  //masive
        char[] destination = new char[10];

        System.arraycopy(source,2,destination,0,3);

        System.out.println(destination);

        char[] copyOfrange = Arrays.copyOfRange(source, 0, 4);
        System.out.println(copyOfrange);

        char[] anotherCopyOfrange = Arrays.copyOfRange(source,3,6);
        System.out.println(anotherCopyOfrange);

        char[] outCopyOfrange = Arrays.copyOfRange(source,4,10);
        System.out.println(outCopyOfrange);

        Arrays.fill(destination,'e');
        System.out.println(destination);

        System.out.println(Arrays.binarySearch(source,'c')); //direct metoda in metoda, cool
        System.out.println(destination);



    }
}
