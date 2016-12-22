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
public class kthNumber {
    public static int Kth(int input[],int k)
    {
        if(k < input.length && input.length >= 1)
            input=Quick(input,0,input.length-1,k); 
        else 
            return -1;
        
        return input[k];
    }
    public static int[] Quick(int input[],int left,int right,int Kth)
    {
        int j=right;
        int pivot = input[left];
        int i = left;
        while(i<=j)
        {
            while(input[i]<pivot)
            {
                i++;
            }
            while(input[j]>pivot)
            {
                j--;
            }
            
            if(i<=j)
            {
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
                i++;
                j--;
            }
        }
        
        if(j>left)
        {
            if(Kth<i)
            {
                Quick(input,left,j,Kth);
            }
        }
        
        if(i<right)
        {
            if(Kth>j)
            {
                Quick(input,i,right,Kth);
            }
        }
        return input;
    }
    public static void main(String args[])
    {
        int input[] = {1,3,4,2,9,8,3,7,6,0}; /// 0,1,2,3,3,4
       // int k = 6;
        //if(k<input.length-1);
            System.out.println(Kth(input,6));
    }
    
}
