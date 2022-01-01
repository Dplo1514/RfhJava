import java.lang.reflect.Executable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class generics {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("String");
        Collection<String> collection = list;

        List<Exception> exceptionsList = new ArrayList<>();
        Collection<Exception> exceptionCollection = exceptionsList;

        List<IllegalArgumentException> illegalArgumentExceptionList = new ArrayList<>();
        exceptionCollection.addAll(illegalArgumentExceptionList);
    }
}