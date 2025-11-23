import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class FIleReader {
    public static int getLineCount(String path) throws IOException{
        int lineCount = 0;
        File file = new File(path);
        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            while(reader.readLine() != null) {
                lineCount++;
            }
        }catch (IOException e){
            throw e;
        }
        return lineCount++;
    }
    static Track[] readFile(String path) throws IOException{
        int num = getLineCount(path) -1;
        Track[] track = new Track[num];

        try(BufferedReader reader =  new BufferedReader(new FileReader(path))){
            String line = reader.readLine();
            for (int i = 0; i < num; i++) {
                line = reader.readLine();
                String[] columns = line.split(",");
                String title = columns[0];
                String creator = columns[1];
                String album = columns[2];
                int year = Integer.parseInt(columns[3]);
                int duration = Integer.parseInt((columns[4]));
                String rating = columns[5];

                track[i] = new Track(title, creator, album, year, duration, rating);

            }
        }
    return track;
    }
    static void fileWrite(Track[] media, String path) throws IOException{
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(path))){
            writer.write("Title, Creator, Album, Year, Duration, Rating");
            writer.newLine();

            for (int i = 0; i < media.length; i++) {
                writer.write("%s, %s, %s, %d, %d, %T");
                media[i].getTitle();
                media[i].getCreator();
                media[i].getAlbum();
                media[i].getYear();
                media[i].getDuration();
                media[i].getRating();

            }
        }catch (IOException e){
            throw e;
        }
    }
}
    
