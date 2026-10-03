public class loops {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }
        for(int i=1;i<=5;i++){
            System.out.println(i+"."+"Sangeetha");
        }
        for(int i=0;i<=10;i+=2){
            System.out.println(i);
        }
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=3;i++){
            for(int j=1;j<=3;j++){
                System.out.println("i= "+i+",j= "+j);
            }
        }
        for(int i=1;i<=10;i++){
            if(i==7){
                break;
            }
            System.out.println(i);
        }
        for(int i=1;i<=10;i++){
            if(i==4){
                continue;
            }
            System.out.print(i+"\t");
        }
        for(int i=1;i<=10;i++){
            if(i==4 || i==2 || i==7){
                continue;
            }
            System.out.print(i+"\t");
        }







        int i=0;
        while (i<=20) {
            System.out.print(i+"\t");
            i++;
        }

        int a=1;
        while(a<=2){
            int j=1;
            while(j<=3){
                System.out.println("i= "+a+",j= "+j);
                j++;
            }
            a++;
        }



        int d=1;
        do{
            System.out.println(d);
            d++;
        }
        while(d<=5);
    }
}
