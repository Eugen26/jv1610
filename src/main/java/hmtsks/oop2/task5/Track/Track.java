
package hmtsks.oop2.task5.Track;


public class Track implements Comparable<Object>{
   protected int length;
    String style;
    int popLevel;

    public Track(String style, int popLevel) {
        this.style = style;
        this.popLevel = popLevel;
    }

    @Override
    public String toString() {
        return "Track{" + "length=" + length + ", style=" + style + ", popLevel=" + popLevel + '}';
    }

    public int getLength() {
        return length;
    }

    public String getStyle() {
        return style;
    }

    public int getPopLevel() {
        return popLevel;
    }
    
     @Override
    public int compareTo(Object o) {
        Track temp = (Track) o;
    return (this.style.compareTo(temp.style));
    

}
}
