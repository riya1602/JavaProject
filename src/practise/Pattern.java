package practise;

/**
 * Created by expert on 29/6/18.
 */
public class Pattern {
    public static void main(String[] args) {
        int c=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5-i;j++) {
                System.out.println(" ");
            }
                for(int k=0;k<=c;k++){
                    System.out.print("*");
                }
                c=c+2;


        }
    }
}
