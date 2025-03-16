import java.util.Comparator;
//**
public final class ComparatorByNumberOfGoods implements Comparator<Good> {


    @Override
    public int compare(Good o1, Good o2) {
        return Integer.compare(o1.getNumberOfGoods(),o2.getNumberOfGoods());
    }
}
