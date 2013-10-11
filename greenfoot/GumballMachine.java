import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class GumballMachine here.
 * 
 * @author Mahboob Shah Mohammed, Naresh Guggilla 
 * @version 1.0
 */
public class GumballMachine extends Actor
{

    public GumballMachine()
    {
        GreenfootImage image = getImage() ;
        image.scale( 350, 400 ) ; 
    }

    public void act() 
    {
        // Allow to insert coin if coin is not in machine and allow coin is set to true.
        if( !((GumballWorld)getWorld()).getCoinInMachine() && ((GumballWorld)getWorld()).getAllowCoin())
        {
            if(insertCoin())
            {
                pullCoin();                
                ((GumballWorld)getWorld()).unsetAllowCoin();
                ((GumballWorld)getWorld()).setCoinInMachine();
            }
        }
        
        //check if mouse is clicked (cranked) on Gumball Machine Object
        MouseInfo mouse = Greenfoot.getMouseInfo();
        if(((GumballWorld)getWorld()).getCoinInMachine() && Greenfoot.mouseClicked(this) && mouse.getClickCount() == 1)
        {
            ((GumballWorld)getWorld()).setCrankTurned();
            ((GumballWorld)getWorld()).unsetRemoveInsert();
            ((GumballWorld)getWorld()).setRemoveHaveCoin();
            ((GumballWorld)getWorld()).unsetRemoveEject();
            ((GumballWorld)getWorld()).unsetRemoveInvalid();
            ((GumballWorld)getWorld()).addObject( new InsertCoin(), 367, 25 ) ;
        }

    }  
    
    /**
     * Check whether there is a coin in the same cell as we are.
     */
    public boolean insertCoin()
    {
       Actor coin = getOneObjectAtOffset(0, 60, Coin.class);
        if(coin != null) {
            return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * Pull a coin once it is dragged on to Gumball Machine object.
     */
    public void pullCoin()
    {
        Actor coin = getOneObjectAtOffset(0, 60, Coin.class);
        if(coin != null) {
            // to disappear a coin after touching machine
            getWorld().removeObject(coin);
            // to remove any previously ejected balls
            ((GumballWorld)getWorld()).setRemoveInsert();
            ((GumballWorld)getWorld()).unsetRemoveHaveCoin();
            ((GumballWorld)getWorld()).addObject( new HaveCoin(), 367, 25 ) ;
            ((GumballWorld)getWorld()).setRemoveInvalid();
            ((GumballWorld)getWorld()).setRemoveEject();
            ((GumballWorld)getWorld()).setRemoveBall();
            ((GumballWorld)getWorld()).setCoin((Coin)coin); 
        }
    }
}
