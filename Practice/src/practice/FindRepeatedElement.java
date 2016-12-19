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
class FindRepeatedElement
{
public static int FindRepeatedElement(int input[],int find)
    {
        if(input == null)
        {
            System.out.println("Empty array");
            return -1;
        }
        if(input.length < 2 & input[0] == find)
        {
            return input[0];
        }
        else
        {
            return -1;
        }
        int[] count = new count[input.length];
        for(int i =0;i<input.length;i++)
        {
            
        }
        return 0;
    }
}