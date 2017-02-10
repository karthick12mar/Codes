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
class LinkedList
{
   int item;
   LinkedList next;
   LinkedList()
   {
       this.item =0;
       next = null;
   }
   LinkedList(int item)
   {
       this.item = item;
       next = null;
   }
   LinkedList(int item,LinkedList next)
   {
       this.item = item;
       this.next = next;
   }
   
}
public class I2a_RemoveDuplicateLinkedList {
    
}
