import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BotonNormal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonNormal extends Button
{
    public ButtonNormal(){
        super("normal_normal.png", "normal_hover.png");
    }
    public void act (){
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Level1World(1));
        }
    }
}
