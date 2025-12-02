package d;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.duration;

public class filereader {

    public static int numLines(String path) throws IOException {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            while (reader.readLine() != null) {
                count++;
            }
        }
        return count;
    }

    static Track[] readFile(String path) throws IOException {

        int total = numLines(path) - 1;
        Track[] loadedTracks = new Track[total];

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {

            String row = reader.readLine();

            for (int i = 0; i < total; i++) {

                row = reader.readLine();
                if (row == null) break;

                String[] parts = row.split(",");

                String mediaType = parts[0].trim();
                String title = parts[1].trim();
                String creator = parts[2].trim();
                String album = parts[3].trim();
                String showTitle = parts[4].trim();
                int year = Integer.parseInt(parts[5].trim());
                String seasonStr = parts[6].trim();
                String episodeStr = parts[7].trim();
                //change duration to durationMinutes;
                int duration = Integer.parseInt(parts[8].trim());
                //Duration duration = Duration.ofMinutes(durationMinutes);
                String rating = parts[9].trim();

                if (mediaType.equals("Track")) {

                    loadedTracks[i] = new Track(
                            title, creator, album,
                            year, duration, rating
                    );

                } else if (mediaType.equals("AudioBook")) {

                    loadedTracks[i] = new AudioBook(
                            title, creator, album,
                            year, duration, rating
                    );

                } else if (mediaType.equals("TVEpisode")) {

                    int seasonNum = Integer.parseInt(seasonStr);
                    int episodeNum = Integer.parseInt(episodeStr);

                    TVEpisode episode = new TVEpisode(
                            title, creator, showTitle,
                            year, duration, rating
                    );

                    episode.setSeasonNumber(seasonNum);
                    episode.setEpisodeNumber(episodeNum);

                    loadedTracks[i] = episode;
                }
            }
        }

        return loadedTracks;
    }
}
