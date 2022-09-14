import java.util.ArrayList;

public class Box implements SweetBox {

    private  ArrayList <Sweets> sweets = new ArrayList<Sweets>();

    public void add(Sweets s) {     //метод для добавления объекта

        sweets.add(s);
    }

    public void delete() {          //метод для удаления последнего объекта
        sweets.remove(sweets.size() -1 );
    }

    public double weight() {        //метод для вывода веса
        double weigth = 0;
        for (int i = 0; i < sweets.size(); i++){
            weigth += sweets.get(i).weight;
        }
        return weigth;
    }

    public double price() {         //метод дя вывода цены
        double price = 0;
        for (int i = 0; i < sweets.size(); i++){
            price += sweets.get(i).price;
        }
        return price;
    }

    public String info() {      //метод для вывода общей информации
        String info = "Информация: \n";
        for (int i = 0; i < sweets.size(); i++){
            info += sweets.get(i).getInfo();
        }
        return info;
    }

    public void optimizationWeight(double maxWeight) {      //метод для оптимизации с меньшим весом
        while (weight() > maxWeight) {
            double weight = sweets.get(0).weight;
            int index = 0;
            for (int i = 0; i < sweets.size(); i++){
                if (sweets.get(i).weight < weight){
                    weight = sweets.get(i).weight;
                    index = i;
                }
            }
            sweets.remove(index);
        }
    }

    public void optimizationPrice(double maxWeight) {   //метод оптимизации с меньшей ценой
        while (weight() > maxWeight) {
            double price = sweets.get(0).price;
            int index = 0;
            for (int i = 0; i < sweets.size(); i++){
                if (sweets.get(i).price < price){
                    price = sweets.get(i).price;
                    index = i;
                }
            }
            sweets.remove(index);
        }
    }
}
