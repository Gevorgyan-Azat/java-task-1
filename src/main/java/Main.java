public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        Sweets cake1 = new Cake("Торт", 5.5d, 5000d, "С шоколадным кремом");
        Sweets cake2 = new Cake("Торт", 2.5d, 2000d, "Наполеон");
        Sweets cupcake1 = new Cupcake("Кекс", 1.5d, 300d, "С изюмом");
        Sweets marsh1 = new Marshmallow("Маршмеллоу", 1d, 700d, "Ванильный");


        box.add(cake1); //добавляем "Торт Шоколадный"
        box.add(cake2); //добавляем "Торт Наполеон"
        box.add(cupcake1); //добавляем "Кекс"
        box.add(marsh1); //добавляем Маршмеллоу"

        System.out.println(box.info()); //выводим общую информацию

        box.optimizationWeight(5); //оптимизируем с меньшим весом

        System.out.println(box.info());

        box.optimizationPrice(3); //оптимизмруем с меньшей ценой

        System.out.println(box.info());

        box.delete(); //удаляем последний по индексу объект

        System.out.println(box.info());



    }

}
