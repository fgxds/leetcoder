package com.company.leetcode同类题型.String;


import java.util.HashMap;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * 罗马数字转成 整数
 * */
public class Roman_to_Integer {
    public int romanToInt(String s) {
        int[] romanMapping = new int[255];
        romanMapping['I'] = 1;
        romanMapping['V'] = 5;
        romanMapping['X'] = 10;
        romanMapping['L'] = 50;
        romanMapping['C'] = 100;
        romanMapping['D'] = 500;
        romanMapping['M'] = 1000;

        char[] romanArry = s.toCharArray();
        int result = 0;
        int i =0;
        while(i < romanArry.length){
            if(i+1 < romanArry.length && romanMapping[romanArry[i]] < romanMapping[romanArry[i + 1]]){
                result += romanMapping[romanArry[i + 1]] - romanMapping[romanArry[i]];
                i+=2;
            }else{
                result+=romanMapping[romanArry[i]];
                i++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(new Roman_to_Integer().romanToInt("MCMXCIV"));
    }
}
