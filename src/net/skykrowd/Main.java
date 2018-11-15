package net.skykrowd;

import java.util.Random;

public class Main {
    
    private static Random rand=new Random();
    
    public static void main(String[] args) {
        int n,r;
        n=rand.nextInt(6)+3;
        r=rand.nextInt(6)+3;
        int mat[][]=new int [n][r];
        
        
        llenar(mat);
        mostrar(mat);
    }
 
    private static void llenar(int a[][]){
        int ren,col,num;
        for(ren=0;ren<a.length;ren++){
            for(col=0;col<a[ren].length;col++){
            num=rand.nextInt(a.length*a[0].length)+1;
            if (verificar(num,a,ren,col)==false)
                a[ren][col]=num;
            else 
                col--;
            }
        }
    }
    
    
    private static boolean verificar(int n,int a[][],int ren,int col){
        boolean ver=false;
        int r,c;
        for(r=0;r<a.length&&ver==false;r++){
            for(c=0;c<a[r].length&&ver==false&&a[r][c]!=0;c++){
                if (a[r][c]==n){
                    ver=true;
                }
            }
        }
        return ver;
    }
    
    
    private static void mostrar(int a[][]){
        int ren,col;
        for(ren=0;ren<a.length;ren++){
            for(col=0;col<a[ren].length;col++){
                System.out.print(a[ren][col]+"\t");
            }
            System.out.print("\n");
        }
    }

}
