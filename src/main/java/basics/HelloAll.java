package basics;

public class HelloAll
{


    public static void hello(String name) {
        System.out.println("Hello " + name);
    }
    private static void hello(String ... names) {
      for (String name: names){
          System.out.println("Hello " +  name);
        }
    }

    public static void main(String[] args) {
        hello("Jessi");
        System.out.println("----------------");
        hello("Soni", "Moni");
        System.out.println("----------------");
        hello("Christi","Harry","Danny");

    }


}
