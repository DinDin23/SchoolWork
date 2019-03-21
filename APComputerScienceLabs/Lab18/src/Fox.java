import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Fox
{
    /* Characteristics shared by all foxes (static fields). */

    private static final int    BREEDING_AGE = 10;
    private static final int    MAX_AGE = 20;
    private static final double BREEDING_PROBABILITY = 0.17;
    private static final int    MAX_LITTER_SIZE = 4;
    private static final int    RABBIT_FOOD_VALUE = 8;

    /* Individual characteristics (instance fields). */

    private int      age;
    private boolean  alive;
    private Field    field;
    private Location location;
    private int      foodLevel;

    /**
     * Create a fox. A fox is created as a new born (age zero
     * and not hungry).
     */
    public Fox(Field field, Location location)
    {
        this.field = field;
        this.location = location;
        age = 0;
        alive = true;
        foodLevel = Fox.RABBIT_FOOD_VALUE;
    }

    /**
     * This is what the fox does most of the time: it hunts for rabbits. 
     * In the process, it might breed, die of hunger, or die of old age.
     */
    public void hunt()
    {
        incrementAge();
        incrementHunger();
        if(!alive)
            return;
        Location where = findFood();
        if(where == null){
            if(field.freeAdjacentLocation(location) != null){
                field.remove(location);
                location = field.freeAdjacentLocation(location);
            }
            else
                setDead();
        }
        else{
            field.remove(location);
            location = where;
        }
    }

    /**
     * Increase the age. This could result in the fox's death.
     */
    private void incrementAge()
    {
        age++;
        if(age > 20)
            setDead();
    }

    /**
     * Make this fox more hungry. This could result in the fox's death.
     */
    private void incrementHunger()
    {
        foodLevel--;
        if(foodLevel < 0)
            setDead();
    }

    /** Method called with a Fox is no longer alive */
    public void setDead()
    {
        alive = false;
        field.remove(location);
    }

    /**
     * Tell the fox to look for rabbits adjacent to its current location.
     * @return Where food was found, or null if it wasn't.
     */
    private Location findFood()
    {
        List<Location> adjacentLocations = field.adjacentLocations(this.location);

        for (Location where : adjacentLocations) //look for Rabbits in adjacent locations
        {
            Object animal = field.getObjectAt(where);

            if (animal instanceof Rabbit) { //if this object is a rabbit...
                Rabbit rabbit = (Rabbit) animal;

                rabbit.setDead();

                this.foodLevel = Fox.RABBIT_FOOD_VALUE; //Foxes goes back to full

                return where;
            }
        }
        return null;
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
            if(rand >= 0 && rand <= 0.16)
                return (int)(random.nextDouble() * Fox.MAX_LITTER_SIZE);
        }
        return 0;
    }

    /**
     * A fox can breed if it has reached breeding age.
     */
    private boolean canBreed()
    {
        if(age >= 10)
            return true;
        return false;
    }
}