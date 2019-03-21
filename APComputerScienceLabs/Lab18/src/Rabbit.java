import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Rabbit
{
    /* Characteristics shared by all rabbits (static fields). */

    private static final int    BREEDING_AGE = 5;
    private static final int    MAX_AGE = 15;
    private static final double BREEDING_PROBABILITY = 0.22;
    private static final int    MAX_LITTER_SIZE = 6;

    /* Individual characteristics (instance fields). */

    private int      age;
    private boolean  alive;
    private Field    field;
    private Location location; //stores a reference to this Rabbit's current location

    /**
     * Create a new rabbit. A rabbit is created with age zero (a new born).
     */
    public Rabbit(Field field, Location location)
    {
        this.field = field;
        age = 0;
        alive = true;
        this.location = location;
    }

    /**
     * This is what the rabbit does most of the time - it runs 
     * around. Sometimes it will breed or die of old age.
     */
    public void run()
    {
        incrementAge();
        if(!alive)
            return;
        if(canBreed()) {
            int babies = breed();
            for (int i = 0; i < babies; i++) {
                if(field.freeAdjacentLocation(location) != null){
                    Rabbit rabbit = new Rabbit(field, field.freeAdjacentLocation(location));
                    field.place(rabbit, field.freeAdjacentLocation(location));
                    continue;
                }
                break;
            }
        }
        if(field.freeAdjacentLocation(location) != null){
            field.remove(location);
            location = field.freeAdjacentLocation(location);
        }
        else
            setDead();
    }

    /** Method called when a Rabbit becomes deceased */
    public void setDead()
    {
        alive = false;
        field.remove(location);
    }

    /**
     * Increase the Rabbit's age.
     * This could result in the rabbit's death.
     */
    private void incrementAge()
    {
        age++;
        if (age > 15)
            setDead();
    }

    /**
     * Generate a number representing the number of births, if it can breed.
     * @return The number of births (may be zero).
     */
    private int breed()
    {
        Random random = new Random();
        double rand = random.nextDouble();
        if(canBreed()){
            if(rand <= 0.21)
                return (int)(random.nextDouble() * Rabbit.MAX_LITTER_SIZE);
        }
        return 0;
    }

    /**
     * A rabbit can breed if it has reached breeding age.
     * @return true if the rabbit can breed, false otherwise.
     */
    private boolean canBreed()
    {
        if(age >= 5)
            return true;

        return false; //replace
    }

    public void setLocation(Location location){this.location = location;}

    public boolean isAlive() {
        return alive;
    }

    public String toString(){
        return "Rabbit, " + age + " y/o, at " + location.toString();
    }
}