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
        
         
    }

    public static void main(String args[]) {
        int input[] = {1, 7, 6, 6, 6,1, 1, 7};
        System.out.println(FindNonRepeatedElement(input));
    }
}
