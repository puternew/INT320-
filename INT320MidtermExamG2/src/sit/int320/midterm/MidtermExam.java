/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int320.midterm;

import com.sun.javafx.binding.StringFormatter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import javafx.print.Collation;

public class MidtermExam {

    

    public static String infixToPostfix(String exp) {
        StringBuilder result = new StringBuilder(128);
        return result.toString().trim();
    }

    public static Object[] arrayUnion(Object[] obj1, Object[] obj2) {
        return arrayUnion(obj1, obj2, null);
    }

    public static Object[] arrayUnion(Object[] obj1, Object[] obj2, Comparator c) {
        Set setA;
        if (c == null) {
            setA = new TreeSet();
        } else {
            setA = new TreeSet(c);
        }
        setA.addAll(Arrays.asList(obj1));
        setA.addAll(Arrays.asList(obj2));
        return setA.toArray();
    }

    static class StringCompareIgnoreCase implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            return o1.compareToIgnoreCase(o2);
        }

    }

    public static void main(String[] args) {
        String[] a = {"A", "b", "c", "D"};
        String[] b = {"a", "b", "C", "D"};
        System.out.println(Arrays.toString(arrayUnion(a, b)));
        System.out.println(Arrays.toString(arrayUnion(a, b, new StringCompareIgnoreCase())));

    }
    public static String getTopMostNumber(int[] numbers) {
        int key;
        Map <Integer,KeyAndPositions> freq = new HashMap();
        for (int i = 0; i < numbers.length; i++) {
            key = numbers[i];
            if (freq.get(key)== null) {
                freq.put(key, new KeyAndPositions(key, i));
            } else {
                freq.get(key).addPosition(i);
            }
        }
        List<KeyAndPositions> listSort = new ArrayList(freq.values());
        Collections.sort(listSort);
        KeyAndPositions mosNumber = listSort.get(0);
        
        
        return String.format("%d (%d) : %s",mosNumber.key,mosNumber.position.size(),mosNumber.position);
    }
    
    
    

}
class KeyAndPositions implements Comparable<KeyAndPositions>{
        int key;
        List <Integer> position = new ArrayList(20);
        
        public KeyAndPositions(int key, int position){
            this.key = key;
            this.position.add(position);
        }
        
        public void addPosition(int position){
            this.position.add(position);
        }

        @Override
        public int compareTo(KeyAndPositions o) {
            int first = o.position.size()-this.position.size();
            if (first != 0) {
                return first;
            }
            return this.key-o.key;
        }
    }