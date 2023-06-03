import greenfoot.GreenfootSound;

public final class MusicManager  
{
    private static MusicManager musicManagerInstance;
    private GreenfootSound []music;
    private boolean []trackOn;
    private int track;
    
    private MusicManager()
    {
        music = new GreenfootSound[8];
        music[0] = new GreenfootSound("Anxiety.mp3");
        music[1] = new GreenfootSound("DanzaScimmia.mp3");
        music[2] = new GreenfootSound("DarkHour.mp3");
        music[3] = new GreenfootSound("FlamencoNights.mp3");
        music[4] = new GreenfootSound("PHOENIX.mp3");
        music[5] = new GreenfootSound("ReindeerDance.mp3");
        music[6] = new GreenfootSound("UnderWater.mp3");
        music[7] = new GreenfootSound("Velvet.mp3");
    }
    
    public static MusicManager getInstance() {
        if (musicManagerInstance == null) {
            musicManagerInstance = new MusicManager();
        }
        return musicManagerInstance;
    }

    public void playTrack(int track) {
        try{
            
            if(!music[track].isPlaying()){
                music[this.track].stop();
                this.track=track;
                music[this.track].playLoop();
            }
        }catch(Exception StringIndexOutOfBoundsException){
            
        }
    }
    
    public void stopActiveTrack(int track) {
        
        try{
             if(this.track==track){
                 music[track].stop();
            }
        }catch(Exception StringIndexOutOfBoundsException){
        }
    }
    
    public void adjustVolume(int track, int volume) {
        try{
            music[track].setVolume(volume);
        }catch(Exception StringIndexOutOfBoundsException){
        }
    }
}