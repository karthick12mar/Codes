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
public class P10_LinkedListSize {
    
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
        public static void size(linkedlist root)
        {
            if(root == null)
            {       
                System.out.println( "Mid -> Null"+ " Size -> 0");
                return ;
            }
            if(root.next == null)
            {
                System.out.println("Mid -> "+ root.a +" Size -> 1");
                return ;
            }
            linkedlist slow = root.next;
            linkedlist fast = root.next.next;
            int i = 1;
            while(fast != null)
            {
                System.out.println(fast.a);
                i = i + 2;
                slow = slow.next;
                if(fast.next == null)
                {
                    fast = fast;
                    break;
                }
                else
                    fast = fast.next.next;
            }
            
            System.out.println("Mid -> " + slow.a + " Size -> "+ i);
            
        }
        
    }
    public static void main(String args[])
    {
        linkedlist head = new linkedlist(5);
        Random rand = new Random();
        int  n = rand.nextInt(50) + 1;
        linkedlist root = head;
        
        for(int i=0;i<9;i++)
        {
            linkedlist temp = new linkedlist(rand.nextInt(i+50)+1);
            temp.next = head;
            head = temp;       
        }
        
        System.out.print("Array -> ");
        head.print(head);
        head.size(head);
    }
    
}
