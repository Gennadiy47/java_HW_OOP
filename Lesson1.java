Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре
В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику, заложенную в программе
Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("--------- ПОИСК ОСВЕЖАЮЩИХ НАПИТКОВ ---------");
        VendingMachineBottle vmBottle = new VendingMachineBottle();
        List<BottleOfWater> bottleList = new ArrayList<>(Arrays.asList(
                new BottleOfWater(prod.Cola.toString(), new BigDecimal(3), 0.5),
                new BottleOfWater(prod.Sprite.toString(), new BigDecimal(3.5), 0.45),
                new BottleOfWater(prod.Fanta.toString(), new BigDecimal(3), 0.43),
                new BottleOfWater("Aqua Minerale", new BigDecimal(1.5), 0.5)));
        vmBottle.initProduct(bottleList);
        System.out.println(vmBottle.getProduct("Aqua Minerale"));

        System.out.println("--------- ПОИСК ГОРЯЧИХ НАПИТКОВ ---------");
        VendingMachineHotDrinks vmHotDrinks = new VendingMachineHotDrinks();
        List<HotDrinks> hotDrinksList = new ArrayList<>(Arrays.asList(
                new HotDrinks("Coffee", new BigDecimal(3), 0.3, 90),
                new HotDrinks("Tea", new BigDecimal(1), 0.4, 80),
                new HotDrinks("Milk", new BigDecimal(3), 1.0, 50)));
        vmHotDrinks.initProduct(hotDrinksList);
        System.out.println("Поиск по названию: " + vmHotDrinks.getProduct("Coffee"));
        System.out.println("Поиск по цене <=: " + vmHotDrinks.getProduct(new BigDecimal(2.5)));
        System.out.println("Поиск по температуре <=: " + vmHotDrinks.getProduct(70));
    }

    enum prod {
        Cola,
        Sprite,
        Fanta,
    }
}
