package com.company.程序员面试金典例题;

public class question8_4 {
    public static  String compactString(String str){
        int len = str.length() - 1;
        int startIndex =0;
        StringBuilder newStr = new StringBuilder("");
        while(startIndex <= len){
            char startChar = str.charAt(startIndex);
            newStr.append(startChar);
            int sublen = 1;
            int index  = startIndex + 1;
            while(index <= len && startChar == str.charAt(index)){
                sublen++;
                index++;
            }
            startIndex = index;
            newStr.append(sublen);
        }
        return newStr.toString();
    }

    public static void main(String[] args) {
        String str0 = "aabbbccccckkkeee";
        String ster = compactString(str0);

        System.out.println(ster.length() ==str0.length());
    }
}
