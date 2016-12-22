/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Arrays;

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
    
    public static int Median2array(int array1[],int start1,int end1,int array2[],int start2,int end2,int n)
    {
        //System.out.print(n+" "+start1 +" "+end1+" "+start2+" "+end2);
        //System.out.print(" -- "+array1[start1] +" "+array1[end1]+" "+array2[start2]+" "+array2[end2]);
        if( n < 1)     
            return -1;
        if(n == 1)    
            return (array1[start1]+array2[start2])/2;
        if(n == 2)
            return ((array1[start1] > array2[start2]? array1[start1]:array2[start2]) + (array1[end1] < array2[end2]? array1[end1]:array2[end2]))/2; 
        
        int m1 = Median(array1,start1,end1);
        int m2 = Median(array2,start2,end2);
        //System.out.println(" "+m1+" "+m2);
        if(m1 == m2)
            return m1;
        if(m1 > m2)
        {
            if(n%2 == 0)
            {
                return Median2array(array1,start1,start1+n/2,array2,start2+n/2-1,start2+n-1,n-n/2 +1);
            }
            return Median2array(array1,start1,start1+n/2,array2,start2+n/2,start2+n-1,n/2 );
        }
        
        if(n%2 == 0)
        {
            return Median2array(array1, start1+n/2-1, start1+n-1,array2, start2,start2+n/2, n-n/2 +1);
        }
        return Median2array(array1,start1+n/2,start1+n-1,array2,start2,start2+n/2,n-n/2);
    }
    public static int Median(int[] input,int start,int end)
    {
        int n = start + (end - start)/2 ;
        if(input.length%2 == 0)
            return (input[n] + input[n+1])/2;
        else 
            return input[n];
    }    
    public static void main(String args[])
    {
        int input[]= {100,100,200,300,400,500};
        int kth = MedianUnSortedArr(input,input.length/2);
        int input1[] = {50,60,70,80,90,100};
        int med =0;
        if(input.length == input1.length)
            med = Median2array(input,0,input.length-1,input1,0,input1.length-1,input1.length);
      //  input1 = input1 + input1.length/2;
        System.out.println(med);
    }
}
