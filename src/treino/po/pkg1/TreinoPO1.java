package treino.po.pkg1;

import java.util.Scanner;
/**
 *
 * @author paulo
 */
public class TreinoPO1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        //1
        System.out.print("Olá mundo\n");
       //2
        int vet[] = new int[10];
        System.out.print("Informe os valores do Vetor:\n");
        for(int i=0; i<10; i++){
        //vet[i]= ler.nextInt();
          vet[i]= i;
        }
        for(int i=0; i<10; i++){
        System.out.print(vet[i]);
        System.out.print(" ");
        }
        //3
        int mat[][] = new int [10][10];
        System.out.print("\nInforme os Valores da Matriz:\n");
        for(int i=0; i<10; i++){
        for(int j=0; j<10; j++){
        //mat[i][j]=ler.nextInt();
          mat[i][j]= j;
        }}
        for(int i=0; i<10; i++){
        for(int j=0; j<10; j++){
        System.out.print(mat[i][j]);
        System.out.print(" ");
        }
        System.out.print("\n");
        }
        //4
        int max,min,med=0;
        int vet2[] = new int[10];
        System.out.print("Informe os valores do Vetor:\n");
        for(int i=0; i<10; i++){
        //vet2[i]= ler.nextInt();
          vet2[i]= i;
        }
        for(int i=0; i<10; i++){
        System.out.print(vet2[i]);
        System.out.print(" ");
        }
        max = vet2[0];
        min = vet2[0];
        for(int i=0; i<10; i++){
        if(vet2[i]>max)
            max = vet2[i];
        if(vet2[i] < min)
            min = vet2[i];
        med = med + vet2[i];
        }
        System.out.println("\nMaximo elemento é " + max);
        System.out.println("Minimo elemento é " + min);
        System.out.println("Media dos elementos é " + med/10);
    }  
}