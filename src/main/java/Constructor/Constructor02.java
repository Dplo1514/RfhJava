package Constructor;

class DefaultValueTest { //Class에 선언된 멤버변수는 인스턴스가 생성될 때 값이 초기화됨
    byte byteDefaultValue;
    int intDefaultValue;
    short shortDefaultValue;
    long longDefaultValue;
    float floatDefaultValue;
    double doubleDefaultValue;
    boolean booleanDefaultValue;
    String referenceDefaultValue;
}

public class Constructor02 {
    public static void main(String[] args) {
        DefaultValueTest defaultValueTest = new DefaultValueTest(); //변수의 선언부나 생성자를 통해서 초기화해주지 않는다면
        System.out.println("byte default: " + defaultValueTest.byteDefaultValue); //데이터 타입의 기본 값을 가진다.
        System.out.println("short default: " + defaultValueTest.shortDefaultValue);
        System.out.println("int default: " + defaultValueTest.intDefaultValue);
        System.out.println("long default: " + defaultValueTest.longDefaultValue);
        System.out.println("float default: " + defaultValueTest.floatDefaultValue);
        System.out.println("double default: " + defaultValueTest.doubleDefaultValue);
        System.out.println("boolean default: " + defaultValueTest.booleanDefaultValue);
        System.out.println("reference default: " + defaultValueTest.referenceDefaultValue);
    }
}
