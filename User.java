import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class User extends Actor
{
    private String playerName;
    private int score;
    private GreenfootImage userImage;
    private String difficulty;

    void User(){
    }

    public void SetUser(UserInfo scoreInfo){

        playerName=scoreInfo.getUserName();
        score = scoreInfo.getScore();
        difficulty = scoreInfo.getString(0);
        userImage = scoreInfo.getUserImage();
        this.setImage(userImage);
    }

    public void SetUserDefault(){

        this.playerName="----------";
        this.score = 0;
        this.difficulty = "----------";
        userImage = new GreenfootImage("No picture", 15 ,new Color​(0, 0, 0), new Color​(255,255, 255));
        this.setImage(userImage);
    }

    String GetString(){
        String text = playerName + "     " + score + "     " + difficulty;
        return text;
    }

}
