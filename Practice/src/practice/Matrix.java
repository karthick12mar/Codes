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
public class Matrix {
    int matrix[][];
    Matrix(int rows,int columns)
    {
        this.matrix = new int[rows][columns];
    }
    public void print()
    {
       if(this.matrix == null)
       {
           System.out.println("Null array");
           return;
       }
       for(int i =0;i<this.matrix.length;i++)
        {
            for(int j = 0;j<this.matrix[0].length;j++)
            {
                System.out.print(" " +this.matrix[i][j]);
            }
            System.out.println();
        }
    }
    
    public void initialize(int value)
    {
        value = 1;
       for(int i =0;i<this.matrix.length;i++)
        {
            for(int j = 0;j<this.matrix[0].length;j++)
            {
                this.matrix[i][j] = value++;
            }
        }
    }
    public static int[][] Add(int[][] a,int[][] b)
    {
        
        if(a.length != b.length || a[0].length != b[0].length)
            return null;
        int[][] output = new int[a.length][a[0].length];
        for(int i =0;i<a.length;i++)
        {
            for(int j = 0;j<a[0].length;j++)
            {
                output[i][j] = a[i][j] + b[i][j];
            }
        }
        return output;
    }
    public static int[][] multiply(int[][] a,int[][] b)
    {
        
        if(a.length != b[0].length)
            return null;
        int[][] output = new int[a.length][b[0].length];
        for(int k = 0;k<a.length;k++)
        {
            for(int i = 0;i<a.length ;i++)
            {
            
                for(int j = 0;j<b.length;j++)
                {
                    output[k][i] = output[k][i] + a[i][j]*b[j][i];
                }
            
            }
        }
        return output;
    }
    
    public int[][] Transpose()
    {
        if(this.matrix == null)
            return null;
    /*    int[][] output = new int[this.matrix[0].length][this.matrix.length];
        for(int i =0;i<this.matrix.length;i++)
            for(int j = 0;j<this.matrix[0].length;j++)
                output[j][i] = this.matrix[i][j];
       
        return output; */
        // inplace in case of N*N matrix
        
        for(int i =0;i<this.matrix.length;i++)
        {
            for(int j = i+1;j<this.matrix[0].length;j++)
            {
                int temp = this.matrix[i][j];
                this.matrix[i][j] = this.matrix[j][i];
                this.matrix[j][i] = temp;
            }
        }
        
        return this.matrix;
        
    }
    
    public int[][] Rotate(int degree)
    {
        if(this.matrix == null)
            return null;
        degree = (degree/90) % 4;
        while(degree != 0)
        {            
            this.matrix = Transpose();
        
            for(int i = 0,k=this.matrix[0].length-1;i < k;i++,k--)
            {
                for(int j = 0;j<this.matrix.length;j++)
                {
                    int temp = this.matrix[j][i];
                    this.matrix[j][i] = this.matrix[j][k];
                    this.matrix[j][k] = temp; 
                }
            }
            degree--;
        }
        return this.matrix; 
    }
    public static void main(String args[])
    {
        Matrix obj = new Matrix(4,4);
        Matrix obj1 = new Matrix(3,4);
        obj.initialize(1);
        obj1.initialize(1);
        Matrix obj3 = new Matrix(4,5);
        /*obj3.matrix = Add(obj.matrix,obj1.matrix);
        obj3.print();
        System.out.println(obj.matrix.length + " " + obj.matrix[0].length);
        obj3.matrix = multiply(obj.matrix,obj1.matrix);
        obj3.print();
        System.out.println(obj.matrix.length + " " + obj.matrix[0].length);
        obj.matrix = obj.Transpose();
        System.out.println(obj.matrix.length + " " + obj.matrix[0].length);
        obj.print();*/
         obj.print();
        obj.matrix = obj.Transpose();
        obj.print();
        obj.matrix = obj.Rotate(90);
        obj.print();
        
    }
    
}
