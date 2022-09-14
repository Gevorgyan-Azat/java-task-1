public interface SweetBox {
    void add(Sweets s);
    void delete();
    double weight();
    double price();
    String info();
    void optimizationWeight(double maxWeight);
    void optimizationPrice(double maxWeight);

}
