package OOP.Buoi1;

import java.util.Scanner;

public class Bai5 {
    static void inputMatrix(int matrix[][], int n, int m){
        Scanner scann = new Scanner(System.in);
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++){
                System.out.print("Nhap vao phan tu matrix["+i+"]["+j+"]: "); matrix[i][j] = scann.nextInt();
            }
    }

    static void outputMatrix(int matrix[][], int n, int m){
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++)
                System.out.print(matrix[i][j]+" ");
            System.out.println();
        }
    }

    static void outputMatrixNT(int matrix[][], int n, int m){
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                if (Bai2.checkNT(matrix[i][j]))
                    System.out.print(matrix[i][j]+" ");
                else System.out.print("0 ");
            }
            System.out.println();
        }
    }

    static int[][] sortMatrix(int matrix[][], int n, int m){
        for (int i =0; i<n; i++)
            for (int j = i+1; j<n; j++)
                for (int k =0; k<m; k++)
                    if (matrix[i][k] > matrix[j][k]){
                        int temp = matrix[i][k];
                        matrix[i][k] = matrix[j][k];
                        matrix[j][k] = temp;
                    }
        return matrix;
    }

    static void maxMatrix(int matrix[][], int n, int m){
        int max = matrix[0][0]; int hang=0; int cot=0;
        for (int i=0; i<n; i++)
            for (int j=0; j<m; j++)
                if (matrix[i][j] > max){
                    max = matrix[i][j];
                    hang = i;
                    cot = j;
                }
        System.out.println("Max= "+max+", o hang "+hang+" cot "+cot);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int matrix[][] = new int[0][0];
        int n = 0, m=0;
        while (true){
            System.out.println("1. Nhap ma tran.");
            System.out.println("2. In ma tran.");
            System.out.println("3. Tim max ma tran.");
            System.out.println("4. In ma tran nguyen to.");
            System.out.println("5. Sap xep ma tran theo cot.");
            System.out.println("6. Exit.");
            System.out.print("Nhap chuc nang: "); int choose = scan.nextInt();
            switch (choose){
                case 1:
                    System.out.print("Nhap vao so hang cua ma tran: "); n = scan.nextInt();
                    System.out.print("Nhap vao so cot cua ma tran: "); m = scan.nextInt();
                    matrix = new int[n][m];
                    inputMatrix(matrix, n, m);
                    continue;
                case 2:
                    outputMatrix(matrix, n, m);
                    continue;
                case 3:
                    maxMatrix(matrix, n, m);
                    continue;
                case 4:
                    outputMatrixNT(matrix, n, m);
                    continue;
                case 5:
                    matrix = sortMatrix(matrix, n, m);
                    outputMatrix(matrix, n, m);
                    continue;
                case 6:
                    break;
            }
            break;
        }
    }
}
