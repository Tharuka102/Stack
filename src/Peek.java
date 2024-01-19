import java.util.Stack;

public class Peek {
    public static void main(String[] args) {


        Stack<Integer> s = new Stack<>();
        s.push(23);
        s.push(34);
        s.push(54);
        s.push(234);
        s.push(34);
        s.push(78);

        System.out.println("Top peek :- "+ s.peek());
        System.out.println("Position :-"+ s.search(23));
        System.out.println("is stack Empty :- "+ s.isEmpty());

    }
}
