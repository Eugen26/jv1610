
package hmtsks.interfaces.task1;


public abstract class Plant implements Peellable{
    double weight;
    String color;
    String maturity;
    String condition;
    boolean purity;

    public Plant(double weight, String color, String maturity, String condition, boolean purity) {
        this.weight = weight;
        this.color = color;
        this.maturity = maturity;
        this.condition = condition;
        this.purity = purity;
    }

    @Override
    public String toString() {
        return "Plant{" + "weight=" + weight + ", color=" + color + ", maturity=" + maturity + ", condition=" + condition + ", purity=" + purity + '}';
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaturity() {
        return maturity;
    }

    public void setMaturity(String maturity) {
        this.maturity = maturity;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public boolean isPurity() {
        return purity;
    }

    public void setPurity(boolean purity) {
        this.purity = purity;
    }

    @Override
    public abstract Plant peell(Plant plant);

    boolean isPurity(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
