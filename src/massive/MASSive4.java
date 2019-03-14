package massive;
public class MASSive4 {
    public static void main(String[] args) {
        int[]array1=new int[10];
        array1[0]=5;
        array1[1]=20;
        array1[2]=80;
        array1[3]=320;
        array1[4]=1280;
        array1[5]=5120;
        array1[6]=20480;
        array1[7]=81920;
        array1[8]=327680;
        array1[9]=1310720;
        int sum=0;
        for(int i=0;i<array1.length;i++){
            sum+=array1[i];
        }
        for(int i=0;i<array1.length;i++){
            System.out.println(array1[i]);
        }
        System.out.println("sum = "+sum);
    }
    
}
