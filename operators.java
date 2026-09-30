public class operators {
    static void main(){
        //Arthematic
        int a=90;
        int b=23;

        int add=a+b; 
        int sub=a-b;
        int mul=a*b;
        int div=a/b;
        int mod=a%b;
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);

        //Relational
        int s=87;
        int u=76;
        System.out.println(s==u);
        System.out.println(s!=u);
        System.out.println(s>u);
        System.out.println(s<u);
        System.out.println(s>=u);
        System.out.println(s<=u);

        //Logical
        boolean q=true;
        boolean w=false;
        System.out.println(q&&w);
        System.out.println(q || w);
        System.out.println(!q);
        

        //Assignment
        int i=123;
        System.out.println(i);

        //Unary
        int d=98;
        int r=d++;
        int y=++d;
        System.out.println(r);
        System.out.println(y);
    }
}
