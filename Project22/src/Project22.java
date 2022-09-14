import java.util.*; //Using "java.util.ArrayList;"

public class Project22 {
    
public static void main(String[] args) {
    
    ArrayList<Integer> list = new ArrayList();
    
    //Add Element
    list.add(10);
    list.add(25);
    list.add(88);
    list.add(4);
    
    System.out.format("List = %s\n", list);
    
    //Remove Element
    list.remove((Object) 88);
    list.remove(2);
    
    System.out.format("List = %s\n", list);
    
    //Set Element
    list.set(0, 14);
    
    System.out.format("List = %s\n", list);
    
    //Get Element
    int index = 1;
    System.out.format("A[0] = %d\n", list.get(index));
    
    }

}