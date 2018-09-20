import java.util.Scanner;

//2
public class StringMethods {
    //5
    public void unusualHello(String name){
        System.out.println("Hello " + name + ", you dummy!");
    }
    //6
    public String stringRipper(String phrase){
        return phrase.substring(0, 1) + phrase.substring(phrase.length() - 1, phrase.length());
    }
    //7
    public String mirrorEnds(String s){
        boolean stillMirror = true;
        int i = 0;
        String str = "";
        while(stillMirror){
            if(s.charAt(i) == s.charAt(s.length() - i))
                str += s.charAt(i);
            else
                stillMirror = false;
        }
        return str;
    }
    //9
    public boolean hasSub(String str, String sub){
        int len = sub.length();
        for (int i = 0; i < str.length() - 3; i++) {
            if(str.substring(i, i + len).equals(sub))
                return true;
        }
        return false;
    }
    //10
    public boolean evenFooBar(String str){
        str.replaceAll("foo", "1");
        str.replaceAll("bar", "2");
        int foo = 0, bar = 0;
        for(char c : str.toCharArray()){
            if(c == 1)
                foo++;
            else if (c == 2)
                bar++;
        }
        return (foo == bar);
    }
    //11
    private  String microwaveTime(String str){
        if(str.length() < 1 || str.length() >= 5) return "invalid input";
        String fin = "";
        if(str.length() == 2) return fin + 0 + ":" + str;
        else if(str.length() == 1) return fin + 0 + ":0" + str;
        return str.substring(0, 2) + ":" + str.substring(2, 4);
    }
    //12
    public String reverseWords(String str){
        String[] words = str.split(" ");
        String fin = "";
        for (int i = words.length; i >= 1; i--)
            fin += words[i] + " ";
        return fin;
    }
    //13
    public int sumString(String str){
        Scanner kb = new Scanner(str);
        int num = 0;
        while (kb.hasNextInt())
            num += kb.nextInt();
        return num;
    }
}
