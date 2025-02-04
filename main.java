public class main{
    public static void main(String []args){
        System.out.println("hello World");
        GainInput gainInput = new GainInput();
        
        double number1 = gainInput.getInputDouble("Please enter the first number for calculations: ");
        String sign = gainInput.getInputString("Please enter whether you want to calculate with '+', '-', '*', '/': ");
        double number2 = gainInput.getInputDouble("Please enter the second number for calculations: ");
        
        Calculate calculate = new Calculate(number1, sign, number2);
    }
}