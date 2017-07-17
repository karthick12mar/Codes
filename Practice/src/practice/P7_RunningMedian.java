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
import java.util.*;
public class P7_RunningMedian 
{
    static PriorityQueue<Integer> higher = new PriorityQueue<Integer>();
    static PriorityQueue<Integer> lower = new PriorityQueue<Integer>(Collections.reverseOrder());
    
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++ )
        {
            a[i] = in.nextInt();
            higher.add(a[i]);
            lower.add(a[i]);
        }
        System.out.println(" -- " +higher.size() + " -- " + lower.size());
        System.out.println(higher.peek()+ " -- " + lower.peek());
        System.out.println(higher.poll() + " -- " + lower.poll());
        System.out.println(higher.size() + " " + higher.peek()  + " -- " + lower.size() + "  " + lower.peek());
    }
}
