


//Предположим, вы пишите программу для on-line магазина У каждого товара есть наименование,
// цена, рейтинг, количество штук на складе и т.д.
//Ваша программа должна предлагать пользователю выбрать, как бы он хотел сортировать товары
// и, в зависимости от выбора пользователя, выводить список товаров в нужном порядке (например,
// по цене по возрастанию, по цене по убыванию, по рейтингу, по количеству на складе).
//        Для этого, очевидно, можно использовать метод Collection.sort и реализовать
//        несколько Comparator<Person>


import java.util.*;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

List <Good> goods=new ArrayList<>();
Good good1=new Good(5.6,9,10);
goods.add(good1);
goods.add(new Good(8.3,1,20));
goods.add(new Good(2.3,3,50));
goods.add(new Good(7.3,8,90));
//      List<String> string =new ArrayList<>();/*тренируемся сравнивать String*/
//      string.add("ручка");
//      string.add("пенал");
//     string.add("карандаш");
//     Collections.sort(string);
//     System.out.println(string);
   Comparator <Good> compareByPrice = new ComparatorByPrice();
   Comparator <Good> compareByRating= new ComparatorByRating();
        System.out.println("Сортировка по цене по возрастанию ");
/* можно так  */ // Collections.sort(goods, new ComparatorByPrice());
/* можно так*/   Collections.sort(goods, compareByPrice);
        System.out.println(goods);
/*цена в обр порядке*/ Collections.sort(goods, compareByPrice.reversed());
        System.out.println("Сортировка по цене в обратном порядке (убыванию-------");
        System.out.println(goods);
        System.out.println("Сортировка по рейтингу по возрастанию------ ");
        Collections.sort(goods,compareByRating);
        System.out.println(goods);
        System.out.println("Сортировка по рейтингу по убыванию------ ");
        Collections.sort(goods,compareByRating.reversed());
        System.out.println(goods);
        System.out.println("Сортировка по количеству товара по возрастанию -------------------");
        Comparator<Good> compareByNumber = new ComparatorByNumberOfGoods();/*новая переменная класса ComparatorByNumberOfFood*/
        Collections.sort(goods,compareByNumber);
        System.out.println(goods);
        System.out.println("Сортировка по количеству товара по убыванию -------------------");
        Collections.sort(goods,compareByNumber.reversed());
        System.out.println(goods);



}
public int chooseMethodOfSorting() {
        Scanner scanner = new Scanner(System.in);
    System.out.println("Введите номер метода сортировки: ");
    System.out.println("1- Сортировка по цене по возрастанию: ");
    System.out.println("2- Сортировка по цене по убыванию: ");
    System.out.println("3- Сортировка по рейтингу по возрастанию: ");
    System.out.println("4- Сортировка по рейтингу по убыванию: ");
    System.out.println("5- Сортировка по номеру по возрастанию: ");
    System.out.println("6- Сортировка по номеру по возрастанию: ");
    return scanner.nextInt();



}


}