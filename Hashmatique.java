import java.util.HashMap;
import java.util.Set;
public class Hashmatique {
    public static void main(String[] args){
        HashMap<String, String> trackList = new HashMap<>();
        trackList.put("track1", "lyrics1");
        trackList.put("track2", "lyrics2");
        trackList.put("track3", "lyrics3");
        trackList.put("track4", "lyrics4");
        System.out.println(trackList);        
        String song = trackList.get("track2");
        System.out.println(song);
        Set<String> keys = trackList.keySet();
        for(String key: keys){
            System.out.println(key + " : " + trackList.get(key));
        }
    }
}