/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author karth
 */

public class P3_ReverseLinkedList 
{

    static class LinkedList
    {
        int item;
        LinkedList next;
        LinkedList()
        {
            item = 0;
            next = null;
        }
        LinkedList(int item)
        {
            this.item = item;
            this.next = null;
        }
        public void Push(int item)
        {
            LinkedList list = new LinkedList(item);
            if(this.next == null)
            {
                this.next = list;
                return;
            }
            LinkedList pointer = this.next;
            while(pointer.next != null)
                pointer = pointer.next;
            pointer.next = list;
          //  System.out.println(pointer.item + " " + pointer.next);
        }
        
    }

    public static void PrintList(LinkedList head)
        {
            if(head == null)
            {
                System.out.println("empty");
                return;
            }
            while(head != null)
            {
                System.out.print(head.item + " ");
                head = head.next;
            }
            System.out.println();
        }
    public static int ListLength(LinkedList head)
        {
            if(head == null)
                return 0;
            int i = 1;
            while(head.next != null)
            {
                head = head.next;
                i++;
            }
            return i;
        }
    public static LinkedList ReverseList(LinkedList head)
        {
            if(head == null || head.next == null)
            {
                return head;
            }
            LinkedList Previous = null,Pointer,Next;
            Pointer = head;
            while(Pointer != null)
            {
                Next = Pointer.next;
                Pointer.next = Previous;
                Previous = Pointer;
                Pointer = Next;
            }
            return Previous;
        }
    public static LinkedList MiddleItem(LinkedList Pointer)
    {
        if(Pointer == null || Pointer.next == null)
        {
            return Pointer;
        }
        LinkedList Middle = Pointer;        
        Pointer = Pointer.next;
        while(Pointer.next != null)
        {
            if(Pointer.next.next == null)
                break;
            Middle = Middle.next;
            Pointer = Pointer.next.next;
        }
        return Middle;
    }
    public static LinkedList ReverseRightHalf(LinkedList head)
    {
        if(head == null)
        {
            return head;
        }
        LinkedList Middle = MiddleItem(head);
        Middle.next = ReverseList(Middle.next);
        return head;
    }
    public static void Test(LinkedList head,int num)
    {
        head.item = 1;
        head.next = null;
        for(int i = 1;i<num;i++)
        {
            head.Push(i+1);
        }
        if(num == 0)
        {
            head = null;
        }
        System.out.println("List Length - " +ListLength(head));
        PrintList(head);
        head = ReverseList(head);
        PrintList(head);
        PrintList(MiddleItem(head));
        PrintList(ReverseRightHalf(head));
    }
    public static void main(String args[])
    {
        LinkedList head = new LinkedList();
        System.out.println("Linked List");
/*        for(int i = 11;i<20;i++)
        {
            head.Push(i+1);
        }
        System.out.println("print");
        System.out.println("List Length - " +ListLength(head));
        PrintList(head);
        head = ReverseList(head);
        PrintList(head);
        PrintList(MiddleItem(head));
        PrintList(ReverseRightHalf(head));
        head.item = 10;
        head.next = null;
        System.out.println();
        System.out.println();
        for(int i = 11;i<19;i++)
        {
            head.Push(i+1);
        }
        System.out.println("List Length - " +ListLength(head));
        PrintList(head);
        head = ReverseList(head);
        PrintList(head);
        PrintList(MiddleItem(head));
        PrintList(ReverseRightHalf(head));
*/
        Test(head,0);
        Test(head,1);
        Test(head,2);
        Test(head,8);
        Test(head,9);
    }
    
}
