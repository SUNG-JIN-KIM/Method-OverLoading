public class Main {
    /*public static void greet() {
        System.out.println("Hello, World!");
    }

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }*/

    public static String greet() {
        return "Hello, World!";
    }

    public static String greet(String name) {
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {

        System.out.println(greet());
        System.out.println(greet("Alice"));
    }
}