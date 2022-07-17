import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        DynamicArray dynamicArray = new DynamicArray(5);

        //System.out.println(dynamicArray.capacity);

        System.out.println(dynamicArray);
        System.out.println("Size: " + dynamicArray.size);
        System.out.println("Capacity: " + dynamicArray.capacity);
        System.out.println("Empty: " + dynamicArray.isEmpty());

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");

        System.out.println(dynamicArray);
        System.out.println("Size: " + dynamicArray.size);
        System.out.println("Capacity: " + dynamicArray.capacity);
        System.out.println("Empty: " + dynamicArray.isEmpty());

        dynamicArray.delete("A");
        dynamicArray.delete("B");
        dynamicArray.delete("C");

//        System.out.println("Is there C: " + dynamicArray.search("C"));
//
//        dynamicArray.insert(2,"X");
//        dynamicArray.insert(2,"Y");
//        dynamicArray.insert(2,"Z");
//
//        dynamicArray.delete("A");
//        System.out.println("Is there A: " + dynamicArray.search("A"));

        System.out.println(dynamicArray);
        System.out.println("Size: " + dynamicArray.size);
        System.out.println("Capacity: " + dynamicArray.capacity);
        System.out.println("Empty: " + dynamicArray.isEmpty());

        System.out.println("-----------------ArayList----------------");
        ArrayList arrayList = new ArrayList<>();
        System.out.println(arrayList);
        System.out.println("Size: " + arrayList.size());
        System.out.println("Empty: " + arrayList.isEmpty());

        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");

        System.out.println(arrayList);
        System.out.println("Size: " + arrayList.size());
        System.out.println("Empty: " + arrayList.isEmpty());
    }
}
