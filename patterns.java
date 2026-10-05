public class patterns {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int row=1;row<=5;row++){
            for(int col=1;col<=5-row;col++){
                System.out.print(" ");
            }
            for(int col=1;col<=5;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row=1;row<=5;row++){
            for(int col=1;col<=5-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
