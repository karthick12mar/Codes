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

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class P6_StackBrackets {
    public static class stack
    {
        char c;
        stack next;
        stack(char c)
        {
          this.c = c;
          this.next = null;
        }
    }
    
    public static stack push(stack Top,char c)
    {
        stack Temp = new stack(c);
        Temp.next = Top;
        Top = Temp;
        return Top;
    }
    
    public static boolean pop(stack Top,char NewCh)
    {
        switch(Top.c)
        { 
            case '{' :
                if(NewCh != '}')
                    return false;
                break;
            case '[' :
                if(NewCh != ']')
                    return false;
                break;
            case '(' :      
                if(NewCh != ')')
                    return false;
                break;
        }
        
        return true;
    }
    
    public static boolean isBalanced(String expression) 
    {
        switch (expression.charAt(0))
        {
            case ']' :
            case '}' :
            case ')' :      
                return false;            
        }
        
       // { - 1
       // [ - 2
       // ( - 3
        stack Top = new stack(expression.charAt(0));
        for(int i=1;i<expression.length();i++)
        {
            boolean result = true;
            switch (expression.charAt(i))
            {
                case '[' :
                case '{' :
                case '(' :    
                    Top = push(Top,expression.charAt(i));
                    break;
                case ']' :
                case '}' :
                case ')' : 
                    result = pop(Top,expression.charAt(i));
                    if(!result)
                        return false;
                    else 
                        Top = Top.next;
                    break;
             }         
        }
        if(Top != null)
            return false;
        return true;
        
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
