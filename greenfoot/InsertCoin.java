import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InsertMessage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InsertCoin extends Message
{
    /**
     * Act - do whatever the InsertMessage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(((GumballWorld)getWorld()).getRemoveInsert())
        {
            getWorld().removeObject(this);
        }
    }    
}
