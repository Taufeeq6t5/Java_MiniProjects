import java.util.Scanner;

public class Calculator{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int choice;
        double result=0;
        do{
        System.out.println("\n******Calculator Menu******");
        System.out.println("1.Addition.");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Modulus");
        System.out.println("6.Power");
        System.out.println("7.Square");
        System.out.println("8.Exit");

        System.out.print("Enter your choice:");
        choice =sc.nextInt();

        if(choice>=1 && choice<=6 ){
            System.out.print("Enter the first number:");
            int a=sc.nextInt();
            System.out.print("Enter the second number:");
            int b=sc.nextInt();

            switch(choice){
                case 1:result=a+b;
                System.out.println("Result= "+result);
                break;

                case 2:result=a-b;
                System.out.println("Result= "+result);
                break;

                case 3:result=a*b;
                System.out.println("Result= "+result);
                break;

                case 4:if(b==0){
                System.out.println("Error Division By Zero..!");
                }else{
                
                result=a/b;
                System.out.println("Result= "+result);
                }
                break;

                case 5:if(b==0){
                System.out.println("Error Modulus By Zero..!");
                }else{
                
                result=a%b;
                System.out.println("Result= "+result);
                }
                break;

                case 6:result=Math.pow(a,b);
                System.out.println("Result= "+result);
                break;

            }

        }

        else if(choice==7){
            System.out.print("Enter the number:");
            int num=sc.nextInt();

            result=num*num;
            System.out.println("Result= "+result);

        }
        else if (choice==8){
            System.out.println("Exiting Calculator..");
        }
        else{
            System.out.println("Invalid Choice!");
        }

        }while(choice!=8);

        sc.close();

}
}
