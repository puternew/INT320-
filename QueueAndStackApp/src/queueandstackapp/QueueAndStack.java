/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueandstackapp;

import java.util.ArrayList;

/**
 *
 * @author acer
 */
public class QueueAndStack<N> implements Stack<N>, Queue<N>{

     private ArrayList<N> items;

    public QueueAndStack() {
        this.items = new ArrayList<N>();
    }
    
    @Override
    public void push(N item) {
        this.items.add(item);
    }

    @Override
    public N pop() {
        return this.items.remove(this.size()-1);
    }

    @Override
    public void enqueue(N item) {
        this.items.add(item);
    }

    @Override
    public N dequeue() {
        return this.items.remove(0);
    }

    @Override
    public N top() {
        return this.items.get(this.size()-1);
    }

    @Override
    public N front() {
        return this.items.get(0);
    }
    
    @Override
    public int size() {
        return this.items.size();
    }
    
    @Override
    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    @Override
    public String toString() {
        return "QueueAndStack{" + "items=" + items + '}';
    }

    public ArrayList<N> getItems() {
        return items;
    }
    
    
    
    
    
}
