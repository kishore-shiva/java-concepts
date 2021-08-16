import java.util.*;

public class ArrayListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        //to add element to the list
        list.add(1);
        //to update the list -- list.set(index, newValue)
        list.set(0, 2);
        //to remove element from the list -- list.remove(index)
        list.remove(0);
        //to get value from the list -- list.get(index)
        int i = list.get(0);
        //print the list:
        System.out.println(list);

        //methods:

        //Length if the list:
        int a = list.size();

        //iterate over length of the list --:
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

//Stack implememtation:

//stack eg: book shelf -- adds element to the last, removes element from the last

class StackImplementation{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        //to add element to the stack
        stack.push(1);
        //to remove element from the stack -- stack.pop()
        stack.pop();
        //to check if the stack is empty -- stack.isEmpty()
        boolean b = stack.isEmpty();
        //to get the length of the stack -- stack.size()
        int i = stack.size();
    }
}

//Queue implementation:

//queue eg: people standing in a line -- adds element to the last, removes element from the front

class QueueImplementation{
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        //to add element to the queue
        queue.add(1);
        //to remove element from the queue -- queue.remove()
        queue.remove();
        //to check if the queue is empty -- queue.isEmpty()
        boolean b = queue.isEmpty();
        //to get the length of the queue -- queue.size()
        int i = queue.size();   
    }
}
