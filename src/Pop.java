import java.util.Stack;

public class Pop {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        Stack<String>  s2 = new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(2);
        s2.push("A");
        s2.push("B");
        System.out.println("Stack 1 :- "+ s1);
        System.out.println("Stack 2 :- "+ s2 );
        s1.pop();
        s1.pop();
        s2.pop();
        System.out.println("After stack 1 :- "+ s1);
        System.out.println("After stack 2 :- "+ s2);

    }
}
