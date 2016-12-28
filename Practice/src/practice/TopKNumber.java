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
public class TopKNumber {
    
    static int[] Numset;
    TopKNumber(int k)
    {
        Numset = new int[k];
    }
    public static void put(int value)
    {
        if(Numset[0] > value)
            return;
        
        int size = Numset.length-1;
        Numset[0] = value;
        buildheap(0,size);
    }
    public static void Display()
    {
        for(int i=0;i<Numset.length;i++)
        {
            System.out.print(" " +Numset[i]);
        }
        System.out.println();
    }
    
    public static void addToHeap(int value ,int size)
    {
        
    }
    
    /*public static void heapfiy()
    {
        int size = Numset.length - 1;
        for(int i =0;i<size;i++)
        {
            buildheap(i,size);
        }
        
        return;
        
    }*/
    public static void buildheap(int Num,int size)
    {
        int left = Num*2;
        int right = Num*2 + 1;
        int small;
        if(left <= size && Numset[left] < Numset[Num])
        {
            small = left;
        }
        else
        {
            small = Num;
        }
        //System.out.println(" "+right+" "+small);
        if(right <= size && Numset[right] < Numset[small])
        {
            small = right;
        }
        if(small != Num)
        {
            int temp = Numset[small];
            Numset[small] = Numset[Num];
            Numset[Num] = temp;
            buildheap(small,size);
        }
    }
    public static void GetTopNumbers()
    {
        Display();
        //return Numset;
    }
    public static void main(String args[])
    {
        TopKNumber obj = new TopKNumber(10);
        //obj.heapfiy();
       for(int i =10;i<1000;i++)
       {
            int j = i + (int)(Math.random()*1000);
            obj.put(j);
       }
       obj.put(109);
       obj.GetTopNumbers();
    }
}
