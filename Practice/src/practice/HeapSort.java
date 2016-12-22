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
public class HeapSort {

    static int a[];
    static int left, right, largest, size;

    static int[] buildheap(int a[]) {
        size = a.length - 1;
        for (int i = size / 2; i >= 0; i--)
        {
            a = maxheap(a, i);
        }
        return a;
    }

    static int[] maxheap(int a[], int i) {
        left = i * 2;
        right = i * 2 + 1;
        
        if (left <= size && a[left] > a[i])
        {
            largest = left;
        } 
        else 
        {
            largest = i;
        }
        
        if (right <= size && a[right] > a[largest]) 
        {

            largest = right;

        }
//System.out.println(" " + left + " " + right +" "+largest+ " "+i);        
        if (largest != i) {
            int temp = a[largest];
            a[largest] = a[i];
            a[i] = temp;
            a = maxheap(a, largest);
        }

        return a;
    }

    static int[] sort(int input[]) {
        input = buildheap(input);
 /*       for (int j = 0; j < input.length; j++) 
            {
            System.out.print(input[j] + " ");
            }
                System.out.println();
*/
        for (int i = size; i >= 0; i--) 
        {
/*            for (int j = 0; j < input.length; j++) 
            {
            System.out.print(input[j] + " ");
            }
                System.out.println();
  */          int temp = input[0];
            input[0] = input[i];
            input[i] = temp;
            size = size - 1;
            input = maxheap(input, 0);
        }
        return input;
    }

    public static void main(String[] args) {
        int[] a1 = {4, 1, 3, 2, 16, 9, 10, 14, 8, 7};
        a1 = sort(a1);
        for (int i = 0; i < a1.length; i++) {
            System.out.print(a1[i] + " ");
        }
        System.out.println();
    }
}
