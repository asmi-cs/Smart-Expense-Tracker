//calculations
public class savingscalculator
{
   // double income;
    //double expenses;

   public double monthlysavings(double income,double expenses)
   {
   return income-expenses;
   }
   public double yearlysavings(double monthlysavings)
   {
     return monthlysavings*12;
   }
   public double totalsavings( double yearlysavings,int years)
   {
    return yearlysavings *years;
   }
}
