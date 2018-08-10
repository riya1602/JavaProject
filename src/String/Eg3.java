package String;

/**
 * Created by expert on 26/6/18.
 */public class Eg3 {
    public static void main(String[] args) {
        String s2="DEF";
        char ch[]={'h','e','l'};
        String s4=new String(ch);
        String s5=" heLlo world ";
        String s6="hi,hello,helloworld";
        System.out.println(s5.trim());
        System.out.println(s5.toUpperCase());
        System.out.println(s5.toLowerCase());
        System.out.println(s5.charAt(2)+" "+"length="+s5.length());
        String[] s7=s6.split(",");
        for(String i:s7){
            System.out.println(i);
        }
        char[] ch1=s2.toCharArray();
        for(char k:ch1){

            System.out.println(k);
        }

    }
}
