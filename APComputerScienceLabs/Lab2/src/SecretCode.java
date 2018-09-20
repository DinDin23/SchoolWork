import java.util.Scanner;

public class SecretCode {
    String key;
    String code;

    public SecretCode(String key, String code){
        this.key = key;
        this.code = code;
    }
    public String decode(){
        Scanner numbers = new Scanner(code);
        String fin = "";
        while (numbers.hasNextInt())
            fin += key.charAt(numbers.nextInt());
        return fin;
    }
}
