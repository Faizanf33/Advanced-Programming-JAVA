import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

class MainClass {
    public static void main(String[] args) {
        String colors[] = new String[]{"blue","red","black","white"};

        List<String> list = new ArrayList<String>();
        list.add(colors[0]);
        list.add(colors[1]);
        list.add(colors[2]);
        list.add(colors[3]);

        list.stream().forEach(color -> System.out.print(color+" "));
        System.out.println();

        List<Character> chars = new ArrayList<Character>();

        int x=4;
        Integer i = x; //Auto Boxing
        x = i; //Auto Unboxing

        Stack<String> stack = new Stack<>();
        stack.push(colors[0]);
        stack.push(colors[1]);
        stack.push(colors[2]);
        stack.push(colors[3]);

        // stack.pop();
        System.out.println("Stack top: "+stack.peek());
        
        Queue<String> queue = new PriorityQueue<String>();
        queue.add("1st");
        queue.add("2nd");
        queue.add("3rd");
        // System.out.println("poll "+queue.poll());
        // System.out.println("poll "+queue.poll());

        Set<String> set = new HashSet<String>();
        set.addAll(stack);
        set.add("blue");
        set.add("red");

        for (String color : set) {
            System.out.println(color);
        }


        Map<String,String> map=new HashMap<>();
        map.put("Black", "#26001b");
        map.put("Red", "#26001b");
        map.put("Pink", "#26001b");
        map.put("Yellow", "#fff600");

        Set<String> set2 = new HashSet<String>();
        set2.addAll(map.values());

        for (String string: set2)
            System.out.println(string);
        
        // for (String key : map.keySet())
        //     System.out.println(map.get(key));

    }
}
