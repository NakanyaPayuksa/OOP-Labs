package lab0;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.print("Enter :");
        i = sc.nextInt();
        for(int j=1;j<=5;j++){
            main(i);

        }
    }
    static void main (int x){
        for(int i=1;i<=x;i++){
            for (int j=1;j<=x;j++) {
                if(i==x||i==1||j==1||j==x){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
