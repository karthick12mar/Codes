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
        int i = 1,flag = 1; // 0 - ascending 1 - descending  
        if(input.length < 3)
        {
            return true;
        }
        else if(input[0] < input[1]) 
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
    

}