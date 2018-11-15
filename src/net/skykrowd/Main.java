package net.skykrowd;

import java.util.Random;

public class Main {

    private static Random r = new Random();

    public static void main(String[] args) {
        int ren=r.nextInt(5)+3;
        int col=r.nextInt(5)+3;
        int mat[][] = new int [ren][col];

        llenar(mat);
        mostrar(mat);
    }


    private static void llenar(int mat[][]){
        int ren, col, n;

        for(ren=0;ren<mat.length;ren++){
            for(col=0;col<mat[ren].length;col++){
                n=r.nextInt(mat.length*mat[col].length)+1;
                if(!verificar(n, mat, ren, col))
                    mat[ren][col]=n;
                else
                    col--;
            }
        }
    }

    private static boolean verificar(int n, int mat[][], int ren, int col){
        boolean ver=false;
        int r,c;
        for(r=0; r<=ren && !ver; r++){
            for(c=0;c<=col && !ver;c++){
                if(n==mat[r][c])
                    ver=true;
            }
        }


        return ver;
    }

    private static void mostrar(int mat[][]){
        int r,c;
        for(r=0;r<mat.length;r++){
            for(c=0;c<mat[r].length;c++){
                System.out.print(mat[r][c]+"\t");
            }
            System.out.print("\n");

        }

    }
}

