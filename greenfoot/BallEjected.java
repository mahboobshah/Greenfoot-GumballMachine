import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BallEjected here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BallEjected extends Message
{
    /**
     * Act - do whatever the BallEjected wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(((GumballWorld)getWorld()).getRemoveEject())
        {
            getWorld().removeObject(this);
        }
    }    
}
