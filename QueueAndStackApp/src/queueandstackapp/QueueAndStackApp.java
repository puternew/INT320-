/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueandstackapp;

import java.util.Arrays;
import java.util.Scanner;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author acer
 */
public class QueueAndStackApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QueueAndStack<String> box = new QueueAndStack<>();
        System.out.println("BOX LUCKY ORB");
        System.out.print("Size: " + box.size());
        System.out.println(" (" + (box.isEmpty() ? "Box is empty" : "Not empty") + ")");
        box.enqueue("Red orb");
        box.enqueue("Yellow orb");
        box.enqueue("Blue orb");
        System.out.println("Enqueue:>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        ReturnOn(box);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Front is: " + box.front());
        System.out.println("Top is: " + box.top());
        box.push("Orange orb");
        box.push("Green orb");
        box.push("Purple orb");
        System.out.println("Push:>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        ReturnOn(box);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Front: " + box.front());
        System.out.println("Top: " + box.top());
        System.out.print("Size: " + box.size());
        System.out.println(" (" + (box.isEmpty() ? "Empty" : "Not Empty") + ")");
        ReturnOn(box);
        Scanner sc = new Scanner(System.in);
        int select;
        while (box.size() != 0) {

            System.out.print("\nSelect Enqueue or Push? (input (1)(2)) >> ");
            select = sc.nextInt();
            if (select == 1) {
                System.out.println("Pop: " + box.pop());
                ReturnOn(box);
                System.out.print("Size: " + box.size());
            } else if (select == 2) {
                System.out.println("Dequeue: " + box.dequeue());
                ReturnOn(box);
                System.out.print("Size: " + box.size());
            } else {
                System.out.println("----- Error -----");
                ReturnOn(box);
            }
        }
        System.out.print("Size: " + box.size());
        System.out.println(" (" + (box.isEmpty() ? "Empty" : "Not Empty") + ")");
    }

    public static void ReturnOn(QueueAndStack box) {
        for (Object boxs : box.getItems()) {
            if (box.getItems().get(box.size() - 1).equals(boxs)) {
                System.out.println(boxs);
            } else {
                System.out.print(boxs + ", ");
            }
        }
    }

}
