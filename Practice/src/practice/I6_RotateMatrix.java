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
public class I6_RotateMatrix {
    
    public static int[][] Transpose(int input[][])
    {
        for(int i = 0 ;i<input.length;i++)
        {
            for(int j = i+1;j<input[0].length;j++)
            {
                int temp = input[i][j];
                input[i][j] = input[j][i];
                input[j][i] = temp;
            }
        }
        return input;
    }
    public static int[][] Rotate(int input[][])
    {
        input = Transpose(input);
        for(int i = 0,k = input[0].length-1;i < k;i++,k--)
        {
            for(int j =0;j<input.length;j++)
            {
                int temp = input[j][i];
                input[j][i] = input[j][k];
                input[j][k] = temp;
            }
        }
        print(input);
        return input;
    }
    public static int[][] Initialise(int input[][])
    {
        int value = 1;
        for(int i = 0;i < input.length;i++)
        {
            for(int j =0;j < input[0].length;j++)
            {
                input[i][j] = value++;
            }
        }
        print(input);
        return input;
    }
    public static void print(int input[][])
    {
        for(int i = 0;i < input.length;i++)
        {
            for(int j =0;j < input[0].length;j++)
            {
                System.out.print(" "+input[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int[][] input= new int[3][3];
        input = Initialise(input);
        input = Rotate(input);
    }
}
