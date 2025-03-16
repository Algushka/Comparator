import java.util.Comparator;

public class Good {
    private double price;
    private int rating ;
    private int numberOfGoods;

    public Good(double price, int rating, int numberOfGoods) {
        this.price = price;
        this.rating = rating;
        this.numberOfGoods = numberOfGoods;
    }

    public double getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    public int getNumberOfGoods() {
        return numberOfGoods;
    }
    public static Comparator <Good> compareByPrice(){
        return new ComparatorByPrice();
    }
    @Override
    public String toString() {
        return "Good{" +
                "price=" + price +
                ", rating=" + rating +
                ", numberOfGoods=" + numberOfGoods +
                '}';
    }

    }


