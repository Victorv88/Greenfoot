import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class QuizAmerica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuizAmerica extends World
{

    /**
     * Constructor for objects of class QuizAmerica.
     * 
     */
    public QuizAmerica()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Trump trump = new Trump();
        addObject(trump,256,430);
        Nor nor = new Nor();
        addObject(nor,707,157);
        nor.setLocation(704,187);
        Intrebare1 intrebare1 = new Intrebare1();
        addObject(intrebare1,668,160);
        intrebare1.setLocation(714,169);
        r1 r1 = new r1();
        addObject(r1,727,497);
    }
    
}
