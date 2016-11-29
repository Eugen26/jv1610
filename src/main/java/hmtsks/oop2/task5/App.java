
package hmtsks.oop2.task5;

import hmtsks.oop2.task5.Track.Track;
import hmtsks.oop2.task5.Track.pop.Bla;
import hmtsks.oop2.task5.Track.pop.Blabla;
import hmtsks.oop2.task5.Track.pop.Pop;
import hmtsks.oop2.task5.Track.rock.First;
import hmtsks.oop2.task5.Track.rock.Rock;
import hmtsks.oop2.task5.Track.rock.Second;
import hmtsks.oop2.task5.recording.Disc;
import hmtsks.oop2.task5.recording.RecordDisc;
import java.util.ArrayList;


public class App {
    public static void main(String[] args) {
        Rock rock1 = new First("pank", 5);
        Rock rock2 = new First("folk", 8);
        Rock rock3 = new Second("folk", 2);
        Rock rock4 = new Second("metal", 4);
        Rock rock5 = new First("pank", 1);
        Pop pop1 = new Bla("disco", 2);
        Pop pop2 = new Blabla("disco", 10);
        Pop pop3 = new Blabla("light", 7);
        Pop pop4 = new Bla("light", 9);
        Pop pop5 = new Bla("disco", 4);
        ArrayList<Track> tracks = new ArrayList<>();
        tracks.add(pop1);
        tracks.add(pop2);
        tracks.add(pop3);
        tracks.add(pop4);
        tracks.add(pop5);
        tracks.add(rock1);
        tracks.add(rock2);
        tracks.add(rock3);
        tracks.add(rock4);
        tracks.add(rock5);
        
        RecordDisc disc = new Disc(tracks);
        System.out.println("Total length = " + disc.totalLength());
        
        disc.sortByStyle();
        disc.printSort();
        
        System.out.println(disc.findTrack(180, 225));
    }
}
