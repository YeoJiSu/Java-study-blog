import java.util.ArrayList;
import java.util.List;

public class NumberRepository {
    private List<Number> data = new ArrayList<>();
    private static NumberRepository instance = new NumberRepository();

    public static NumberRepository getInstance() {
        return instance;
    }

    public <T extends Number> void addAll(List <T> Data) {
        for (T d : Data) {
            data.add(d);
        }
    }

    public String toString(){
        return data.toString();
    }

}
