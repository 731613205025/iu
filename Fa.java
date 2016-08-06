/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fa;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Fa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              int n,d,r,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of range:");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            d=i%10;
            r=i/10;
            if(d==2){
                count=count+1;
            }
            if(r==2){
                count++;
            }
        
        }
        System.out.println("count is:"+count);
    }
    
}
    

