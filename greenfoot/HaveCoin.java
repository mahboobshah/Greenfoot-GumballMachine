import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HaveCoin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HaveCoin extends Message
{
    /**
     * Act - do whatever the HaveCoin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(((GumballWorld)getWorld()).getRemoveHaveCoin())
        {
            getWorld().removeObject(this);
        }
    }
}
