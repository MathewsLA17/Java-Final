import java.io.*; 
//broken currently doesn't run just wanted to get my idea in here
// Since each type has a differnt type of stuff we're looking for thought we could use switch statements looking for the frist thing 
//track album etc,  then startparsing up from there based on the csv file because it's different in the csv file for each category
//
public class Filereader{

    static ArrayList<Media> readMediaFromFile(String path){
    ArrayList<Media> list = new ArrayList<>(); 
    
    try(BufferedReader reader = new BufferedRader(new FileReader(path))){
    
     
    for(int i =0 ; i< numbooks; i++){
    String[] columns = linesplit(","); 
    String line = reader.readLine(); 
    switch(media.toLowerCase()){
    
    case "track": 
    {
       
    String Title = columns[1].trim();
    String Creator = columns[2].trim();
    String Album = columns[3].trim();
    int Year = Integer.parseInt(columns[3].trim());
    int Duration  = Integer.parseInt(columns[4].trim());
    double Rating  = double.parsedouble(columns[5].trim());
    list.add(new track(Tile, Creator, Album, Year, Duration, Rating));
    break; 
    }
    case "TVEpisode": 
    {
    String Title = columns[1].trim();
    String Show Title = columns[2].trim();
    String Creator = columns[3].trim();
    int Year = Integer.parseInt(columns[3].trim());
    int Season   = Integer.parseInt(columns[4].trim());
    int Episode    = Integer.parseInt(columns[4].trim());
    double Duration   = double.parsedouble(columns[5].trim());
    int Season   = Integer.parseInt(columns[5].trim()); 
    list.add(new track(Tile, Creator, Year, Season, Episode, Duration, Season));
    break; 
    }
    case "AudioBook": 
    {
    String Title = columns[1].trim();
    String Creator = columns[2].trim();
    String Year = columns[3].trim();
    int Duration  = Integer.parseInt(columns[4].trim());
    String Rating  = columns[1].trim(); 
    list.add(new track(Tile, Creator, Year, Duration, Rating));
    break;
    }
    }
    
    ArrayList[i] = new LibraryStorage(Title, Author, Genre, pages, year, checkedOut);
    }
    
    }
    catch (IOExecption e){
    throw e; 
    }
    return ArrayList; 
    }

}
    
