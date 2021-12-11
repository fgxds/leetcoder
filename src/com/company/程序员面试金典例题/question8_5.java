package com.company.程序员面试金典例题;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Scanner;

/**
 * 矩阵翻转90度
 * */
public class question8_5 {

    public static void reverseSuqare(int[][] arr ,int N){
        /**
         * offset1 是纵向偏移量 往上
         * offset2 是横向偏移量 往右
         * */

        for(int offset1=0 ;offset1 < N/2;offset1++){
            for(int offset2=offset1;offset2 < N - offset1 - 1;offset2++){
                int temp = arr[offset1][offset2];
                arr[offset1][offset2] = arr[N - offset2 -1][offset1];  //上
                arr[N - offset2 -1][offset1] = arr[N - offset1 -1][N - offset2 -1]; //左
                arr[N - offset1 -1][N - offset2 -1] = arr[offset2][N - offset1 - 1]; //下
                arr[offset2][N - offset1 - 1] = temp;    //右
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = new int[100][100];
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            arr[i][j] = sc.nextInt();
        }
        question8_5.reverseSuqare(arr,n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


}
