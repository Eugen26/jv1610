
package hmtsks.oop2.task1;




public class Flowergirl {
        private Flower flowers;
        private Accessory accessories;
        
        public Flowergirl(){
            this.flowers = new Rose("fresh", 50, 70, "red");
            this.flowers = new Rose("stale", 20, 70, "red");
            this.flowers = new Rose("fresh", 60, 80, "white");
            this.flowers = new Rose("stale", 25, 80, "white");
            this.flowers = new Lily("fresh", 80, 75, "yellow");
            this.flowers = new Lily("stale", 55, 75, "pink");
            this.flowers = new Iris("fresh", 90, 65, "blue");
            this.accessories = new Wrappping("paper", 10, "cyan", 1);
            this.accessories = new Stripe("fabric", 7, "magenta", 2);
        }

        public Flower[] collectBouqet(){
            Flower[] bouquet = new Flower[5];
            bouquet[0] = this.flowers = new Rose("fresh", 50, 70, "red");
            bouquet[1] = this.flowers = new Rose("stale", 20, 70, "red");
            bouquet[2] = this.flowers = new Rose("fresh", 60, 80, "white");
            bouquet[3] = this.flowers = new Rose("stale", 25, 80, "white");
            bouquet[4] = this.flowers = new Lily("fresh", 80, 75, "yellow");
        return bouquet;
        }

}



