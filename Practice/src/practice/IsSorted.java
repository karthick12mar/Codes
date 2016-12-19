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
public class IsSorted {
    
    public static boolean IsSorted(int input[])
    {
        if(input == null)
        {
            return true;
        }
        
        if(input.length < 3)
        {
            return true;
        }
        
        int i = 1,flag = 1;  // 0 - ascending 1 - descending
        
        if(input[0] < input[1]) 
        {
            flag = 0;
        }
        else if(input[0] == input[1])
        {
            for(i = 1;i<input.length - 1;i++)
            {
                if(input[i] < input[i+1])
                {
                    flag = 0;
                    break;
                }
                else if(input[i] > input[i+1])
                {
                    flag = 1;
                    break;
                }
            }
            if(i == input.length - 1)
                return true;
        }
        
        if(flag == 1) 
        {
            for( ;i < input.length - 1; i++)
            {
                if(input[i] < input[i+1])
                    return false;
            }
        }
        else 
        {
            for(;i < input.length - 1; i++)
            {
                if(input[i] > input[i+1])
                    return false;
            }
        }
        return true;
        
    }

/*
        int input[] = {1,2,3,4,5,6,7};
        System.out.println(IsSorted(new int[] {5,6}));
        System.out.println(IsSorted(new int[] {}));
        System.out.println(IsSorted(new int[] {2,2,2,2,2,2}));
        System.out.println(IsSorted(new int[] {1,2,3,4,5,6,7}));
        System.out.println(IsSorted(new int[] {9,8,7,6,5,4,3,2,1})); 
        System.out.println(IsSorted(new int[] {22,4,1,5,6,7}));
        System.out.println(IsSorted(new int[] {1,2,3,0}));
        System.out.println(IsSorted(new int[] {1,2,2,3}));   

 */
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
            System.out.println("Null array");
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
    
    public static void main(String args[])
    {
        int output[] = RotateNTime(new int[] {0,1,2,3,4,5,6},12);
        for(int i =0 ;i<output.length;i++)
        {
            System.out.print(output[i]);
        }
    }
}