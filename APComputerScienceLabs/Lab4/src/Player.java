public class Player {
    private String name;
    private int number;
    private int atBats;
    private int hits;

    public Player(String name, int num){
        this.name = name;
        number = num;
    }

    public Player(String name, int num, int atBats, int hits){
        this.name = name;
        number = num;
        this.atBats = atBats;
        this.hits = hits;
    }

    public double battingAverage(){
        return (double)hits / (double)atBats;
    }

    public String getBattingAverageString(){
        return "" + (Math.round(battingAverage() * 1000));
    }

    public int getHits() {
        return hits;
    }

    public int getAtBats() {
        return atBats;

    }

    public int getNumber() {

        return number;
    }

    public String getName() {
        return name;
    }
}
