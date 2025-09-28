import java.lang.*;
import java.util.ArrayList;

class Main{
    public static void main(String[] args){
        //array
        int[] arr=new int[3];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        //arr[3]=4;
        System.out.println("array elements="+arr);
        for(int i=0;i<arr.length;i++){
            //ilteration
            System.out.println("arr="+arr[i]);
        }

        //ArrayList
        ArrayList<Integer> num = new ArrayList<Integer>();
        ArrayList<Integer> num2 = new ArrayList<Integer>();

        //Adding Elements:
        //adding elements in num2
        num2.add(25);
        num2.add(35);
        num2.add(45);

        //add the elements
        num.add(1); //0
        num.add(2); //1
        num.add(3); //2
        num.add(4); //3
        //num.add("w");
        System.out.println(num);

        //adding element at specific index
//        num.add(1,5);
//        System.out.println(num);

        //adding a new ArrayList into previous arrayList
//        num.addAll(num2);
//        System.out.println(num);

        //adding Arraylist at specific index
         num.addAll(1,num2);
         System.out.println(num);

       //Accessing and modification:
        //accessing the element with index
        System.out.println("index4="+num.get(4));
        //accessing first element in the list
        System.out.println("firstelement="+num.getFirst());
        //accessing last element in the list
        System.out.println("lastelement="+num.getLast());

        //modification/replace
        num.set(1,80);
        System.out.println(num);

        //size of the list
        System.out.println("size="+num.size());
        num.add(123);
        System.out.println("size="+num.size());
        num.remove(1);
        System.out.println("size="+num.size());
        System.out.println(num);

        //check is list Empty
//        num.add(123);
//        System.out.println(num);
//        num.removeAll(num);
        System.out.println("isEmpty="+num.isEmpty());
        //l1=1,2,3
        //l2=3,4,5

        //Removing
        //removing using index
        num.remove(1);
        System.out.println(num);
        //removing using object
        Integer n1=123;
        num.remove(n1);
        System.out.println(num);
        //remove all
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        ArrayList<Integer> l2 = new ArrayList<Integer>();
        l2.add(3);
        l2.add(4);
        l2.add(5);
        System.out.println("l1="+l1);
        l1.removeAll(l2);//removes all the matching elements of the given collection
        System.out.println("l1="+l1);
        //l1.removeAll(l1);
        //clear(removes) all elements
        l1.clear();
        System.out.println("l1="+l1);

        //searching
        //contains
        Integer key=45;//object
        System.out.println(num);
        System.out.println(num.contains(key));
        //indexOf
        System.out.println("index="+num.indexOf(key));
        //lastindexof
        ArrayList<Integer> l3 = new ArrayList<>();
        l3.add(1);
        l3.add(2);
        l3.add(1);
        System.out.println("lastindexof="+l3.lastIndexOf(1));

        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("pineapple");
        System.out.println(fruits);
    }
}
