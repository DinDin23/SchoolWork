public class MobileSprite extends Sprite {

    //Instance Variables
    private double vx, vy;

    //Constructor
    public MobileSprite(double left, double top, int width, int height, String image, double vx, double vy){
        super(left, top, width, height, image);
        this.vx = vx;
        this.vy = vy;
    }

    //Getters and Setters
    public double getVx() {
        return vx;
    }

    public void setVx(double vx) {
        this.vx = vx;
    }

    public double getVy() {
        return vy;
    }

    public void setVy(double vy) {
        this.vy = vy;
    }

    public void step(World world){
        if (getLeft() < 0)
            vx = Math.abs(vx);
        if (getLeft() + getWidth() >= world.getWidth())
            vx = -Math.abs(vx);
        if (getTop() < 0)
            vy = Math.abs(vy);
        if (getTop() + getHeight() >= world.getHeight())
            vy = -Math.abs(vy);

        setLeft(getLeft() + vx);
        setTop(getTop() + vy);
    }
}
