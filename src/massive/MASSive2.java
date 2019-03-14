package massive;
public class MASSive2 {
    public static void main(String[] args) {
        boolean[]arr=new boolean[1000];
        for(int i=0;i<arr.length;i=i+2){
            arr[i]=true;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
