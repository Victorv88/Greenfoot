import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Intrebare1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Intrebare1 extends Actor
{
    
    String intrebari[]={"Cate state are America?","Cine e presedintele Americii?"};
    
    public int getRandomNumber(int start,int end)
{
       int normal = Greenfoot.getRandomNumber(end-start+1);
       return normal+start;
}
    public int numar;
    
    public Intrebare1()
    {
        numar=getRandomNumber(0,1);
        setImage(new GreenfootImage(intrebari[numar],40,Color.BLACK,Color.WHITE));
    }
}
