/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

import java.util.Hashtable;

/**
 *
 * @author karth
 */
class FindRepeatedElement {

    public static int FindRepeatedElement(int input[]) // array size n+1 & containing 1 to n elements  
    {
        if (input == null || input.length < 2) 
        {
            return -1;
        }
        for (int i = 0; i < input.length; i++) 
        {
            if (input[i] >= input.length)
            {
                return -1;
            }
            if (input[Math.abs(input[i])] < 0) 
            {
                return input[i];
            } 
            else
            {
                input[Math.abs(input[i])] = -input[Math.abs(input[i])];
            }
        }
        return -1;
    }

    public static int FindNonRepeatedElement(int input[]) // elements are repeating 2 times expect one element
    {
        if (input == null || input.length < 2) 
        {
            return -1;
        }
        int Xor = input[0];
        for (int i = 1; i < input.length; i++) 
        {
            Xor = Xor ^ input[i];
        }
        return Xor;
        
    }
    public static int FindRepeatedElementRandom(int input[])
    {
        if(input == null || input.length < 2)
        {
            return -1;
        }
        Hashtable<Integer,Integer> hashTable=new Hashtable<Integer,Integer>();
        for(int i = 0;i< input.length;i++)
        {
            int count = 0;
            if(hashTable.get(input[i]) == null)
            {
                hashTable.put(input[i],1);
            }
            else 
            {
                count = hashTable.get(input[i]) + 1;
                hashTable.put(input[i],count);
            }
        }
        for(int i =0;i<input.length;i++)
        {
            if(hashTable.get(input[i])> 1)
            {
                System.out.println(input[i]);
            }
        }
/*        
        for(int i=0;i<input.length;i++)
        {
            for(int j = i+1;i<input.length;j++)
            {
                if(input[i] == input[j])
                {
                    return input[i];
                }
            }
        }
        return -1;
*/      return 0;
    }

    public static void main(String args[]) {
        int input[] = {1, 7, 3, 4, 2,1, 8, 7};
        System.out.println(FindRepeatedElementRandom(input));
    }
}
