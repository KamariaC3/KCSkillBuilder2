
/**
 * This class defines how power pills behave in
 * a game.  The purpose of a power pill is to simply
 * provide a character with power.
 *
 * @author (You)
 * @version (0.1)
 */
public class PowerPill
{
    // TODO - replace this line with instruction from step 1
    public static int DEFAULT_POWER = 10;
    // instance variables
     int power;
     String name;
    // TODO - replace this line with instruction from step 2
    // TODO - replace this line with instruction from step 3

    // constructors

    // TODO - replace this line with instruction from step 4
    public PowerPill(String name){
        power = DEFAULT_POWER;
        this.name = name;
    }

    // TODO - replace this line with instruction from step 5
    public PowerPill(String name, int power) {
        this.power = power;
        this.name = name;
    }
    // accessor methods

    public int getPower() {
        return power;
    }

    public String getName() {
         return name;
    }

    public void setPower(int power) {
         this.power = power;
    }

    public void setName(String name) {
         this.name = name;
    }

    // mutator methods

    // TODO - replace this line with instruction from step 7

    // toString method
    public String toString(){
        return "PowerPill " + name + " = " + power;
        //PowerPill <name> = <power>
    }
    // TODO - replace this line with instruction from step 8

}