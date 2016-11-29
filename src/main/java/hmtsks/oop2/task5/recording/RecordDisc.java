
package hmtsks.oop2.task5.recording;

import hmtsks.oop2.task5.Track.Track;
import java.util.ArrayList;
import java.util.Collections;


public class RecordDisc {
    ArrayList<Track> tracks;

    public RecordDisc(ArrayList<Track> tracks) {
        this.tracks = tracks;
    }
    
    public int totalLength(){
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }
    
    public ArrayList<Track> findTrack(int minLength, int maxLength){
        ArrayList<Track> foundTrack = new ArrayList<>();
        for (Track track : tracks) {
            if(track.getLength() > minLength && track.getLength() < maxLength){
                foundTrack.add(track);
            }
        }
        return foundTrack;
    }
    
    public void sortByStyle(){
        Collections.sort(tracks);
    }
    
    public void printSort(){
        for (Track track : tracks) {
            System.out.println(track);
        }
    }


}
