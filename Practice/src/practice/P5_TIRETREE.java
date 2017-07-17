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



public class P5_TIRETREE 
{
    private static TrieNode root = new TrieNode();
    public static class TrieNode 
    {
        public HashMap<Character, TrieNode> children = new HashMap<>();
        public int size = 0;
        boolean last = false;
        public void addChild(Character ch) {
            children.put(ch, new TrieNode());
        }
    }
    
    private static void add(String str) 
    {
        TrieNode curr = root;
        for (int i = 0; i < str.length(); i++) 
        {
            Character ch = str.charAt(i);
            if ( ! curr.children.containsKey(ch)) {
                curr.addChild(ch);
            }
            curr = curr.children.get(ch);
            curr.size++; // each time we visit a node (while adding letters), we increment this.
        }
        curr.addChild('*');
    }
    
    public static String temp = "";
    public static void print(TrieNode root1) 
    {
        TrieNode curr = root1;
        //System.out.println(curr.children.values());
            if(!curr.children.isEmpty())
            {
                Set<Character> keys = new HashSet<>();
                keys = curr.children.keySet();
                if(keys.contains('*'))
                    System.out.println(temp);
                for(Character key : curr.children.keySet())
                {
                        System.out.println(curr.children.size()+" " + key +" " + curr.children.keySet());
                        temp = temp.concat(key.toString());
                        print(curr.children.get(key));
                }
            }
    }
    
    public static int find(String str)
    {
        TrieNode curr = root;
        temp = "";
        for(int i = 0;i < str.length();i++)
        {
            if(curr.children.containsKey(str.charAt(i)))
            {
                curr = curr.children.get(str.charAt(i));
                temp = temp.concat(str.substring(i, i+1));    
            }
            else
                return 0;
        }    
        print(curr);
        return curr.size;
    }
    
    public static void main(String[] args) 
    {
        System.out.println("------TRIE Data structure----------");
        ArrayList<Integer> results= new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++) {
            String op = in.next();
            String contact = in.next();
            if (op.equals("add")) {
                add(contact);
            } else if (op.equals("find")) {
                results.add(find(contact));
                //find(contact);
            }
        }
        for(int a : results)
            System.out.println(a);
    }
        
    }
