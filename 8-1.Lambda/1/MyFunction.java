@FunctionalInterface
public interface MyFunction {
    static MyFunction getMyFunction(String f3) {
        MyFunction f = () -> System.out.println(f3+".run()");
        return f;
    }

    void run();

    default void sayHello(){
        System.out.println("hello");
    };
}
//겨우 구현했네...

////FunctionalInterface, Default Interface 메소드 그리고 static interface 메소드