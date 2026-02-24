import java.util.Scanner;
 class DetailsOfExpenditure
{
   Scanner sc=new
   Scanner(System.in);
   
   double rent;
   double emi;
   double monthlysavings;
   double utilities;
   double shopping;
   double groceryitems;
   void fixedExpenditure()
  {
  System.out.println("enter Rent");
   rent=sc.nextDouble();
   System.out.println("enter emi");
   emi=sc.nextDouble();
   System.out.println("Monthly savings");
   monthlysavings=sc.nextDouble();
   
   }
   void changedExpenditure()
   {
     System.out.println("enter daily utilities");
   utilities=sc.nextDouble();
   System.out.println("enter shopping if do else enter 0");
   shopping=sc.nextDouble();
   System.out.println("enter grocery item expenditure");
   groceryitems=sc.nextDouble();

   }
    double caculationmonthlyExpenditure()
       {
       double totalExpenditure=rent+emi+utilities+shopping+groceryitems;
       return totalExpenditure;
        }
        }
  public class IncomeEstimation
  {
  public static void main(String[] args)
  {
   DetailsOfExpenditure obj=new  DetailsOfExpenditure();
 
  obj.fixedExpenditure();
   obj.changedExpenditure();
    double totalExpenditure=obj.caculationmonthlyExpenditure();
    }
    }
        
