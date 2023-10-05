import java.util.*;
public class highestDigit {
    public static void main(String[] args) {
        Scanner newscan = new Scanner(System.in);
        System.out.println("alg1");
        alg1(newscan.nextInt());
        System.out.println("alg2");
        alg2(newscan.nextInt());
        newscan.close();
    }


    private static void alg1(int num){
        
        int counter = 0, counter2 = 0;
        int indexAt =0, nums = 0, nums2 = num;

        while(nums2 > 0){
            nums2 = nums2/10;
            counter++;

        }

        int numlist[] = new int[counter];
        int orderedList[] = new int[counter];


        while (num > 0){
            
            numlist[counter2] = (num % 10);
            num = num / 10;
            
            counter2++;
            

        }

        for (int i = 0; i < numlist.length; i++) {
            for (int j = 0; j < numlist.length; j++) {
                
                if(numlist[j] > nums ){
                    nums = numlist[j];
                    indexAt = j;
                }
            }
            orderedList[i] = nums;
            numlist[indexAt] = 0;
            indexAt = 0;
            nums = 0;
        }

        for(int i = 0; i < orderedList.length; i++){
            System.out.println(orderedList[i]);
        }
        
    }

    private static void alg2(int num){
        int nums2 = num , counter = 0, counter2 = 0;
        
        while(nums2 > 0){
            nums2 = nums2 / 10;
            counter++;
        }
        System.out.println(counter);
        int digitlist[] = new int[counter];
        System.out.println(digitlist.length);

        while(num > 0){
            digitlist[counter2] = (num % 10);
            num = num / 10;
            counter2++;
        }
        for (int i = 0; i < digitlist.length; i++) {
            System.out.println(digitlist[i]);
        }
    }
}


