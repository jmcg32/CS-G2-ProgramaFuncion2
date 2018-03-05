package programafuncion2;

import java.util.Scanner;

public class ProgramaFuncion2 {

    public static void main(String[] args) {
    
       Scanner Teclado= new Scanner (System.in);
                 
       System.out.println("Número de datos en el vector A: ");
       int n = Teclado.nextInt();
       double[] A= new double[n];
       
       for (int i = 0; i<n;i++){
           System.out.println("Número "+(i+1));
           A[i]= Teclado.nextFloat();
       }
           
       System.out.println(" ");
       System.out.println("Número de datos en el vector B: ");
       int p = Teclado.nextInt();
       double[] B= new double[p];
       
       for (int i = 0; i<p;i++){
           System.out.println("Número "+(i+1));
           B[i]= Teclado.nextFloat();
       }      
       for (int i = 0; i<n;i++){
           System.out.print("  " +A[i]);                      
       }       
       System.out.println(" ");
       for (int i = 0; i<p;i++){
           System.out.print("  " +B[i]);                      
       }
       
       int T=n+p;
       double[] C= new double[100000];
       int contador=0;
       int m=0;
       //Barrido de A en B
       
       for (int i=0; i<n; i++){
           for(int j=0;j<p;j++){
               if(A[i]==B[j]){
                   j=p;
               }
               if (j==(p-1)){
                   C[contador]=A[i];
                   contador=contador+1;
               }
               
           }
       }
       
       
       for (int i=0; i<p; i++){
           for(int j=0;j<n;j++){
               if(A[j]==B[i]){
                j=n;
               }
               if (j==(n-2)){
                C[contador]=B[i];   
                contador=contador+1;
               }
           }
       }
       
       
     System.out.println(" ");
       for (int i = 0; i<contador;i++){
           System.out.print("  " +C[i]);                      
       }
       
    }
    
}
