/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueandstackapp;

/**
 *
 * @author acer
 */
public interface Stack<N> {
    public void push(N item);

    public N pop();
    
    public N top();

    int size();

    boolean isEmpty(); 

}
