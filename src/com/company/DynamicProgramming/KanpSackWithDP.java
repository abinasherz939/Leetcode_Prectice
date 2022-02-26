package com.company.DynamicProgramming;

import javax.swing.*;

public class KanpSackWithDP {

//    static int[][] t = new int[value.length+1][weight.length+1];

    public  int KnapSack(int [] value, int []weight , int capacity, int n, int[][]t){
        //solution with only recursion
// int[][]t;
        if (n==0||capacity==0){
            return 0;
        }
//        if (t)
        if (weight[n-1]>capacity){
            return KnapSack(value, weight, capacity, n-1,t);

        }
        else {
            return Math.max( value[n-1] +KnapSack(value, weight, capacity-weight[n-1], n-1,t), KnapSack(value, weight, capacity, n-1,t));
        }

    }




    public static void main(String[] args) {
        int[] value = {20,5,10,40,15,25};
        int[] weight = {1,2,3,8,7,4};
        int capacity = 10;
        int[][] t = new int[value.length+1][weight.length+1];
        for (int i = 0; i < value.length+1; i++) {
            for (int j = 0; j < weight.length+1; j++) {
                t[i][j] = -1;
            }
        }



        KanpSackWithDP kanpSackWithDP = new KanpSackWithDP();

        int max =  kanpSackWithDP.KnapSack(value, weight, capacity,value.length,t);

        System.out.println(max);


    }
}
