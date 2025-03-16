//Предположим, вы пишите программу для on-line магазина У каждого товара есть наименование,
// цена, рейтинг, количество штук на складе и т.д.
//Ваша программа должна предлагать пользователю выбрать, как бы он хотел сортировать товары
// и, в зависимости от выбора пользователя, выводить список товаров в нужном порядке (например,
// по цене по возрастанию, по цене по убыванию, по рейтингу, по количеству на складе).
//        Для этого, очевидно, можно использовать метод Collection.sort и реализовать
//        несколько Comparator<Person>


import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

List <Good> goods=new ArrayList<>();
Good good1=new Good(5.6,9,10);
goods.add(good1);
goods.add(new Good(8.3,1,20));
goods.add(new Good(2.3,3,50));
goods.add(new Good(7.3,8,90));

      //  System.out.println(goods);
        Comparator<Good> byPrice= new ComparatorByPrice();
  //      List<String> string =new ArrayList<>();/*тренируемся сравнивать String*/
  //      string.add("ручка");
   //     string.add("пенал");
  //      string.add("карандаш");
   //     System.out.println(string);
    }
}