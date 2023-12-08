package com.example.generateparentheses;

public class GenerateParentheses {
    public static void main(String[] args) {

        int A = 4;
        String str = "";

        Helper helper1 = new Helper();
        helper1.helper(str, 0, 0, A);
    }
}
