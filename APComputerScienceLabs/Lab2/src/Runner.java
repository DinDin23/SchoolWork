//3
public class Runner {
    public static void main(String[] args) {
        //4
        StringMethods test = new StringMethods();
        System.out.println(test.stringRipper("hello"));
        test.unusualHello("Dinesh");
        SecretCode obj = new SecretCode("hello world", "6 4 0 5 3 4 2");
        System.out.println(obj.decode());
    }
}
