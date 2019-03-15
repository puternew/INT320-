/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int320.midterm;

import java.lang.reflect.Array;
import static java.lang.reflect.Array.set;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Midterm {

    public static String getTopMostNumber(int[] numbers) {

        return null;
    }

    public static String infixToPostfix(String exp) {
        StringBuilder result = new StringBuilder(128);
        return result.toString().trim();
    }

    public static Object[] arrayIntersection(Object[] obj1, Object[] obj2) {
        return arrayIntersection(obj1, obj2, null);
    }

    public static Object[] arrayIntersection(Object[] obj1, Object[] obj2, Comparator c) {
        Set setA,setB;
        if (c == null) {
            setA = new TreeSet();
            setB = new TreeSet();
        } else {
            setA = new TreeSet(c);
            setB = new TreeSet(c);
        }
        setA.addAll(Arrays.asList(obj1));
        setB.addAll(Arrays.asList(obj2));
        setA.retainAll(setB);
        return setA.toArray();
    }
    static class StringCompareIgnoreCase implements Comparator<String>{

        @Override
        public int compare(String o1, String o2) {
            return o1.compareToIgnoreCase(o2);
        }
   
    }
    public static void main(String[] args) {
        String[] a = {"A","b","c","D"};
        String[] b = {"a","b","C","D"};
        System.out.println(Arrays.toString(arrayIntersection(a, b)));
        System.out.println(Arrays.toString(arrayIntersection(a, b, new StringCompareIgnoreCase())));
    }
}
