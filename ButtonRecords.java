import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BotonRecords here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonRecords extends Button
{
    public ButtonRecords(){
        super("records_normal.png", "records_hover.png");
    }
    public void act (){
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new RecordsScreen());
        }
    }
}
