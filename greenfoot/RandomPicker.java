import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RandomPicker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RandomPicker extends Picker
{
    /**
     * Act - do whatever the RandomPicker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Logic to randomly pick a ball color and eject out of Gumball Machine.
        if(((GumballWorld)getWorld()).getPickerId() == 0 && ((GumballWorld)getWorld()).getPickerAssigned())
        {
            int color = Greenfoot.getRandomNumber(3);
            int xCoordinate = 365;
            int yCoordinate = 500;
            
            ((GumballWorld)getWorld()).unsetRemoveBall();
            ((GumballWorld)getWorld()).unsetRemoveEject();
         
            if(color == 0)
            {
                ((GumballWorld)getWorld()).addObject(new BlueGumball(), xCoordinate, yCoordinate);
            }
            else if(color == 1)
            {
                ((GumballWorld)getWorld()).addObject(new RedGumball(), xCoordinate, yCoordinate);
            }
            else if(color == 2)
            {
                ((GumballWorld)getWorld()).addObject(new GreenGumball(), xCoordinate, yCoordinate);
            }
            
            ((GumballWorld)getWorld()).addObject(new BallEjected(), 550, 100);
            ((GumballWorld)getWorld()).unsetPickerAssigned();
            ((GumballWorld)getWorld()).setBallDispensed();
            ((GumballWorld)getWorld()).setAllowCoin();
            
        }
    }    
}
