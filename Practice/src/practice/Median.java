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
public class Median {
    
    public static int MedianSortedArr(int[] input)
    {
        if(input.length < 1)
            return 0;
        if(input.length == 1)
            return input[0]; 
        return (input[(input.length-1)/2]);
    }
    public static int MedianUnSortedArr(int[] input,int k)
    {
        input = Quick(input,0,input.length-1,k);
        return input[k];
        
    }
    static int[] Quick(int[] input,int left,int right,int k)
    {
        int i = left , j = right;
        int p = left + (right - left)/2;
        int pivot = input[p];
        while(i <= j)
        {
            while(input[i] < pivot)
                i++;
            while(input[j] > pivot)
                j--;
            if(i<=j)
            {
            int temp = input[i];
            input[i++] = input[j];
            input[j--] = temp;
            }
        }
        
        if(j >  left)
        {
            if(k<i)
            Quick(input,left,j,k);
        }
        if(i < right)
        {
            if(k>j)
            Quick(input,i,right,k);
        }
        
        return input;
    }
     static void Print(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(" " + input[i] + " ");
        }
    }
    public static void main(String args[])
    {
        int input[]= {9,8,5,4,7,6,0,1,2,3};
        int kth = MedianUnSortedArr(input,input.length/2);
        System.out.println(kth);
    }
}
