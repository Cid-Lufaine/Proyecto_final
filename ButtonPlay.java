import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BotonJugar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonPlay extends Button
{
    
    public ButtonPlay(){
        super("jugar_normal.png", "jugar_hover.png");
    }
    public void act (){
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new LevelsMenu());
        }
    }
}
