package wrapperclass;

/**
 * Created by expert on 29/6/18.
 */
public class Ex1 {
    public static void main(String[] args) {
        int a=10;
        Integer i=Integer.valueOf(a);
        Integer k=a;
        System.out.println(k);//autoboxing
        float f=10.0f;
        Float f1=Float.valueOf(f);
        System.out.println(f);
        String s="123";
        Integer x1=Integer.parseInt(s);
        System.out.println(x1);
        float d= 10.67f;
        int x= (int) d;//typecasting
        Float j=new Float(10.09);
        float l=j.floatValue();
        System.out.println(l);
        int b=10;
        float c=b;
        System.out.println(c);
        byte n=11;
        int e=n;
        System.out.println(e);



    }
}
