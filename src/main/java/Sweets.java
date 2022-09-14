public abstract class Sweets {
    String name;
    double weight;
    double price;
    String unique;

    public Sweets (String name, double weight, double price, String unique) {
        this.name = name;
        this.weight = weight;
        this.price = price;
        this.unique = unique;
    }

    public String getInfo (){
        return "Наименование: " + name + ", Вес: " + weight + "кг, Цена: " + price + "руб, Уникальный параметр: " + unique + "; \n";
    }
}
