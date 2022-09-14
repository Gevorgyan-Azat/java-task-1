public abstract class Sweets {
    String name;
    double weight;
    double price;
    //String unique;

    public Sweets (String name, double weight, double price) {
        this.name = name;
        if (weight>=0) {
            this.weight = weight;
        } else
            this.weight = 0;
        if (price>=0) {
            this.price = price;
        } else
            this.price = 0;
        //this.unique = unique;
    }

    public String getInfo (){
        return "Наименование: " + name + ", Вес: " + weight + "кг, Цена: " + price + "руб";
    }

}
