import java.util.*;
class project{
    public static void main(String[] args){
        System.out.println("                    Personal expense & budget manager");
        System.out.println("                            *---WELCOME---*");
        Scanner sc=new Scanner(System.in);
        String str;
        double money;
        int p,r;
        System.out.println("Create your own budget manager:");
        System.out.println("Enter your name:");
        str=sc.nextLine();
        System.out.println("Enter your monthly income:");
        money=sc.nextDouble();
        System.out.println("---MENU---");
        System.out.println("1.Enter your expenses \n 2.monthly analysis \n 3.check balance");
        System.out.print("Enter your desired option from the menu:");
        p=sc.nextInt();
        switch (p) {
            case 1:System.out.println("---MENU---");
                    System.out.println("1.Fixed expenses \n 2.Variable expenses \n 3.Extra expenses");
                    System.out.println("Enter the operation you need from the menu");
                    r=sc.nextInt();
                    switch(r){
                        case 1:System.out.println("FIXED EXPENSES");
                                break;
                        case 2:System.out.println("VARIABLE EXPENSES");
                                break;
                        case 3:System.out.println("EXTRA EXPENSES");
                    }                
                break;
            case 2:System.out.println("MONTHLY ANALYSIS");
                    break;
            case 3:System.out.println("CHECK BALANCE");
                    break;
            default:
                throw new AssertionError();
        }}

    } 