package lab0;
public class Akkarawit {
    public static void main(String[] args) {
        int i;
        for(i=0;i<5;i++){
            main();
        }
    }
    static void main(){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if ((i == 0 && (j == 1 || j == 2 || j == 4 || j == 5)) ||
                    (i == 1 && (j != 0 && j != 6)) ||
                    (i == 2 && (j != 0 && j != 6)) ||
                    (i == 3 && (j != 1 && j != 5)) ||
                    (i == 4 && (j != 2 && j != 4)) ||
                    (i == 5 && j == 3)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}