
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args) {
        
        Zombie z = new Zombie();
        z.name = "Gary";
        z.hp = 10;
        z.attackPoint = 10;
        System.out.println(z.name);
        z.Attack();
        z.Walk();
        
    }
}


