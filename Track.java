package d;
//import java.time.duration


class Track <T>{
    private String title;
    private String creator;
    private String album;
    private int year;
    // private Duration duration;
    private int duration;
    private T rating;

    //Duration duration;
    public Track (String title, String creator, String album, int year, int duration, T rating){
        this.title = title;
        this.creator = creator;
        this. album = album;
        this.year = year;
        this.duration = duration;
        this.rating = rating;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getCreator(){
        return creator;
    }
    public void setCreator(String creator){
        this.creator = creator;
    }
    public String getAlbum(){
        return album;
    }
    public void setAlbum(String album){
        this.album = album;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year = year;
    }
    // public Duration getDuration(){
    public int getDuration(){
    return duration;
    }
    // Duration duration;
    public void setDuration(int duration){
        this.duration = duration;
    }
    public T getRating(){
        return rating;
    }
    public void setRating(T rating){
        this.rating = rating;
    }
}