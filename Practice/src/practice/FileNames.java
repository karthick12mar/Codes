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
import java.io.*;

public class FileNames {

    public static void main(String[] args) {
        File dir = new File("D:\\iphone");
        String[] children = dir.list();
        int Count = 0;
        int[] count = new int[5];
        if (children == null) {
            System.out.println("Either dir does not exist or is not a directory");
        } else {
            for (int i = 0; i < children.length; i++) {
                File myFile = new File(dir, children[i]);
                System.out.println(children[i] + " " + myFile.isDirectory() + myFile);
                if (myFile.isDirectory()) 
                {
                    String[] temp = myFile.list();
                    for (int j = 0; j < temp.length; j++)
                    {
                        System.out.println(temp[j]);
                        if(temp[j].endsWith(".JPG"))
                        {
                            count[0]++;
                        }
                        else if(temp[j].endsWith(".mp4"))
                        {
                            count[1]++;
                        }
                        else if(temp[j].endsWith(".PNG"))
                        {
                            count[2]++;
                        }
                        else if(temp[j].endsWith(".MOV"))
                        {
                            count[3]++;
                        }
                        else if(temp[j].endsWith(".AAE"))
                        {
                            count[4]++;
                        }
                        Count++;
                        
                    }
                }
            }
            System.out.println("Count " +Count+" "+count[0]+" "+count[1]+" "+count[2]+" "+count[3]+" "+count[4]);
        }
    }
}
