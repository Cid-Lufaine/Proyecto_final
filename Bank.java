import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bank extends Actor
{
    private int readyToStock;
    
    public Bank(){
        setImage("Bank.png");
        readyToStock=0;
    }
    
    public void act()
    {
        
    }
    
    public int updateScore(){
         int send=readyToStock;
         readyToStock=0;
         return send;
    }
    
    public void deposit(int score){
         readyToStock=score;
    }
}
