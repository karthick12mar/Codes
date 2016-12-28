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
public class I1_StringUnique {
    public static boolean Unique(String input)
    {
        if(input.length() <= 1)
            return true;
        boolean[] bucket = new boolean[127];
        input = input.toLowerCase();
        for(int i = 0;i<input.length();i++)
        {
            if(bucket[(int)input.charAt(i)])
                return false;
            bucket[(int)input.charAt(i)] = true;
            System.out.println(input.charAt(i) +" "+ (int)input.charAt(i));
        }
        return true;
    }
    public static boolean UniqueBitwise(String input)
    {
        if(input.length() <= 1)
            return true;
        int bucket = 0;
        input = input.toLowerCase();
        for(int i =0;i<input.length();i++)
        {
            int value = input.charAt(i) -'a';
            if((bucket & (1<<value)) > 0)
                return false;
        System.out.println(input.charAt(i) +" "+ (int)input.charAt(i));
        bucket = (bucket | (1<<value));  
        }
        
        return true;
    }
    public static void main(String args[])
    {
        String input= "abcdefghijklmnopqrstuvwxyza";
        System.out.println(Unique(input));
        System.out.println(1<<2);
        System.out.println(UniqueBitwise(input));
        
    }
    
}
