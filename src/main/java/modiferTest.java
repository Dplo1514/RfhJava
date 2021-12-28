import pkg.Modifier;

class Modi extends Modifier {
  void callParentProtected(){
      System.out.println("My Parent call");
      super.messageProtected();
    }
}

public class modiferTest {
    public static void main(String[] args) {
        Modifier modifier = new Modifier();
        modifier.messageOutside();
//       modifier.messageInside();
//       modifier.messageProtected();
//       modifier.messagePkgPrivate();


        Modi modi = new Modi();
        modi.callParentProtected();
    }
}
