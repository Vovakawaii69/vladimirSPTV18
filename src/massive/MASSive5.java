package massive;

import java.util.Random;

public class MASSive5 {
    public static void main(String[] args) {
        int[]nums=new int[10];
        Random rnd=new Random();
        for(int i=0;i<nums.length;i++){
            nums[i]=rnd.nextInt(100);
            System.out.printf("%5d",nums[i]);
        }
        System.out.println();
        int max=nums[1];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        System.out.println("Max numbers : "+max);
    }
    
}
