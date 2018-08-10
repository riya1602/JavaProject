package pgms;

/**
 * Created by expert on 13/6/18.
 */
public class SecondLarge {
    public static void main(String[] args) {
        int a[]={10,2,3,-1,-2,100,101,75,65};

        int max=a[0],b=0;
        for(int i=1;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("largest:"+max);
        int max2=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max2&a[i]<max){
                max2=a[i];
            }
        }
        System.out.println("second largest:"+max2);
    }
}
