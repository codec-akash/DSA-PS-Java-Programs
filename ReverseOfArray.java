/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse.of.array;

/**
 *
 * @author shubhendu
 */
import java.util.Scanner;
public class ReverseOfArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        int n=0,m=0,i,b;
        System.out.println("enter the row size of the array");
        System.out.println("enter the column size of the array");

        n=in.nextInt();
        m=in.nextInt();
        int arr[][]=new int[2][2];
        
        System.out.println("enter elements");
        for(i=0;i<2;i++)
        {
            for(b=0;b<2;b++)
            {
            arr[i][b]=in.nextInt();
        }
        }
            System.out.println("entered elements are:");
            for(i=0;i<2;i++)
            {
                for(b=0;b<2;b++)
                {
                    System.out.print(arr[i][b]+ " ");
                }
                System.out.println();
            }
            System.out.println("reverse of matrix is:");
            for(i=2-1;i>=0;i--)
            {
                for(b=2-1;b>=0;b--)
                {
                    System.out.print(arr[i][b]+ " ");
                }
                System.out.println();
            }
        

              
          
    
    
        }
    }

   