public class HelloWorld {

    public static void main(String[] args) {
        String name = "friend";

        if(args.length>0){
            name = args[0];
        }

        System.out.printf("Hello, %s!! How are you doing today?\n\n", name);
    }
}