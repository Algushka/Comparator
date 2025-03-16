
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

        List<Good> goods = new ArrayList<>();
        Good good1 = new Good(5.6, 9, 10);
        goods.add(good1);
        goods.add(new Good(8.3, 1, 20));
        goods.add(new Good(2.3, 3, 50));
        goods.add(new Good(7.3, 8, 90));

        System.out.println(chooseMethodOfSorting(goods));
    }
public static int inputNumberOfMethodOfSorting() {
        Scanner scanner = new Scanner(System.in);
    System.out.println("Введите номер метода сортировки: ");
    System.out.println("1- Сортировка по цене по возрастанию: ");
    System.out.println("2- Сортировка по цене по убыванию: ");
    System.out.println("3- Сортировка по рейтингу по возрастанию: ");
    System.out.println("4- Сортировка по рейтингу по убыванию: ");
    System.out.println("5- Сортировка по номеру по возрастанию: ");
    System.out.println("6- Сортировка по номеру по возрастанию: ");
    System.out.println("7-Сортировка по ретингу, затем по цене, затем по количеству товаров на складе");
    return scanner.nextInt();
}
public static List<Good> SortingByPriceUp(List<Good> goods){
        Comparator<Good> compareByPrice = new ComparatorByPrice();
    List <Good> goods_copy=new ArrayList<>(goods);/*делаем копию list goods на всякий случай, чтобы его не менять */
    System.out.println("Сортировка по цене по возрастанию ");
    /* можно так  */ // Collections.sort(goods, new ComparatorByPrice());
    /* можно так*/
    Collections.sort(goods_copy, compareByPrice);
    return goods_copy;
}
    public static List<Good> SortingByPriceDown (List<Good> goods){
        Comparator<Good> compareByPrice = new ComparatorByPrice();
        List <Good> goods_copy=new ArrayList<>(goods);/*делаем копию list goods на всякий случай, чтобы его не менять */
        System.out.println("Сортировка по цене по убыванию  ");
        /* можно так  */ // Collections.sort(goods, new ComparatorByPrice());
        /* можно так*/
        /* можно так: Collections.sort(goods_copy, compareByPrice.reversed());*/
        Collections.sort(goods_copy, Good.compareByPrice().reversed());/* сделаем через Good можно так*/
        return goods_copy;
    }
    public static List<Good> SortingByRatingUp (List<Good> goods){
        Comparator<Good> compareByRating = new ComparatorByRating();
        List <Good> goods_copy=new ArrayList<>(goods);/*делаем копию list goods на всякий случай, чтобы его не менять */
        System.out.println("Сортировка по рейтингу по возрастанию   ");
        /* можно так  */ // Collections.sort(goods, new ComparatorByPrice());
        /* можно так*/
        Collections.sort(goods_copy, compareByRating);
        return goods_copy;
    }
    public static List<Good> SortingByRatingDown (List<Good> goods){
        Comparator<Good> compareByRating = new ComparatorByRating();
        List <Good> goods_copy=new ArrayList<>(goods);/*делаем копию list goods на всякий случай, чтобы его не менять */
        System.out.println("Сортировка по рейтингу по убыванию  ");
        /* можно так  */ // Collections.sort(goods, new ComparatorByPrice());
        /* можно так*/
        Collections.sort(goods_copy, compareByRating.reversed());
        return goods_copy;
    }

    public static List<Good> SortingByNumberUp (List<Good> goods){
        Comparator<Good> compareByNumber = new ComparatorByNumberOfGoods();
        List <Good> goods_copy=new ArrayList<>(goods);/*делаем копию list goods на всякий случай, чтобы его не менять */
        System.out.println("Сортировка по количеству товаров по возрастанию   ");
        /* можно так  */ // Collections.sort(goods, new ComparatorByPrice());
        /* можно так*/
        Collections.sort(goods_copy, compareByNumber);
        return goods_copy;
    }
    public static List<Good> SortingByNumberDown (List<Good> goods){
        Comparator<Good> compareByNumber = new ComparatorByNumberOfGoods();
        List <Good> goods_copy=new ArrayList<>(goods);/*делаем копию list goods на всякий случай, чтобы его не менять */
        System.out.println("Сортировка по количеству товаров по убыванию  ");
        /* можно так  */ // Collections.sort(goods, new ComparatorByPrice());
        /* можно так*/
        Collections.sort(goods_copy, compareByNumber.reversed());
        return goods_copy;
    }
    public static List<Good> SortingByRatingPriceNumberOfGoods (List<Good> goods){
        Comparator<Good> compareByRating = new ComparatorByRating();
        Comparator<Good> compareByNumber=new ComparatorByNumberOfGoods();
        Comparator<Good> compareByPrice=new ComparatorByPrice();
        List <Good> goods_copy=new ArrayList<>(goods);/*делаем копию list goods на всякий случай, чтобы его не менять */
        System.out.println("Сортировка по количеству товаров по рейтингу, затем по цене, затем по количеству товаров на складе----  ");
        /* можно так  */ // Collections.sort(goods, new ComparatorByPrice());
        /* можно так*/
        Collections.sort(goods_copy, compareByRating.thenComparing(compareByPrice).thenComparing(compareByNumber));
        return goods_copy;
    }



public static List<Good> chooseMethodOfSorting(List<Good>goods){

    List<Good> goodsSorted =new ArrayList<>();
    switch (inputNumberOfMethodOfSorting()) {
        case 1: goodsSorted = SortingByPriceUp(goods);break;
        case 2: goodsSorted =  SortingByPriceDown(goods);break;
        case 3: goodsSorted =  SortingByRatingUp(goods); break;
        case 4: goodsSorted = SortingByRatingDown(goods);break;
        case 5: goodsSorted = SortingByNumberUp(goods); break;
        case 6: goodsSorted = SortingByNumberDown(goods); break;
        case 7: goodsSorted=SortingByRatingPriceNumberOfGoods(goods);break;
        default: goodsSorted= goods;}
    return goodsSorted;
}
}