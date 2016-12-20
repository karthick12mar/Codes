/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Arrays;

/**
 *
 *  - String Compress 
 *  - Sort String
 */
public class StringPractice {
    public static String StringCompress(String input)
    {
        int count =1;
        String output = "";
        if(input == null)
            return null;
        for(int i=0;i<input.length();i++)
        {
            if(i == input.length()-1)
            {
                output = output+Character.toString(input.charAt(i)) + Integer.toString(count); 
            }
            else if(input.charAt(i) == input.charAt(i+1))
            {
                count= count+1;    
            }
            else
            {
                output = output+Character.toString(input.charAt(i)) + Integer.toString(count);
                count = 1;   
            }
        }        
        return output;
        /*
        System.out.println(StringCompress("abc"));
        System.out.println(StringCompress(""));
        System.out.println(StringCompress(null));
        System.out.println(StringCompress("aaaabbbbccc"));
        System.out.println(StringCompress("aabcc"));
        System.out.println(StringCompress("abccccccc"));
        */
    }
    public static String SortString(String input)
    {
        if(input == null || input.length() < 2)
            return input;
        char output[] = input.toCharArray();
        for(int i =0;i<output.length;i++)
        {
            for(int j=i+1;j<output.length;j++)
            {
                if(output[i]>output[j])
                {
                    char temp = output[i];
                    output[i] = output[j];
                    output[j] = temp;
                }
                
            }
          //  System.out.println(output[i]);
        }
        input = String.valueOf(output);
        return input;
    }
    
    // 
    public static void main(String args[])
    {
        String input= SortString("prakash");
        System.out.println(input);
    }
}
