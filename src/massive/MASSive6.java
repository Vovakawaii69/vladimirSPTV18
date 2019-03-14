package massive;
public class MASSive6 {
    public static void main(String[] args) {
        String[] a={"Каждый","Охотник","Желает","Знать","Где","Сидит","Фазан"}; 
        for(int i=0;i<a.length;i++){ 
        System.out.print(a[i]); 
        }
        int n=a.length; 
        System.out.println(); 
        String temp;
        for(int i=0;i<n/2;i++){
            temp=a[n-i-1];
            a[n-i-1]=a[i];
            a[i]=temp;
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
    
}
