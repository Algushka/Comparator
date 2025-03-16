import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorByRating implements Comparator<Good> {

//**
    @Override
    public int compare(Good o1, Good o2) {
        return Integer.compare(o1.getRating(),o2.getRating());

    }
}
