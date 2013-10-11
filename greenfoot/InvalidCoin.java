import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InvalidCoin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InvalidCoin extends Message
{
    /**
     * Act - do whatever the InvalidCoin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(((GumballWorld)getWorld()).getRemoveInvalid())
        {
            getWorld().removeObject(this);
        }
        
    }    
}
