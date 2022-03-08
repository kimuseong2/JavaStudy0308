package List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestList {
    public static void main(String[] args) {
        List<String> listA = new ArrayList<>();

        listA.add("element 1");
        listA.add("element 2");
        listA.add("element 3");

        System.out.println(listA);

        Object element = null;

        List<Object> list = new ArrayList<>();

        list.add(element);

        list.add(0, "element 4");

        System.out.println(list);

        List<String> listSource = new ArrayList<>();


        // addAll 메인ArrayList를 다른 ArrayList 에 붙여 넣을때 사용한다
        listSource.add("123");
        listSource.add("456");

        List<String> listDest   = new ArrayList<>();

        listDest.addAll(listSource);

        List<String> listB = new ArrayList<>();

        listB.add("element 0");
        listB.add("element 1");
        listB.add("element 2");

        //access via index
        String element0 = listB.get(0);
        String element1 = listB.get(1);
        String element3 = listB.get(2);

        System.out.println(listB);

        List<String> listC = new ArrayList<>();

        element1 = "element 1";
        String element2 = "element 2";

        listC.add(element1);
        listC.add(element2);

        int index1 = listC.indexOf(element1);
        int index2 = listC.indexOf(element2);

        System.out.println("index1 = " + index1);
        System.out.println("index2 = " + index2);

        List<String> list1 = new ArrayList<>();

        element1 = "element 1";
        element2 = "element 2";

        list1.add(element1);
        list1.add(element2);
        list1.add(element1);

        int lastIndex = list1.lastIndexOf(element1);
        System.out.println("lastIndex = " + lastIndex);

        List<String> list2 = new ArrayList<>();

        element1 = "element 1";

        list2.add(element1);

        boolean containsElement =
                list2.contains("element 1");

        System.out.println(containsElement);

        List<String> list3 = new ArrayList<>();

        list3.add("object 1");
        list3.add("object 2");
//etc.

        list3.clear();
        System.out.println(list3);

        List<String> list4      = new ArrayList<>();
        List<String> otherList = new ArrayList<>();

        element1 = "element 1";
        element2 = "element 2";
        element3 = "element 3";
        String element4 = "element 4";

        list4.add(element1);
        list4.add(element2);
        list4.add(element3);

        otherList.add(element1);
        otherList.add(element3);
        otherList.add(element4);

        list4.retainAll(otherList);

        System.out.println(list4);

        List<String> list5      = new ArrayList<>();

        list5.add("element 1");
        list5.add("element 2");
        list5.add("element 3");
        list5.add("element 4");

        List<String> sublist = list5.subList(1, 3);

        System.out.println(list5);

        List<String> list6      = new ArrayList<>();

        list6.add("element 1");
        list6.add("element 2");
        list6.add("element 3");
        list6.add("element 3");

        Set<String> set = new HashSet<>();
        set.addAll(list6);

        System.out.println(set);

        List<String> list7      = new ArrayList<>();

        list7.add("element 1");
        list7.add("element 2");
        list7.add("element 3");
        list7.add("element 3");

        Object[] objects = list7.toArray();

        System.out.println(list7);
    }
}
