import java.util.Scanner;
public class conditions {
    public static void main(String[] args) {
        // int dailyPractice=12;
        // if(dailyPractice>=12){
        //     System.out.print(" Keep the same Consistency");
        // }


        Scanner sc=new Scanner(System.in);
        // System.out.print("Enter your age:");
        // int age=sc.nextInt();
        // System.out.print("Your age is: "+age);
        // if(age>=18){
        //     System.out.print("You are eligiable to vote");
        // }
        // else{
        //     System.out.print("Not eligible to vote");
        // }


        // System.out.print("Enter your marks:");
        // int marks=sc.nextInt();
        // if(marks>=90){
        //     System.out.print("A+ Grade");
        // }
        // else if(marks>=80 && marks<90){
        //     System.out.print("Grade:A");
        // }
        // else if(marks>=70 && marks<80){
        //     System.out.print("Grade:B+");
        // }
        // else if(marks>=60 && marks<70){
        //     System.out.print("grade:B");
        // }
        // else{
        //     System.out.print("Fail");
        // }


        // System.out.print("Enter your gender");
        // String gender=sc.next();
        // System.out.print("Enter your age:");
        // int num=sc.nextInt();
        // if(gender.equals("male")){
        //     if(num>5){
        //         System.out.print("You have to pay Bus ticket");
        //     }
        //     else{
        //         System.out.print("Bus Ticket is free");
        //     }
        // }
        // else if(gender.equals("female")){
        //     System.out.print("Bus Ticket is free");
        // }
        // else{
        //     System.out.print("Invalid Input");
        // }    
        
        //Ternary Operator
        // int days=9;
        // String status=(days>40)? "Consistance":"Irredular";
        // System.out.print(status);

        // //Switch Case
        // System.out.print("enter the value of a: ");
        // int a=sc.nextInt();
        // System.out.print("enter the value of b: ");
        // int b=sc.nextInt();
        // System.out.print("1.Add\n2.Subtract\n3.Multiply\n4.Divide");
        // System.out.print("enter the choice");
        // int ch=sc.nextInt();
        // switch (ch) {
        //     case 1:
        //         System.out.print("Addition"+ (a+b));
        //         break;
        //     case 2:
        //         System.out.print("Substraction" + (a-b));
        //         break;
        //     case 3:
        //         System.out.print("Multiplication"+ (a*b));
        //         break;
        //     case 4:
        //         System.out.print("Division"+ (a/b));
        //         break;
        //     default:
        //         System.out.print("Invalid input");
        //         break;
        //}


        System.out.print("Enter the marks of Subject1: ");
        int m1=sc.nextInt();
        System.out.print("Enter the marks of Subject2: ");
        int m2=sc.nextInt();
        System.out.print("Enter the marks of Subject3: ");
        int m3=sc.nextInt();
        System.out.print("Enter the marks of Subject4: ");
        int m4=sc.nextInt();
        System.out.print("Enter the marks of Subject5: ");
        int m5=sc.nextInt();
        System.out.print("Enter the marks of Subject6: ");
        int m6=sc.nextInt();

        int total=m1+m2+m3+m4+m5+m6;
        double percenatge=(total/600.0)*100;
        System.out.println("Total: "+total);
        System.out.println("Percentage: "+percenatge+"%");

    
        sc.close();
    }
}
