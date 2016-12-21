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
        int count[] = new int[26];
        for(int i =0;i<output.length;i++)
        {
         /*   int index = i;
            for(int j=i+1;j<output.length;j++)
            {
                if(output[index]>output[j])
                {
                   index = j;
                }
            }
            char temp = output[index];
            output[index] = output[i];
            output[i] = temp;
            
          //  System.out.println(output[i]);*/
            count[(int)(input.charAt(i)) - (int)('a')]++;
        }
        String output1 = "";
        for(int i =0;i<26;i++)
        {
            while(count[i]>0)
            {
 //               System.out.print(i+" "+count[i]);
 //               System.out.println(" " + Character.toString((char)((int)('a')+i)));
                String temp = Character.toString((char)((int)('a')+i));
                output1 = output1.concat(temp);
                count[i]--;
            }
        }
//       System.out.println(output1);
        return output1;
    }
    
    // 
    public static void main(String args[])
    {
        String input= SortString("prakash");
        System.out.println(input);
    }
}
