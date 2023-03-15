public class VendorMachine {
    final static float CENT = 0.01f; 
    final static float CENT_5 = 0.05f; 
    final  static float CENT_10 = 0.1f; 
    final static float CENT_20 = 0.2f;
    final static float CENT_50 = 0.5f; 
    final static int EURO_1 = 1; 
    final static int EURO_2 = 2; 
    


    public double purchase;
    public double payment;


    public VendorMachine(){
        this.purchase = 0;
        this.payment = 0;

    }

    public static void InsertCoin(double coin)
    {
        if (coin != EURO_2)
             {
                if (coin != EURO_1)
                {
                    if (coin != CENT_50)
                    {
                        if (coin != CENT_20)
                        {
                            if (coin != CENT_10)
                            {
                                 if (coin != CENT_5)
                                {
                                    System.out.println("la moneta inserita non è ammissibile");
                                }
                            }
                        }
                    }
                }
             }
    }

}
