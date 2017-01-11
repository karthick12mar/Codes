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
public class I5_StringCompress {

    public static String Compress(String input) {
        if (input.length() <= 2) {
            return input;
        }
        int size = input.length();
        int count = 1;
        String output = "";
        for (int i = 0; i < size; i++) 
        {
            if(i == size-1)
            {
                if(count == 1)
                    output = output + input.charAt(i);
                else
                    output = output + count +(char) 120 + input.charAt(i);
                break;
            }
            if (input.charAt(i) == input.charAt(i + 1)) 
            {
                count++;
            } 
            else if (count != 1) 
            {
                output = output + count + (char) 120+input.charAt(i) ;
                count = 1;
            } 
            else  
            {
                output = output + input.charAt(i);
            } 
            if (i == size - 1 && count == 1) 
            {
                output = output + input.charAt(i);
            }
        }
          return output;
    }

    public static void main(String args[]) {
        String[] input = new String[10];
        input[0]= "dddcc";
        input[1] = "abc";
        input[2] = "a";
        input[3] = "aa";
        input[4] = "aabbcc";
        input[5] = "abbcc";
        input[6] = "aabbc";
        input[7] = "aabcc";
        input[8] = "aaaabbbccc";
        input[9] = "9999999";
        for(int i = 0;i<=9;i++)
            System.out.println(input[i]+" - "+ Compress(input[i]));
    }

}
