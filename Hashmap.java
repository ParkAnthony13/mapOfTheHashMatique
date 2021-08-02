import java.util.Set;
import java.util.HashMap;

public class Hashmap {
    // receive HashMap as parameter, output single song as a string with 
    public String getOneBySong(HashMap<String, String> tracklist, String name) {
        String lyrics = tracklist.get(name);
        return name + " : " + lyrics;
    }
    public void printTracklist(HashMap<String, String> tracklist) {
        Set<String> songKeys = tracklist.keySet();
        for(String key: songKeys) {
            String pair = String.format("%s : %s", key, tracklist.get(key));
            System.out.println(pair);
        }
    }
}