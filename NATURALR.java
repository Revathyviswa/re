/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package naturalr;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class NATURALR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        for(int i=0;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("the sum is"+sum);
    }
    }

