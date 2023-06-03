import greenfoot.*;
import java.util.List;

public class RecordsScreen extends World
{
    MusicManager Musicmanager;
    public RecordsScreen() {
        super(600, 400, 1);
        setBackground("Pantalla_Records.jpg");
        Musicmanager = Musicmanager.getInstance();
        prepare();
    }

    private void prepare() {
        if (UserInfo.isStorageAvailable()) {
            ShowScores();

        }else{
            showText("No Server Access", getWidth() / 2, getHeight()/2);
        }
        ButtonReturn buttonReturn = new ButtonReturn();
        addObject(buttonReturn, getWidth() / 2, getHeight() - 50);
    }

    private void ShowScores() {
        UserInfo myInfo = UserInfo.getMyInfo(); 
        showText("Picture    Name    Score    Dificulty", getWidth() / 2, getHeight()- (int)(getHeight()*0.9));
        if (myInfo != null) {
            List<UserInfo> topScores = myInfo.getTop(5); 
            for (int i = 0; i < 5; i++) {

                User user = new User(); 
                try{
                    UserInfo scoreInfo = topScores.get(i);
                    user.SetUser(scoreInfo);
                }catch(Exception StringIndexOutOfBoundsException){
                    user.SetUserDefault();
                }
                addObject​(user, getWidth() / 4, getHeight() - (int)(getHeight()*0.9) + (i+1)*50);
                showText(user.GetString(), getWidth() / 2, getHeight() - (int)(getHeight()*0.9) + (i+1)*50); 
            }
        }
    }

    public void act(){
        Musicmanager.playTrack(4);
    }


}
