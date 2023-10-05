import java.util.*;
public class minutesecondconvert{
    public static void main(String[] args) {
        Scanner newscan = new Scanner(System.in);
        System.out.println("Enter a minute integer value: ");
        convert(newscan.nextInt());
        newscan.close();
    }
    private static void convert(int minutes){
        System.out.println((minutes*60));
    }
}