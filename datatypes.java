public class datatypes {
    static void main(){
        
        //integer
        int n = 19;
        byte a = 10;
        long newNum=a; //implicit-storing small data type in bigger one
         //-127 to 127
        short sh = 9877;
        long l = 987678543;
        System.out.print(n);

        long val1=123456789;
        int val2=(int)val1; //explicit-coverting larger data type in smaller

        //float
        float f = 5.8f;
        double d=5.8;

        //character
        char c='s';

        //boolean
        boolean b=true;

        //Char
        char name='S';

        //string
        String world="Sangeetha";

        System.out.println(f);
        System.out.println(a);
        System.out.println(newNum);
        System.out.println(val2);
        System.out.println(sh);
        System.out.println(l);
        System.out.println(d);
        System.out.println(c);
        System.out.println(b);
        System.out.println(world);
        //System.out.println("My First cahracter is :"+ name);
        //System.out.println("My First cahracter is :"+ (name+2));
        System.out.println("My First cahracter is :"+ (int)(name));
        //System.out.println("My First cahracter is :"+ (char)(name+1)); //explicit example

    }
}
    
