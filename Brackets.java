package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Brackets {

    static String isBalanced(String s) {
        int length = s.length();
        Stack<Character> stack = new Stack<Character>();

        for(int i = 0; i<length; i++){
            char ch = s.charAt(i);
            switch (ch){
                case '{':
                case '[':
                case '(':
                    stack.push(ch);
                    break;
                case '}':
                    if(stack.isEmpty() || !stack.peek().equals('{')){
                        return "NO";
                    }
                    stack.pop();
                    break;
                case ']':
                    if(stack.isEmpty() || !stack.peek().equals('[')){
                        return "NO";
                    }
                    stack.pop();
                    break;
                case ')':
                    if(stack.isEmpty() || !stack.peek().equals('(')){
                        return "NO";
                    }
                    stack.pop();
                    break;
            }
        }

        if(stack.isEmpty()) return "YES";
        else return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }
}
