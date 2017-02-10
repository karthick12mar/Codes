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
            return "Invalid input";
        }
        if(input.indexOf('@') < 1 || input.indexOf('@')+1 > input.indexOf('.') || input.indexOf('.') < 1 )
            return "Invalid input";
        System.out.println(input.indexOf('@') + " "+input.indexOf('.'));
        input = input.replaceAll(input.substring(1, input.indexOf('@')),"xxxxxxxx");  
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
        String MailId = in.nextLine();
        long PhNum = in.nextLong();
        System.out.println(MailId + " " + PhNum);
     //   MaskMailid(MailId);
        System.out.println(MaskMailid(MailId) + "," + MaskPhNum(PhNum));
    }
    
}
