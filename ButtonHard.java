import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BotonDificil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonHard extends Button
{
    public ButtonHard(){
        super("dificil_normal.png", "dificil_hover.png");
    }
    public void act (){
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Level1World(2));
        }
    }
}
