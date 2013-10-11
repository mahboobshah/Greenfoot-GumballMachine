import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Inspector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inspector extends Alien
{
    /**
     * Act - do whatever the Inspector wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // check if the coin is quarter only if machine is cranked and there is a coin in machine.
        if(((GumballWorld)getWorld()).getCrankTurned() && ((GumballWorld)getWorld()).getCoinInMachine())
        {
            if(isQuarter())
            {
                assignPicker();
                ((GumballWorld)getWorld()).setPickerAssigned();
            }
            ((GumballWorld)getWorld()).unsetCrankTurned();
            ((GumballWorld)getWorld()).unsetCoinInMachine();
        }    
        
    }
    
    //logic to check if the coin is a quarter
    public boolean isQuarter()
    {
        if(((GumballWorld)getWorld()).getCoin().getClass() == Quarter.class)
        {
            return true;
        }
        else 
        {
            ((GumballWorld)getWorld()).unsetRemoveInvalid();
            ((GumballWorld)getWorld()).addObject(new InvalidCoin(), 650, 250);
            ((GumballWorld)getWorld()).setAllowCoin();
            return false;
        }
    }
    
    //Randomly assign a picker alien (0 - RandomPicker and 1 - GreenPicker)
    public void assignPicker()
    {
       ((GumballWorld)getWorld()).setPickerId(Greenfoot.getRandomNumber(2));
    }
}
