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
public class NextHighestNum {

    static int num;
    static int[] heaparr;

    NextHighestNum() {
        heaparr = new int[10];
    }

    public static int HighestNum(int Num) {
        int temp = Num;
        int size = 0;
        int flag=0;
        if (size == 0)
        {
            heaparr[0] = temp % 10;
            temp = temp / 10;
            size++;
            
        }
        Display(size);
        while (temp != 0 && size >= 0) 
        {
            if(flag == 0)
            {
                heaparr[size] = temp % 10;
                temp = temp / 10;
                System.out.println(temp);
                Display(size);
                if(heaparr[size] > heaparr[size-1])
                {
                    flag = 0;
                    size++;
                }
                else
                {
                    flag = 1;
                }
            }
            if(flag == 1 && size != 1)
            {
                heap(0,size,flag);
                int temp1 = heaparr[0];
                heaparr[0] = heaparr[size];
                heaparr[size] = temp1;
                temp = temp*10 + heaparr[size];
                Display(size);
                System.out.println(" - "+flag+" "+size+" "+temp);                
                size--;
                flag = 2;
            }
            else if(size == 1)
            {
                heap(0,size,flag);
                temp = temp*10 + heaparr[size];
                Display(size);
                System.out.println(" + "+flag+" "+size+" "+temp);
                size--;
                flag = 2;
            }
            Display(size);
            if(flag == 2)
            {
                heap(0,size,flag);
                Display(size);
                temp = temp*10 + heaparr[size];
                System.out.println(" ++ "+flag+" "+size+" "+temp);
                size--;
            }   
            Display(size);
        }
        if(temp == 0)
            return Num;
        return temp;
    }
    public static void Display(int size)
    {
        for(int i =0;i<=size;i++)
        {
            System.out.print(heaparr[i]);
        }
        System.out.println();
    }

    public static void heap(int index, int size,int flag) {

        int left = index * 2;
        int right = index * 2 + 1;
        int small;
        if(flag == 1)
        {    
            if (left <= size && heaparr[left] < heaparr[index]) 
            {
                small = left;
            } 
            else 
            {
                small = index;
            }

            if (right <= size && heaparr[right] < heaparr[small])
            {
                small = right;
            }
        }
        else 
        {
            if (left <= size && heaparr[left] > heaparr[index]) 
            {
                small = left;
            } 
            else 
            {
                small = index;
            }

            if (right <= size && heaparr[right] > heaparr[small])
            {
                small = right;
            }
        }
            if (index != small) {
            int temp = heaparr[small];
            heaparr[small] = heaparr[index];
            heaparr[index] = temp;
            heap(small, size,flag);
        }

    }

    public static void main(String args[])
    {
        NextHighestNum obj = new NextHighestNum();
        int i = 12543;
        System.out.println(i);
        int output = obj.HighestNum(i);
        System.out.println(output);
    }

}
