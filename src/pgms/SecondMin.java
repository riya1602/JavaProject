package pgms;

/**
 * Created by expert on 13/6/18.
 */
public class SecondMin {
    public static void main(String[] args) {
        int a[]={10,2,3,-1,-2,100,101,75,65};

        int min=a[0],b=0;
        for(int i=1;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("minimum:"+min);
        int min2=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<min2&a[i]>min){
                min2=a[i];
            }
        }
        System.out.println("second minimum:"+min2);
    }
}
