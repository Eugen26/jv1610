
package hmtsks.interfaces.task1;


public class FoodProcessor implements Peeller, Cutter, Slicer{
    

    @Override
    public double peelItem(Plant plant) {
         double x = 0.05 * plant.weight;
         plant.weight -= x;
            return plant.weight;
    }
//------------------------------------------------------------------------------
    @Override
    public Plant [] peelItems(Plant[] plants) {
        for (Plant plant : plants) {
            double x = 0.05 * plant.weight;
            plant.weight -= x;
        }
        return plants;
    }
//------------------------------------------------------------------------------
    @Override
    public double cut(Vegetable vegetable) {
         if (vegetable.isPurity(false)){
            throw new IllegalArgumentException();
        }
         double x = 0.02 * vegetable.weight;
            vegetable.weight -= x;
         return vegetable.weight;
    }
//------------------------------------------------------------------------------
    @Override
    public Vegetable[] cutAll(Vegetable[] vegetables) {
        for (Vegetable vegetable : vegetables) {
            if (vegetable.isPurity(false)){
                throw new IllegalArgumentException();
            }
            double x = 0.02 * vegetable.weight;
            vegetable.weight -= x;
        }
        return vegetables;
    }
//------------------------------------------------------------------------------
    @Override
    public double shred(Plant plant) {
         if (plant.isPurity(false)){
            throw new IllegalArgumentException();
        }
         double x = 0.02 * plant.weight;
            plant.weight -= x;
         return  plant.weight;
    }
}
