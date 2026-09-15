package lab0;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner sc=new Scanner(System.in);
        char check;
        String comment;
        System.out.print("Do you want to play ? (Y/N) : ");
        check = sc.next().charAt(0);
        if(check=='Y'||check=='y'){
            System.out.println("Ready !!!");
            main(sc);
        }
        else if(check=='N'||check=='n'){
            System.out.println("Why don't you want to play? ");
            System.out.print("Give me a reason why I don't want to play : ");
            comment = sc.nextLine();
        }
        else{
            System.out.println("ERROR!!!");
        }
    }
    static void main (Scanner sc){
        char check;
        while (true) {
            System.out.print("Do you love me ? (Y/N) : ");
            check = sc.next().charAt(0);
            if(check=='Y'||check=='y'){
                System.out.println("I Love You Too My Love.");
                break;
            }
            else if(check=='N'||check=='n'){
                System.out.println("I'm Very Sad. T_T");
                break;
            }
            else{
                System.out.println("ERROR!!!");
            }    
        }
    }
}
