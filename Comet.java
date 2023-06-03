import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Comet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comet extends Actor
{
    
    public Comet(){
        setImage("Comet.png");
    }
    
    public void act(){
        this.setLocation(this.getX()-1, this.getY() + 1);
        checkRemove();
        turn(5);
    }
    
    private void checkRemove()
    {
        World w = this.getWorld();
        
        if (this.getY() >= w.getHeight()-10) {
            w.removeObject(this);
        }else if (this.getX() <= 0 ) {
            w.removeObject(this);
        }
        
    }
}
