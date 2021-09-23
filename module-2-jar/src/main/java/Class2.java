
public class Class2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Class2 called waiting 1000 for class 1");
        Thread.sleep(1000);
        System.out.println(Class1.printMessage());
    }
}
