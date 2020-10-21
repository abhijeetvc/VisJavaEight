// d) Reference to constructor

interface Myinterface{
    Message display(String str);
}

class Message{
    public Message(String s){
        System.out.println(s);
    }
}

public class MethodReference4 {
    public static void main(String[] args) {
        Myinterface my=Message::new;
        my.display("Hello Java8");
    }
}
