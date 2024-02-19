package _07_Generic;

import java.sql.SQLOutput;
import java.util.ArrayList;

// 일반 클래스
class  Customer{
    ArrayList<String> list = new ArrayList<>();

    public void addElement(String element){
        list.add(element);
    }
    public void removeElement(String element){
        list.remove(element);
    }
    public String get(int i){
        return list.get(i);
    }
    @Override
    public String toString(){
        return "CustomList = " + list;
    }
}

// 제네릭 클래스
class CustomListGeneric<T>{
    ArrayList<T> list = new ArrayList<>();

    public void addElement(T element){
        list.add(element);
    }
    public void removeElement(T element){
        list.remove(element);
    }
    public T get(int i){
        return list.get(i);
    }
    @Override
    public String toString(){
        return "CustomList = " + list; // 항상 리턴 타입이 String 이라 바꾸지 않는다.
    }
}
public class GenericEx1 {
    public static void main(String[] args) {
        // not using generic
        Customer li = new Customer();
        li.addElement("first element");
        li.addElement("second element");
        li.addElement("third element");
        System.out.println(li.toString());

        li.removeElement("second element");
        System.out.println(li.toString());

        String str = li.get(1);
        System.out.println(str);


        // using Generic
        CustomListGeneric<Integer> genericLi = new CustomListGeneric();
        genericLi.addElement(3);
        genericLi.addElement(5);
        genericLi.addElement(6);
        System.out.println(genericLi.toString());

        genericLi.removeElement(5);
        System.out.println(genericLi.toString());

        Integer el = genericLi.get(1);
        System.out.println(el);

        CustomListGeneric<Character> genericLi2 = new CustomListGeneric<>();
        genericLi2.addElement('A');
        genericLi2.addElement('B');
        genericLi2.addElement('C');
        System.out.println(genericLi2.toString());
    }

}
