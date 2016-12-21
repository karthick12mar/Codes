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
public class Mergearray {
    public static int[] Mergearray(int array1[] , int array2[])
    {
        if(array1.length == 0 && array2.length == 0 )
            return array1;
        if(array1.length == 0 && array2.length > 0)
            return array2;
        if(array1.length > 0 && array2.length == 0)
            return array1;
        
        int[] output = new int[array1.length+array2.length];
        for(int i =0,j=0;i+j < output.length;)
        {
            if( i == array1.length )
            {
                output[i+j] = array2[j];
                j++;
            }
            else if( j == array2.length )
            {
                output[i+j] = array1[i];
                i++;
            }
            else if(array1[i] < array2[j])
            {
                output[i+j] = array1[i];
                i++;
            }
            else 
            {
                output[i+j] = array2[j];
                j++;
            }
        }
        return output;
    }
    public static int[] Mergearrayin(int[] input,int m)
    {
        int i = 0,j = m+1;
        while(i <= m && j <= input.length)
        {
            if(input[i] < input[j])
            {
                i++;
            }
            else 
            {
                j++;
            }
        }
        return input;
    }
            
    public static void main(String args[])
    {
        int array1[] = {0,1,2,3,4,5};
        int array2[] = {0,1,2,3};
        int array3[] = {0,6,7,8,9,1,2,3,4,5};
        int output[] = new int[array1.length+array2.length];
        output = Mergearray(array1,array2);
        array3 = Mergearrayin(array3,4);
        for(int i =0;i<output.length;i++)
        System.out.print(" "+output[i]);
    }
}
    

