/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Random;

/**
 *
 * @author karth
 */
public class P9_IsCircular {
    
    static class linkedlist
    {
        int a;
        linkedlist next;
        linkedlist(int a)
        {
            this.a = a;
            this.next = null;
        }
        public static void print(linkedlist root)
        {
            int i = 0;
            while(root != null & i < 20)
            {
                System.out.print(" "+root.a);
                root = root.next;
                i++;    
            }
            System.out.println();
        }
        public static void iscircle(linkedlist root)
        {
            if(root == null || root.next == null)
            {
                System.out.println("Not Circular");
                return;
            }    
            linkedlist jump1 = root.next;
            linkedlist temp = jump1;
            linkedlist jump2 = root.next.next;
            while(jump2 != null & jump2.next != null)
            {
                if(jump1 == jump2)
                {
                    System.out.print("Circular,Meet at -> ");
                    System.out.println(jump1.a);
                    jump1 = root;
                    while(jump1 != jump2)
                    {
                        temp = jump2;
                        jump1 = jump1.next;
                        jump2 = jump2.next;
                    }
                    temp.next = null;
                    System.out.println("Circular,Starting point -> " + jump1.a);
                    return;
                }
                temp = jump1;
                jump1 = jump1.next;
                jump2 = jump2.next.next;
            }
            System.out.println("Not Circular");
        }
        
    }
    public static void main(String args[])
    {
        linkedlist head = new linkedlist(5);
        Random rand = new Random();
        int  n = rand.nextInt(50) + 1;
        linkedlist root = head;
        linkedlist temp2 = null;
        for(int i=0;i<10;i++)
        {
            linkedlist temp = new linkedlist(rand.nextInt(i+50)+1);
            temp.next = head;
            if(i == 5)
            {
                temp2 = temp;
            }
            head = temp;       
        }
        
       // root.next = temp2;
        System.out.println("Starting point -> " + temp2.a);
        head.print(head);
        head.iscircle(head);
        head.print(head);
        
    }
    
}
