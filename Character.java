import greenfoot.*;

public class Character extends Control
{
    private int jumpStrength = 20;
    private int wallet = 0;
    
    public Character(){
        setImage("pengu-right.png");
    }
    
    public void act()
    {
        checkKeys();        
        checkFall();
        checkForCollisions();
    }
    private void checkKeys()
    {
        if (Greenfoot.isKeyDown("left") )
        {
            setImage("pengu-left.png");
            moveLeft();
        }else if (Greenfoot.isKeyDown("right") )
        {
            setImage("pengu-right.png");
            moveRight();
        }
        if (Greenfoot.isKeyDown("space") )
        {
            if (onGround())
                jump();
        }
    }    
    
    private void jump()
    {
        setVSpeed(-jumpStrength);
        fall();
    }
    
    private void checkFall()
    {
        if (onGround()) {
            setVSpeed(0);
        }
        else {
            fall();
        }
    }
    
    private void checkForCollisions()   
    {
        Actor coin = this.getOneIntersectingObject(Coin.class);
        if (coin != null)  {
            wallet+=10;
            World w = this.getWorld();
            w.removeObject(coin);
        }
        
    }
    public boolean scoreUpdate(){
        boolean answer=false;
        Bank bank = (Bank)this.getOneIntersectingObject(Bank.class);
        if (bank != null){
            bank.deposit(wallet);
            emptyWallet();
            answer=true;
        }
        return answer;
    }
    
    
    public boolean checkForLetalCollisions(){
        Actor comet = this.getOneIntersectingObject(Comet.class);
        boolean answer = false;
        if(comet != null){
            answer = true;
            World w = this.getWorld();
            w.removeObject(comet);
        }
        return answer;
    }
    
    public int getWallet()   
    {
        return wallet;    
    }
    
    private void emptyWallet()   
    {
        wallet=0;    
    }
}
