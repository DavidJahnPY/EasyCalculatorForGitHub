public class Calculate{
    
    public Calculate(double pnumber1, String psign1, double pnumber2, String psign2, double pnumber3){
        System.out.println("you want to: " + pnumber1 + " " + psign1 + " " + pnumber2 + " " + psign2 + " " + pnumber3);
        
        double result = 0;
        if(psign1.equals("*") || psign1.equals("/") || psign2.equals("*") || psign2.equals("/")){
            if(psign1.equals("*") && psign2.equals("*") || psign1.equals("*") && psign2.equals("/") ||  psign1.equals("/") && psign2.equals("*") || psign1.equals("/") && psign2.equals("/")              ){
                if(psign1.equals("*")){
                    result = pnumber1 * pnumber2;
                }
                else if(psign1.equals("/")){
                    result = pnumber1 / pnumber2;
                }
                
                if(psign2.equals("*")){
                    result = result * pnumber3;
                }
                else if(psign2.equals("/")){
                    result = result / pnumber3;
                }
            }
            
            else if(psign1.equals("*") || psign1.equals("/")){
                System.out.println("here1");
                if(psign1.equals("*")){
                    System.out.println("here2");
                    result = pnumber1 * pnumber2;
                }
                else if(psign1.equals("/")){
                    result = pnumber1 / pnumber2;
                }
                
                if(psign2.equals("+")){
                    System.out.println("here3");
                    result = result + pnumber3;
                }
                else if(psign2.equals("-")){
                    result -= pnumber3;
                }
            }
            else{
                if(psign2.equals("*")){
                    result = pnumber2 * pnumber3;
                }
                else if(psign2.equals("/")){
                    result = pnumber2 / pnumber3;
                }
                
                if(psign1.equals("+")){
                    result += pnumber1;
                }
                else if(psign1.equals("-")){
                    result = pnumber1 - result;
                }
            }
        }
        else{
                if(psign1.equals("+")){
                    result = pnumber1 + pnumber2;
                }
                else if(psign1.equals("-")){
                    result = pnumber1 - pnumber2;
                }
                
                if(psign2.equals("+")){
                    result += pnumber3;
                }
                else if(psign2.equals("-")){
                    result -= pnumber3;
                }
            }
        
        System.out.println("The result of the calculation is: " + result);
    }
    
    public void calc(){
        
    }
}

