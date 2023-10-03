public class Finances {

    static int income = 1200;
    static int outgoings = 904;
    static int savings = 847;
    static int totalSavings;
   

    public static void getNet()
    {
    System.out.println("Your net after income and outgoings are calulated: " + (income - outgoings));
    }

   public static void getSavings()
   {
    System.out.println(savings);
   }

   public static void addToSavings(int add)
   {
    savings += add;
    totalSavings = savings;
   }

   public static void showSavings() {
    System.out.println("Your savings are now: " + savings);
   }
}
