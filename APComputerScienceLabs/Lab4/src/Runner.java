import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner kb = new Scanner(new File("players.txt"));
        int p = kb.nextInt();
        Team centennial = new Team(p);
        for (int i = 0; i < p; i++)
            centennial.players[i] = new Player(kb.next(), kb.nextInt(), kb.nextInt(), kb.nextInt());
        centennial.printTeamStats();
    }
}
