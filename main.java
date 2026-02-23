public class main {
   
    public static void main(String[] args)
    {
    savingscalculator calc=new savingscalculator();

    double monthlysavings=calc.monthlysavings(income,expenses);
    double yearlysavings=calc.yearlysavings(monthlysavings);
    double totalsavings=calc.totalsavings(yearlysavings,years);
    
    report r=new report();
    r.generatereport(name,income,expenses,monthlysavings,yearlysavings,totalsavings);

    if(monthlysavings<0)
    {
        System.out.println("WARNING: YOUR EXPENSES MORE THAN INCOME");
    }
}
}
