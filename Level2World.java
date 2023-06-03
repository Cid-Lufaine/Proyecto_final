import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Level2World extends World
{
    private int score;
    private int lives;
    private int difficulty;
    private Timer timer;
    private Character character;
    private Bank bank;
    MusicManager Musicmanager;

    public Level2World(int score, int difficulty,int lives)
    {   
        super(600, 400, 1);
        this.score=score;
        this.difficulty=difficulty;
        this.lives=lives;
        Musicmanager = Musicmanager.getInstance();
        timer= new Timer(15);
        character = new Character();
        bank = new Bank();
        
        prepare();
    }

    private void prepare() {
        setBackground("Fondo_juego_2.jpg");

        addObject ( new Level0Floor(), getWidth() / 2  , getHeight()* 95/ 100);

        addObject ( bank, getWidth() *95/ 100  , getHeight()* 55/ 100);
        addObject ( new Coin(), getWidth() *50/ 100  , getHeight()* 50/ 100);

        addObject ( character, getWidth()* 5 / 100 , getHeight()* 75/ 100 );

    }

    public void act() {
        Musicmanager.playTrack(3);
        printHub();
        addCoins();
        addComets();
        
        if(character.scoreUpdate())
        {
            score+= bank.updateScore();
        }
        
        if(character.checkForLetalCollisions())
        {
            lives--;
            character.setLocation(getWidth()* 5 / 100 , getHeight()* 75/ 100);
        }
        
        gameOverByTime();
        gameOverByPos();
        gameOverByComets();

        
    }

    private void printHub(){
        showText("lives: "+lives+ "    Score: " + score,  getWidth()* 1/ 5, getHeight()- (int)(getHeight()*0.9));
        showText( timer.Timer_Text(), getWidth()* 4/ 5, getHeight()- (int)(getHeight()*0.9));

    }

    private void addCoins(){
        if (Greenfoot.getRandomNumber(1000) < 20) {
            Coin c = new Coin();
            int randx = Greenfoot.getRandomNumber(this.getWidth()-50)+25;
            this.addObject(c, randx, getHeight()*60/100);
        }

    }

    private void addComets(){
        if (Greenfoot.getRandomNumber(1000) < 5) {
            Comet c = new Comet();
            int randx = Greenfoot.getRandomNumber(this.getWidth()-50)+25;
            this.addObject(c, randx, getHeight()*5/100);
        }
    }

    private void gameOverByTime(){
        if (timer.Time_Out() ){
            score+=10;
            if(difficulty==1)
            {
                score+= lives*50; 
                Greenfoot.setWorld(new GameOverScreen(score,difficulty));
            }else{   
                Greenfoot.setWorld(new Level3World(score,difficulty,lives));
            }
        }
    }

    private void gameOverByPos(){
        if (character.atBottom() ){
            if(lives==0){
                Greenfoot.setWorld(new GameOverScreen(score,difficulty));
            }else{
                lives--;
                character.setLocation(getWidth()* 5 / 100 , getHeight()* 75/ 100);
            }
        }

    }

    private void gameOverByComets(){
        if (lives==0 ){
            Greenfoot.setWorld(new GameOverScreen(score,difficulty));
        }
    }
}

