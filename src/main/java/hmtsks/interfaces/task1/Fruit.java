
package hmtsks.interfaces.task1;


public class Fruit extends Plant{

    public Fruit(double weight, String color, String maturity, String condition, boolean purity) {
        super(weight, color, maturity, condition, purity);
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
    public Plant peell(Plant plant) {
        purity = true;
        double x = 0.02 * weight;
        weight -= x;
        return plant;
    }


    
}
