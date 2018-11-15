package net.skykrowd;

public class TrianguloDePascal {


    public static void main(String[] args) {
        
        int mat[][] = new int [7][13];
        mat[0][6]=1;
        
        mat = llenar(mat);
        
        mostrar(mat);
    }
    
    private static int [][] llenar(int mat[][]){
        int r,c;
        
        
            for(r=1;r<mat.length;r++){
                for(c=0;c<mat[r].length;c++){
                        if(r >= 1 && c >= 1)
                        mat[r][c]+=mat[r-1][c-1];
                       
                        if(r <= 6 && c < 12)
                        mat[r][c]+=mat[r-1][c+1];
                       
                }
            }
        
        return mat;
    }

    
    private static void mostrar(int mat[][]){
        for(int i=0; i < mat.length; i++){
            for(int j=0; j <mat[i].length; j++){
                System.out.print(mat[i][j]+"\t");
            }
            System.out.print("\n");
        }
        
    }
    
}
