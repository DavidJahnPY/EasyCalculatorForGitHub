public class Calculate{
    public Calculate(double pnumber1, String psign, double pnumber2){
        System.out.println("you want to: " + pnumber1 + " " + psign + " " + pnumber2);
        
        double result = 0;
        if(psign.equals("+")){
            result = pnumber1 + pnumber2;
        }
        else if(psign.equals("-")){
            result = pnumber1 - pnumber2;
        }
        else if(psign.equals("*")){
            result = pnumber1 * pnumber2;
        }
        else if(psign.equals("/")){
            result = pnumber1 / pnumber2;
        }
        
        System.out.println("The result of the calculation is: " + result);
    }
}