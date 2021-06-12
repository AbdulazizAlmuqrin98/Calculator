import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
//Github : https://github.com/AbdulazizAlmuqrin98/Calculator
public class main {
	
	public static void run() {
	    String s1 = getInput("Enter a numeric value :");
        String s2 = getInput("Enter a numeric value :");
        String op = getInput("Chose"+"\n1- Add" +"\n2- Subtract"+ "\n3- Multiply "+ "\n4- Divide");
        
        int opInt = Integer.parseInt(op);
        double result = 0;
        
        switch (opInt) {
        case 1:
            result = addValues(s1,s2);
            break;

        case 2 :
            result = subtractValues(s1,s2);
            break;
            
        case 3:
            result = multiplyValues(s1,s2);
            break;
        case 4:
            result = divideValues(s1,s2);
            break;
        default:
            System.out.println("You Entered an incorrect value");
            return;
        }
        System.out.println("The answer is : " + result);
        try {
        Scanner s = new Scanner(System.in);
       
        System.out.println("Would you like to run program again? (Y for yes, N for no)");
        String decision = s.next();
        if(decision.equals("Y")) {
            run();
        } else if (decision.equals ("N")) {
            System.out.println("Finished");
            System.exit(0);
        }
        
         } catch (Exception e) {
        System.err.println("Something went wrong.");
        }
   }
	
	
	public static void main(String[] args) {
        run();

    }



	private static String getInput(String prompt) {
        BufferedReader stdin = 
                new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println(prompt);
        System.out.flush();
        
        try {
            return stdin.readLine();
        }catch(Exception e) {
            return "Error : " + e.getMessage();
        }
    }



private static double divideValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double result = d1 / d2;
        return result;
    }



    private static double multiplyValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double result = d1 * d2;
        return result;
    }


private static double subtractValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double result = d1 - d2;
        return result;
    }

    private static double addValues(String s1, String s2) {
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double result = d1 + d2;
        return result;
    }

	
}
