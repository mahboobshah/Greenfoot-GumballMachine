import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedGumball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedGumball extends Gumball
{
    public RedGumball()
    {
        GreenfootImage image = getImage();
        image.scale(50,50);
    }

    /**
     * Act - do whatever the RedGumball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(((GumballWorld)getWorld()).getRemoveBall())
        {
        getWorld().removeObject(this);
        }
    }    
}
