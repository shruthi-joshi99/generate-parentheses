package com.example.generateparentheses;

public class Helper {
    public void helper(String str, Integer open, Integer close, Integer N) {
        if (open < N)
        {
            StringBuilder sb1 = new StringBuilder();
            sb1.append(str);
            sb1.append("(");
            String temp1 = sb1.toString();
            helper(temp1, open+1, close, N);
        }

        if (close < open)
        {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(")");
            String temp2 = sb2.toString();
            helper(temp2, open, close+1, N);
        }

        if (open==N && close==N)
        {
            System.out.println(str);
        }
    }
}
