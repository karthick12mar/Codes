/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practice;
import java.io.*;
import java.util.*;
/**
 *
 * @author karth
 */
public class FileWordCount
{
    public static void main(String[] args) throws FileNotFoundException, IOException 
    {
         String FILENAME = "C:\\Users\\karth\\OneDrive\\Documents\\test.txt";
         BufferedReader br = null;
         FileReader fr = null;
         try 
         {
             fr = new FileReader(FILENAME);
             br = new BufferedReader(fr);
         }
         catch(Exception e)
         {
             e.printStackTrace();
         }
         String Line = "";
         Hashtable<String,int[]> hash = new Hashtable();
         int WordNumber[];
         int temp=0;
         if((Line = br.readLine()) != null)
         {
             int i = 0,j=0;
             
             while(i < Line.length())
             {
                 
                 if(Line.charAt(i) != ' ')
                 {
                     i++;
                 }
                 else
                 {
                     if(i!=j)
                     {
                        System.out.println(j+" "+i);
                        if(hash.get(Line.substring(j, i)).length == 0)
                        {
                            WordNumber[0] = ++temp;
                            hash.put(Line.substring(j, i),WordNumber);
                        }
                        else
                        {
                            int length = hash.get(Line.substring(j, i)).length;
                            
                        }
                     }
                     j = i+1;
                     i++;
                 }
             }
         }
         System.out.println(hash.get(1));
             
    }
}
