import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BotonAyuda here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonHelp extends Button
{
    public ButtonHelp(){
        super("ayuda_normal.png", "ayuda_hover.png");
    }
    public void act (){
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new HelpScreen());
        }
    }
}
