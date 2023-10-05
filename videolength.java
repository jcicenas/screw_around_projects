import java.util.*;
public class videolength {
    public static void main(String[] args) {
        Scanner newscan = new Scanner(System.in);
        System.out.println("Input a string in the format MM:SS");
        minutesToSeconds("40:00");

        newscan.close();
    }

    public static void minutesToSeconds(String length){
        int minute = 0;
        int second = 0;
        String list[] = new String[length.length()];
        int newlist[] = new int[length.length()-1];
        
        for (int i = 0; i < list.length; i++) {
            list[i] = length.substring(i, i+1);
            System.out.println(list[i]);
        }
        for (int i = 0; i < list.length; i++) {
            if(list[i] != (":")){
                System.out.println(list[i]);
                newlist[i] = Integer.parseInt(list[i]);
                System.out.println(newlist[i]);
            }
        }
        System.out.println(newlist[0] + newlist[1]);
        
        
    }
}
