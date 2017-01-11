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
import java.util.Scanner;

public class P1_MaskMailIdNum {
    
    public static String MaskMailid(String input)
    {
        if(input == null)
        {
            return null;
        }
        int length = input.length();
        
        return input;
    }
    
    public static String MaskPhNum(long input)
    {
        String in = Long.toString(input);
        if(in.length() != 10)
            return "Invalid Phone Number";
        return "(XXX)-XXX-" + in.substring(6,10);
        
    }
    
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Mail id and Number:");
        String MailId = " ";
        long PhNum = in.nextLong();
        System.out.println(MailId + " " + PhNum);
        System.out.println(MaskMailid(MailId) + " " + MaskPhNum(PhNum));
    }
    
}
