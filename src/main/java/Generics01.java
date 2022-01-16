import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Generics01 {
    public static void main(String[] args) {

        List<String> list = new ArrayList();
        list.add("lalalla");
        Collection<String> collection = list;

        List<Exception> exceptionList = new ArrayList<>();
        Collection<Exception> exceptionCollection = exceptionList;

        List<IllegalArgumentException> exceptions = new ArrayList<>();
        exceptionCollection.addAll(exceptions);

    }
    }

