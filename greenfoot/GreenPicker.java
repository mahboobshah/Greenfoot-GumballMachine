import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreenPicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenPicker extends Picker
{
    /**
     * Act - do whatever the GreenPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Logic to eject green Gumball from the machine.
        if(((GumballWorld)getWorld()).getPickerId() == 1 && ((GumballWorld)getWorld()).getPickerAssigned())
        {
            int xCoordinate = 365;
            int yCoordinate = 500;
            
            ((GumballWorld)getWorld()).unsetRemoveBall();
            ((GumballWorld)getWorld()).unsetRemoveEject();
            ((GumballWorld)getWorld()).addObject(new GreenGumball(), xCoordinate, yCoordinate);             
            ((GumballWorld)getWorld()).addObject(new BallEjected(), 550, 470);
            ((GumballWorld)getWorld()).unsetPickerAssigned();
            ((GumballWorld)getWorld()).setBallDispensed();
            ((GumballWorld)getWorld()).setAllowCoin();
        }
    }    
}
