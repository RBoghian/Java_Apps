package com.Adventure;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
int[][] matrix =
        {       {0,1,1,2},
                {0,5,0,0},
                {2,0,3,3}};


matrixElementsSum(matrix);
    }

    public static void matrixElementsSum(int[][] matrix) {
        int sum=0;

        for(int i=0;i<matrix.length;i++){

            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]==0){
                    for(int k=j;k<matrix.length;k++){
                        matrix[k][j]=0;
                    }
                }
            }
        }
        for(int x=0;x<matrix.length;x++){
            for(int y=0;y<matrix[x].length;y++){
                System.out.print(matrix[x][y]+" ");
            }
        }
    }
    public static void print(int[][] matrix){
        for(int x=0;x<matrix.length;x++){
            for(int y=0;y<matrix[x].length;y++){
                System.out.print(matrix[x][y]+" ");
            }
        }
    }
}

