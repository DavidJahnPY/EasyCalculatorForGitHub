import java.util.Scanner;

public class GainInput{
    String inputString;
    double inputDouble;
    public GainInput(){
    }
    
    public String getInputString(String pmessage){
        printMessage(pmessage);
        Scanner scanner = new Scanner(System.in);
    
        inputString = scanner.nextLine(); // Benutzereingabe lesen
        
        scanner.close(); // Scanner schließen
        return inputString;
    }
    
    public double getInputDouble(String pmessage){
        printMessage(pmessage);
        Scanner scanner = new Scanner(System.in);
    
        inputDouble = scanner.nextDouble(); // Benutzereingabe lesen
        
        scanner.close(); // Scanner schließen
        return inputDouble;
    }

    public void printMessage(String pmessage){
        System.out.println(pmessage);
    }
}