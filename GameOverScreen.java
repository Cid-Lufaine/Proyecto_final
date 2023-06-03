import greenfoot.*;  
import java.util.List;

public class GameOverScreen extends World
{
    int newScore;
    String difficulty;
    MusicManager Musicmanager;

    public GameOverScreen(int score, int difficulty)
    {    
        super(600, 400, 1);
        setBackground("Fondo_Game_Over.jpg"); 
        this.newScore=score;
        switch(difficulty){
            case 0:this.difficulty="Easy";
                break;
            case 1:this.difficulty="Normal";
                break;
            case 2:this.difficulty="Hard";
                break;
        }
        prepare();
    }

    private void prepare() {
        if (UserInfo.isStorageAvailable()) {
            if (checkNewRecord()){
                UserInfo myInfo = UserInfo.getMyInfo();
                myInfo.setScore​(newScore);
                myInfo.setString​(0,difficulty );
                myInfo.store();
                showText("new record!!! " + newScore, getWidth() / 2, getHeight()/2);
            }

        }else{
            showText("No Server Access", getWidth() / 2, getHeight()/2);
        }

        ButtonReturn buttonReturn = new ButtonReturn();
        addObject(buttonReturn, getWidth() / 2, getHeight() - 50);
        Musicmanager = Musicmanager.getInstance();
    }


    private boolean checkNewRecord (){
        boolean newRecord=false;
        boolean alreadyInTop=false;
        UserInfo myInfo = UserInfo.getMyInfo();

        if (myInfo != null) {
            List<UserInfo> topScores = myInfo.getTop(5);
            for (int i = 0; i < 5 && newRecord==false && alreadyInTop==false ; i++) {

                try{
                    UserInfo scoreInfo = topScores.get(i);
                    if(scoreInfo.getUserName()==myInfo.getUserName()){
                        alreadyInTop=true;
                    }
                    if(newScore > scoreInfo.getScore()){
                        newRecord=true;
                    }
                }catch(Exception StringIndexOutOfBoundsException){

                }
            }
        }

        return newRecord;
    }

    public void act() {
        Musicmanager.playTrack(1);

    }

}
