import java.util.Scanner;

public class Vstupy {

    public static String vstup(){
        for (;;){
            Scanner sc = new Scanner(System.in, "UTF-8");
            String input = sc.next();
            if (input.equals("A") || input.equals("a") || input.equals("B") || input.equals("b")){
                return input;
            }
            else {
                Text.spatnyIndex();
            }
        }
    }
}
