import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GumballWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GumballWorld extends World
{
    private boolean coinInMachine   = false;
    private boolean allowCoin       = true;
    private boolean crankTurned     = false;
    private boolean validCoin       = false;
    private boolean invalidCoin     = false;
    private boolean fakeCoin        = false;
    private boolean pickerAssigned  = false;
    private int pickerId; 
    private boolean ballDispensed   = false;
    private boolean removeBall      = false;
    private boolean removeInsert    = false;
    private boolean removeEject     = false;
    private boolean removeInvalid   = false;
    private boolean removeHaveCoin   = false;
    private Coin coin;
    

    /**
     * Constructor for objects of class GumballWorld.
     * 
     */
    public GumballWorld()
    {    
        // Create a new world with 800x600 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        //Adding GumballMachine object to the World
        GumballMachine gumballmachine = new GumballMachine();
        addObject(gumballmachine, 367, 237);
        
        //Adding Penny object to the World
        Penny penny = new Penny();
        addObject( penny, 57, 71 ) ;
        
        //Adding Quarter object to the World
        Quarter quarter = new Quarter();
        addObject( quarter, 52, 434 ) ;
        
        //Adding FakeQuarter object to the World
        FakeQuarter fakequarter = new FakeQuarter();
        addObject( fakequarter, 57, 150 ) ;

        //Adding InsertCoin object to the World
        addObject( new InsertCoin(), 367, 25 ) ;

        //Adding Inspector object to the World
        Inspector inspector = new Inspector();
        addObject(inspector, 533, 291);
        
        //Adding RandomPicker object to the World
        RandomPicker randompicker = new RandomPicker();
        addObject(randompicker, 643, 104);
        randompicker.setLocation(655, 94);
        
        //Adding GreenPicker object to the World
        GreenPicker greenpicker = new GreenPicker();
        addObject(greenpicker, 686, 454);
        greenpicker.setLocation(669, 456);
        
        //Adding More Quarters object to the World
        Quarter quarter2 = new Quarter();
        addObject(quarter2, 142, 349);
        Quarter quarter3 = new Quarter();
        addObject(quarter3, 144, 436);
        Quarter quarter4 = new Quarter();
        addObject(quarter4, 54, 348);
    }
    
    /**
     * Getter methods 
     */
    
    //check if coin is in machine
    public boolean getCoinInMachine()
    {
        return coinInMachine;
    }
    
    //check if a coin is allowed to be inserted
    public boolean getAllowCoin()
    {
        return allowCoin;
    }
    
    //check if machine is cranked
    public boolean getCrankTurned()
    {
        return crankTurned;
    }
    
    //check if picker is assigned
    public boolean getPickerAssigned()
    {
        return pickerAssigned;
    }
    
    //return the inserted coin type
    public Coin getCoin()
    {
        return coin;
    }
    
    //return the picker id assigned by inspector(Random or Green)
    public int getPickerId()
    {
        return pickerId;
    }
    
    //check if the ball is removed from the World
    public boolean getRemoveBall()
    {
        return removeBall;
    }
    
    //check if the 'Insert Coin' message is removed.
    public boolean getRemoveInsert()
    {
        return removeInsert;
    }
    
    //check if the 'Voila'(Gumball ejected) message is removed
    public boolean getRemoveEject()
    {
        return removeEject;
    }
    
    //check if the 'Invalid Coin' message is removed
    public boolean getRemoveInvalid()
    {
        return removeInvalid;
    }
    
    //check if the 'Have Coin' message is removed
    public boolean getRemoveHaveCoin()
    {
        return removeHaveCoin;
    }   
    
    /**
     * setter methods
     */
    
    //set coin-in-machine status (stops allowing new coins into the machine unless it is cranked)
    public void setCoinInMachine()
    {
        coinInMachine = true;
    }
    
    //set coin-in-machine to false (Allows new coins into the machine after it is cranked)
    public void unsetCoinInMachine()
    {
        coinInMachine = false;
    }
    
    //Allows new coins into the machine after it is cranked
    public void setAllowCoin()
    {
        allowCoin = true;
    }
    
    //stops allowing new coins into the machine unless it is cranked
    public void unsetAllowCoin()
    {
        allowCoin = false;
    }
    
    //sets crank turned status to true
    public void setCrankTurned()
    {
        crankTurned = true;
    }
    
    //sets crank turned status to false
    public void unsetCrankTurned()
    {
        crankTurned = false;
    }
    
    //sets picker assigned status to true
    public void setPickerAssigned()
    {
        pickerAssigned = true;
    }

    //sets picker assigned status to false
    public void unsetPickerAssigned()
    {
        pickerAssigned = false;
    }
    
    //sets ball dispensed status to true
    public void setBallDispensed()
    {
        ballDispensed = true;
    }
    
    //sets picker assigned status to false
    public void setCoin(Coin coinIn)
    {
        coin = coinIn;
    }
    
    //sets picker ID status to true
    public void setPickerId(int i)
    {
        pickerId = i;
    }
    
    //sets Ball Removed status to true 
    public void setRemoveBall()
    {
        removeBall = true;
    }
    
    //sets Ball Removed status to false 
    public void unsetRemoveBall()
    {
        removeBall = false;
    }
    
    //sets the status to remove 'insert coin' message. 
     public void setRemoveInsert()
    {
        removeInsert = true;
    }
    
    //sets the status not to remove 'insert coin' message.
    public void unsetRemoveInsert()
    {
        removeInsert = false;
    }
    
    //sets the status to remove 'Voila' message.
    public void setRemoveEject()
    {
        removeEject = true;
    }
    
    //sets the status not to remove 'Voila' message.
    public void unsetRemoveEject()
    {
        removeEject = false;
    }
    
    //sets the status to remove 'invalid coin' message.
     public void setRemoveInvalid()
    {
        removeInvalid = true;
    }
    
    //sets the status not to remove 'invalid coin' message.
    public void unsetRemoveInvalid()
    {
        removeInvalid = false;
    }
    
    //sets the status to remove 'have coin' message.
     public void setRemoveHaveCoin()
    {
        removeHaveCoin = true;
    }
    
    //sets the status not to remove 'have coin' message.
    public void unsetRemoveHaveCoin()
    {
        removeHaveCoin = false;
    }
}
