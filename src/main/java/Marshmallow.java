public class Marshmallow extends Sweets {

    String unique;

    public Marshmallow (String name, double weight, double price, String unique) {
        super(name, weight, price);
        this.unique = unique;
    }

    public String getInfo (){
        return "Наименование: " + name + ", Вес: " + weight + "кг, Цена: " + price + "руб, Уникальный параметр: " + unique + ";\n" ;
    }
}
