package net.skykrowd;

import java.util.Random;

public class PractricaArreglos {
    
    public static Random r = new Random();
    
    public static void main(String[] args) {
        int ren=r.nextInt(5)+3;
        int col=r.nextInt(5)+3;
        int mat[][] = new int [ren][col];
        
        mat = llenar(mat);
        mostrar(mat);
    }

    
    public static int [][] llenar(int mat[][]){
        int ren, col, n;
        
        for(ren=0;ren<mat.length;ren++){
            for(col=0;col<mat[ren].length;col++){
                n=r.nextInt(mat.length*mat[col].length)+1;
                if(verificar(n,mat,ren,col)==false)
                    mat[ren][col]=n;
                else
                    col--;
            }
        }
        
        return mat;
    }
    
    public static boolean verificar(int n, int mat[][], int ren, int col){
        boolean ver=false;
        int r,c;
        for(r=0;r<=ren && ver==false;r++){
            for(c=0;c<=col && ver==false;c++){
                if(n==mat[r][c])
                    ver=true;
            }
        }
        
        
        return ver;
    }
    
    public static void mostrar(int mat[][]){
        int r,c;
        for(r=0;r<mat.length;r++){
            for(c=0;c<mat[r].length;c++){
                System.out.print(mat[r][c]+"\t");
            }
            System.out.print("\n");
            
        }
        
    }
}
