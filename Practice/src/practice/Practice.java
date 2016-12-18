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
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] data = {1,4,3,2,0,3,8,5,10,6,3,5};
        int[] output;
        output = Sorting.QuickSort(data);
       Sorting.Print(output);
         System.out.println();
       //  output = Sorting.BubbleSort(data);
       //  Sorting.Print(output);
    }
    
}
