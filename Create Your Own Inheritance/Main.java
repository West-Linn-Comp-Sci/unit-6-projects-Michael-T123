
/**
 * Write a description of class Main here.
 *
 * @author (Michael Taylor)
 * @version (5/19/21)
 */
public class Main
{
    public static void main (String [] args){
        mouse1 m1 = new mouse1();
        mouse2 m2 = new mouse2();
        m1.rightClick();
        m1.leftClick();
        m1.setWireless();
        m2.setColor();
        m2.scrollWheel();
        m1.scrollWheel();
    }
   
}
