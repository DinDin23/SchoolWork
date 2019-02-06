public class HeavySprite extends MobileSprite{

    //Constructor
    public HeavySprite(double left, double top, int width, int height, String image, double vx, double vy){
        super(left, top, width, height, image, vx, vy);
    }

    @Override
    public void step(World world){
        super.step(world);
        setTop(getTop() - 0.1);
    }
}
