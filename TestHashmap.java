import java.util.Set;
import java.util.HashMap;

public class TestHashmap {
    public static void main(String[] args) {
        // creating instance of method class
        Hashmap methods = new Hashmap();
        HashMap<String, String> tracklist = new HashMap<String, String>();
        tracklist.put("Man in the Mirror","I'm gonna make a change for once in my life, It's gonna feel real good gonna make a difference");
        tracklist.put("Thinking Out Loud","When my legs don't work like they used to before, and I can't sweep you off of your feet");
        tracklist.put("Crazy","Well I hope you've been having the time of your life, just remember, you gotta always think twice");
        tracklist.put("If I Ain't Got You","Some people live for the fortune, some people live just for the fame, some people live for the power");

        // methods get the hashmap as a parameter
        String testGetOneBySong = methods.getOneBySong(tracklist,"Crazy");
        System.out.println(testGetOneBySong);

        // method to get all songs. loop through set
        methods.printTracklist(tracklist);

    }
}