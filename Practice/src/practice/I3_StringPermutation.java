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
public class I3_StringPermutation
{
    
    public static boolean Permutationcheck(String input1,String input2)
    {
        
        if(input1.length() != input2.length())
            return false;
        int[] bucket = new int[256];
        
        for(int i = 0;i<input1.length();i++)
        {
            bucket[(int)input1.charAt(i)]++;
            bucket[(int)input2.charAt(i)]--;
        }
        for(int i = 0;i<bucket.length;i++)
        {
            if(bucket[i] != 0)
                return false;
        }
        return true;
                
    }
    
    public static void main(String args[])
    {
        Boolean output = Permutationcheck("Welcome to Seattle - Technical Forum","Seattle Technical - Welcome to Forum");
        System.out.println(output);
    }
    
}
