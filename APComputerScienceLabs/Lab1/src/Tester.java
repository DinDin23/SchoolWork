import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        //3
        System.out.println("\"Hello again, world!\"");
        //4
        //"the above prints "Hello again, world!""
        //5
        int numApples = 24;
        //6
        final int PRICE_OF_APPLES = 87;
        //7
        System.out.println("The total for " + numApples + " apples: \n" + (numApples * PRICE_OF_APPLES) + " cents");
        //8
        if(numApples * PRICE_OF_APPLES >= 2000)
            System.out.println("\"Thank you valued customer!\"");
        //9
        for (int i = 1; i < 13; i++)
            System.out.print(i + " ");
        System.out.println();
        //10
        for (int i = 1; i < 10; i++)
            System.out.print(i * i + " ");
        System.out.println();
        //11
        for (int i = 1; i < 257; i *= 4)
            System.out.print(i + " ");
        System.out.println();
        //13
        Scanner console = new Scanner(System.in);
        //14
        String name = console.nextLine();
        //15
        System.out.println(name.length());
        //16
        System.out.println(name.substring(0, 3));
        //17
        double[] areas;
        areas = new double[20];
        //18
        areas[0] = 4.56;
        //19
        int length = areas.length;
        //20
        areas[areas.length - 1] = 8.08;
        //21
        boolean[] arr = {true, true, false, false, true};
        //27
        printStatement();
        System.out.println(sum(5, 8));
        System.out.println(longer("lean", "wit"));
        System.out.println(altCaps("banana"));
        //29
        Player a = new Player();
        Player b = new Player("Dinesh", 28);
        System.out.println(a.playerInfo());
        System.out.println(b.playerInfo());

    }
    //23
    public static void printStatement(){
        System.out.println("\"This is a method!\"");
    }
    //24
    public static int sum(int a, int b){
        return a + b;
    }
    //25
    public static String longer(String a, String b){
        if(a.length() > b.length())
            return a;
        else
            return b;
    }
    //26
    public static String altCaps(String a){
        int counter = 0;
        a = a.toLowerCase();
        char[] arr = a.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(Character.isLetter(arr[i])){
                counter++;
                if(counter % 2 == 1)
                    arr[i] = (char)(arr[i] - 32);
            }
        }
        String fin = "";
        for (int i = 0; i < arr.length; i++)
            fin += arr[i];
        return fin;
    }
}
//28
class Player{
    String name;
    int number;

    public Player(){
        name = "Default";
        number = -1;
    }
    public Player(String name, int number){
        this.name = name;
        this.number = number;
    }
    String playerInfo(){
        return "\"Player: " + name + ", #" + number + "\"";
    }
}