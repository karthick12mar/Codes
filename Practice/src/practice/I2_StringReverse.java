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
public class I2_StringReverse {
    public static String Reverse(String input)
    {
        if(input.length() <= 1)
            return input;
        char temp[] = input.toCharArray();
        for(int i = 0,j=input.length()-1;i<j;i++,j--)
        {
            char temp1 = temp[i];
            temp[i] = temp[j];
            temp[j] = temp1;
            char temp2 = input.charAt(i);
            
        }
        input = String.valueOf(temp);
        return input;
    }
    public static void main(String args[])
    {
    
        String output = Reverse("karthick");
        System.out.println(output);
    }
    
}
