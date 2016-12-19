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
    
    public static void main(String args[])
    {
      int output[] = null;
        for(int i =0 ;i<output.length;i++)
        {
            System.out.print(output[i]);
        }
    }
}