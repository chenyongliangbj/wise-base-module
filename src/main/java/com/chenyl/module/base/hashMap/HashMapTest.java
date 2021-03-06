package com.chenyl.module.base.hashMap;

import com.chenyl.module.spring.model.Person;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args){

        //HashMap存取
        {
            System.out.println("================HashMap存取==================");

            HashMap<String,String> map = new HashMap<>();

            map.put("name","chenyl");
            map.put("sex","男");
            map.put(null,"ddd");
            map.put(null,"eee");
            map.put("test",null);
            map.put("test11",null);

            System.out.println(map.get("name"));
            System.out.println(map.get("sex"));
            System.out.println(map.get(null));
            System.out.println(map.get("test"));
            System.out.println(map.get("test11"));

            //结论：
            // 1、HashMap存储结构为key-value，存储的是键值
            // 2、允许null值和null键
        }

        {
            System.out.println("================测试HashMap key值的变化==================");

            HashMap<Object,String> map = new HashMap<>();

            Person1 person1 = new Person1();
            person1.setAge(12);
            person1.setName("chenyl");

            map.put(person1,"chenyl");
            System.out.println(map);

            person1.setName("guolin");
            System.out.println(map);
        }

        //HashMap重复put值时，是否会覆盖前面的value
        {
            System.out.println("================HashMap重复put值时，是否会覆盖前面的value==================");

            HashMap<Person,String> map1 = new HashMap<>();
            Person person1 = new Person("chenyl",18);
            Person person2 = new Person("guolin",20);

            //Person中必须重写HashCode
            map1.put(person1,"1111");
            map1.put(person2,"2222");
            System.out.println(map1);
            System.out.println("person2.hashCode:"+person2.hashCode());
            person2.setAge(25);
            System.out.println(map1);
            System.out.println("person2.hashCode:"+person2.hashCode());
            map1.put(person2,"3333");
            System.out.println(map1);

            //结论：
            // 1. 如果key相同，但是hashcode不同，那么value不会被覆盖
            // 2. 如果key相同，并且hashCode相同，那么value会被覆盖
        }

        //Map的遍历
        {
            System.out.println("================Map的遍历==================");

            HashMap<String,String> map = new HashMap<>();
            map.put("1","chenyl");
            map.put("2","guolin");

            //1、增强for循环遍历key
            System.out.println("通过Map.keySet遍历key和value：");
            Set<String> keys = map.keySet();
            for (String key: keys){
                System.out.println("key:"+key+" value:"+map.get(key));
            }
            //2、增强for循环遍历value
            System.out.println("通过Map.values()遍历所有的value，但ey");
            for(Object v:map.values())
            {
                System.out.println("value:"+v);
            }
            //3、增强for循环遍历entrySet
            System.out.println("通过Map.entrySet遍历key和value");
            for(Map.Entry<String, String> entry: map.entrySet())
            {
                System.out.println("Key: "+ entry.getKey()+ " Va"+entry.getValue());
            }
            //4、iterator
            System.out.println("通过Map.entrySet使用iterator遍历key和va");
            Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
            while(iterator.hasNext()){
                HashMap.Entry<String,String> entry = iterator.next();
                System.out.println("key:"+entry.getKey()+" value:"+entry.getValue());
            }

            //总结：
            // 1、抽象类可以不用实现接口的全部方法
            // 2、增强for循环根本还是iterator()
        }
    }
}

class Person1{

    int age;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person1{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
