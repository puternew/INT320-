/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorter;

import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 *
 * @author INT303
 */
public class Teser {
    private static final int Size = 300_000;
    public static void main(String[] args) {
        Integer[] data = new Integer[Size];
        Integer[] data2 = new Integer[Size];
        Random r = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = r.nextInt(10000);
            data[i] = i;
        }
        System.arraycopy(data, 0, data2, 0, data.length);
//        System.out.println("Original order : ");
//        printArray(data);
        long before = System.currentTimeMillis();
        Arrays.parallelSort(data2);
        long duration = System.currentTimeMillis()-before;
        
        before = System.currentTimeMillis();
        Sorter.insertionSort(data);
        long duration2 = System.currentTimeMillis()-before;
        
        System.out.println("Parallel sort : "+duration+" millseconds");
        System.out.println("Insertion sort : "+duration2+" millseconds");
        
        
//        Sorter.insertionSort(data, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o2-o1;
//            }
//        });
//        
//        
//        System.out.println("After sorted : ");
//        printArray(data);
    }
    
    private static void printArray(Integer[] data){
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%2d%s",data[i],(i+1)%10==0?"\n":"\t");
        }
        System.out.println("");
    }
}
