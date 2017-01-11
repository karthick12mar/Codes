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
import practice.I6_RotateMatrix.*;

public class I7_MatrixRowsColumn 
{
    public static int[][] RowsColumn1(int input[][])
    {
        if(input == null)
            return null;
        for(int i = 1;i<input.length;i++)
        {
            for(int j = 1;j<input[0].length;j++)
            {
                if(input[i][j] == 0)
                {
                    input[i][0] = 0;
                    input[0][j] = 0;
                }
            }
        }

        for(int i = 1;i<input.length;i++)
        {
            if(input[0][i] == 0)
            {
                for(int j = 1;j<input.length;j++)
                {
                    input[j][i] = 0;
                }
            }
        }
        
        for(int i = 1;i<input[0].length;i++)
        {
            if(input[i][0] == 0)
            {
                for(int j = 1;j<input[0].length;j++)
                {
                    input[i][j] = 0;
                }                 
            }   
        }
        
       // practice.I6_RotateMatrix.print(input);
        
        if(input[0][0] == 0)
        {
            for(int i = 0;i<input.length;i++)
            {
                input[i][0] = 0;
            }
            for(int i = 0;i<input[0].length;i++)
            {
                input[0][i] = 0;
            }
        }

        return input;
    }
    
    public static void main(String args[])
    {
        int[][] input = new int[4][4];
        input = practice.I6_RotateMatrix.Initialise(input);
        input[3][3] = 0;
        //input[2][2] = 0;
        //input[1][0] = 0;
        input[0][0] = 0;
        practice.I6_RotateMatrix.print(input);
        input = RowsColumn1(input);
        practice.I6_RotateMatrix.print(input);
        
        
    }
    
}
