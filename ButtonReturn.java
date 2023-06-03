import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BotonRegresar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonReturn extends Button
{
     public ButtonReturn(){
        super("regresar_normal.png", "regresar_hover.png");
    }
    
    public void act (){
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new MainMenu());
        }
    }
    
}
