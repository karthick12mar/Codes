/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author karth
 */
public class I4_InsertCharactersInSpace 
{
    public static char[] AddCharacters(char[] input)
    {
        int space = 0;
        for(int i =0;i<input.length;i++)
        {
            if(input[i] == ' ')
                space++;
        }
        if(space == 0)
            return input;
        
        char[] output = new char[input.length+space*3];
        for(int i=0,j=0;i<output.length&& j < input.length;)
        {
            System.out.println(j);
            if(input[j] != ' ')
            {
                output[i++] = input[j++];
            }
            else
            {
                j++;
                output[i++] = '%';
                output[i++] = '2';
                output[i++] = '0';
            }
        }
        return output;
    }
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        char[] input = new char[26];
        input = scan.nextLine().toCharArray();
        //input = "This is the input".toCharArray();
        input = AddCharacters(input);
        System.out.println(input);
        System.out.println(input.length);
        String Sentence = "";
        //String output = Replacecharacters(Sentence,);
    }
    
}
