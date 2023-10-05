import java.util.*;
public class arrayofmultiples {
    public static void main(String[] args) {
        Scanner newscan = new Scanner(System.in);
        calculate(7 , 5);
        newscan.close();
    }

    public static int[] calculate(int num, int length){
        int multiples[] = new int[length];

        for (int i = 0; i < length; i++) {
            
            multiples[i] = (num * (i+1));
            System.out.println(multiples[i]);
        }
        return multiples;
    }


}
