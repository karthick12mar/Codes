/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Practice;

/**
 *
 * @author karth
 */
class Sorting
{
    
/* this is bubble sort */
static int[] BubbleSort(int[] input)
{
    int count = 0;
    for(int i = input.length -1; i >= 0 ;i--)
    {
        for (int j = 0; j < i ;j++)
        {
            if(input[j] >= input[j+1])
            {
                int temp = input[j];
                input[j] = input[j+1];
                input[j+1] = temp;
            }
            count++;
        }
    }
    System.out.println(count);
    return input;
}


static int[] InsertionSort(int[] input)
{
    int count = 0;
    for(int i = 0; i < input.length ;i++)
    {
        int temp = input[i];
        int j = i-1;
        while( j >= 0 && input[j] > temp)
        {
            input[j+1] = input[j];
            j--;
            count++;
        }
        input[j+1] = temp;
    }
    System.out.println(count);
    return input;
}

static int[] SelectionSort(int[] input)
{
    int count = 0;
    for(int i = 0;i<input.length;i++)
    {
        for(int j = i; j<input.length;j++)
        {
            if(input[i] > input[j])
            {
                int temp = input[i];
                input[i] = input[j];
                input[j] = temp;
            }
            count++;
        }
    }
    System.out.println(count);
    return input;
}

public static int[] MergeSort(int[] input)
{
    if(input.length < 2)
        return input;
    int middle = input.length/2; 
    int[] left = new int[middle];
    int[] right = new int[input.length - middle];
    System.arraycopy(input,0,left,0,middle);
    System.arraycopy(input,middle,right,0,input.length - middle);        
    MergeSort(left);
    MergeSort(right);
    input = Merge(left,right,input);
    return input;
}
public static int[] Merge(int[] left,int[] right,int[] output)
{
    
    int i = 0,j =0 ,k = 0;
    while(j < right.length && i < left.length)
    {
        
        if(left[i] <= right[j])
        {
            output[k] = left[i];
            i++;
            k++;
        }
        else
        {
            output[k] = right[j];
            j++;
            k++;
        }
            
    }
    while(i < left.length)
    {
        output[k] = left[i];
        i++;
        k++;
    }
    while(j < right.length)
    {
        
        output[k] = right[j];
        j++;
        k++;
    } 
    return output;
}

public static int[] QuickSort(int[] input)
{
    int i=0,j=input.length-1;
    int pivot = input[input.length / 2];
    while(i < j)
    {
      //  {1,4,3,2,0,3,5,5,3,6,10,8};
        while(input[i] < pivot)
        {
            i++;
        }
        while(input[j] > pivot)
        {
            j--;
        }
        int temp = input[i];
        input[i++] = input[j];
        input[j--] = temp;
    }
    
    return input;
}


static void Print(int[] input)
{
    for(int i=0;i<input.length;i++)
    {
        System.out.print(" " + input[i]+" ");
    }
}
}