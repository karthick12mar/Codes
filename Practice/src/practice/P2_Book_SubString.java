/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Hashtable;
import java.io.*;
/**
 *
 * @author karth
 */
class StringToken
    {
        
        Hashtable<Integer, String> hash1 = new Hashtable<Integer,String>();
        public void token(String input,int key)
        {
            String[] in = input.split(" ");
            for (String in1 : in) {
                hash1.put(key++, in1);
            }  
            //hash1.put(i++, )
        }
        public void FindSubString(StringToken key)
        {
            int size;
            this.hash1.containsValue();
        }
    }
public class P2_Book_SubString {
    
    
    
    public static void main(String args[]) throws IOException
    {
        String input;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input = br.readLine();
        System.out.println("Input - " + input);
        FileReader FR = new FileReader("C:\\input\\input.txt");
        br = new BufferedReader(FR);
        input = br.readLine();
        StringToken key = new StringToken();
        key.token(input,-1);
        StringToken book = new StringToken();
        while(input != null)        
        {
            book.token(input,book.hash1.size());
            System.out.println("File - " + input);
            input = br.readLine();
        }
        System.out.println(book.hash1);
        book.FindSubString(key);
    }
    
}
