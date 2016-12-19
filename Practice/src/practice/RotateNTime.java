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
class RotateNTime
{
    

public static int[] RotateNTime(int input[],int numberOFTimes)
    {
        if(input == null || numberOFTimes < 0)
        {
            System.out.println("Invalid input elements");
            return null;
        }
        int index = input.length - (numberOFTimes % input.length);
        input = reverse(input,index,input.length-1);
        input = reverse(input,0,index-1);
        input = reverse(input,0,input.length-1);
        return input;
                
    }
    
    public static int[] reverse(int input[],int start,int end)
    {
        if(input == null)
        {
            System.out.println("Empty array");
            return null;
        }
        if(input.length < 2)
        {
            return input;
        }
        while(start <= end)
        {
            int temp = input[start];
            input[start] = input[end];
            input[end] = temp;
            start++;
            end--;       
        } // for
        return input;
    } // reverse
    
    
}