import java.util.*;

public class Main {
    public static  void print(int sum,String words){
        System.out.println("{"+sum+"}"+":"+words);
    }
    //字符串
    public static void demoString(){
        String str="hello,lisa";
        //字符串的长度
        print(1,String.valueOf(str.length()));
        //查找某个字母在哪里
        print(2,String.valueOf(str.indexOf('e')));
        //字母替换
        print(3,str.replace('h','e'));
        //查找第几个字母是什么
        print(4,String.valueOf(str.charAt(1)));
    }

    //List  ArrayList LinkedList Vector
    public static  void demoList(){
       //ArrayList 可当做动态可变数组 查询与赋值较快
        List<String> list=new ArrayList<>();
        List<String> list2=new ArrayList<>();
        //添加
        for(int i=0;i<5;++i) {
            list.add(String.valueOf(i));
        }
        print(1,String.valueOf(list));
        list2.add("list2");
        list.addAll(2,list2);
        print(2,String.valueOf(list));
        //删除
        list.remove(2);
        print(3,String.valueOf(list));
        //查找
        print(4,String.valueOf(list.get(2)));
        //长度
        print(5,String.valueOf(list.size()));
        //更改
        list.set(2,"first");
        print(6,String.valueOf(list));
        //返回子list
        print(7,String.valueOf(list.subList(2,4)));
        //LinkedList 通过双向链表实现  增删较快
        List<Integer> linkList=new LinkedList<Integer>();
        List<Integer> addlist=new ArrayList<Integer>();
        addlist.add(1);
        addlist.add(2);
        linkList.addAll(addlist);
        linkList.add(2,10);
        print(8,String.valueOf(linkList));
        //Vector 数组实现，是线程安全的，和ArrayList相比，很多方法都是通过同步处理去保证线程安全，所以不涉及线程安全的最好使用ArrayList的
    }

    //集合set 元素不重复，顺序不唯一 HashSet TreeSet LinkedHashSet
    public static void demoSet(){
        //HashSet 为快速查找设计的set，存入的对象必须要有hasCode()
        Set set=new HashSet();
         set.add(new aHashSet());
         set.add(new aHashSet());

         set.add(new bHashSet());
         set.add(new bHashSet());

         set.add(new cHashSet());
         set.add(new cHashSet());
         print(1,String.valueOf(set));
         print(2,String.valueOf(set.size()));
         //迭代输出
        for(Iterator iter=set.iterator();iter.hasNext();){
            Object value =iter.next();
            System.out.println(value);
        }
        //TreeSet 保存次序的Set  可提取有序序列
        TreeSet num=new TreeSet();
        num.add(5);
        num.add(1);
        num.add(8);
        print(3,String.valueOf(num));
        print(4,String.valueOf(num.first()));
        print(5,String.valueOf(num.last()));
        //返回小于4的子集
        print(6,String.valueOf(num.headSet(4)));
        //子集 0-6
        print(7,String.valueOf(num.subSet(0,6)));
        //LinkedHashSet 具有HashSet的查询速度，且内部使用链表维护元素的顺序(插入的次序)。于是在使用迭代器遍历Set时，结果会按元素插入的次序显示。
    }
    //map HashMap TreeMap LinkedHashMap HashTable
    public static void demoMap(){
        Map<String,String> map=new HashMap<>();
        map.put("1","xiaoming");
        map.put("2","xiaohong");
        map.put("3","xiaobai");
        //entrySet所包含键值对set的集合，每个都是Map.Entry对象
        //遍历
        for(Map.Entry<String,String> entry:map.entrySet()){
            print(1,entry.getKey()+":"+entry.getValue());
        }
        //key
        for(String key:map.keySet()){
            print(2,key);
        }
        //value
        for(String value:map.values()){
            print(3,value);
        }
        //迭代器
        Iterator<Map.Entry<String,String>> entries=map.entrySet().iterator();
        while (entries.hasNext()){
            Map.Entry<String,String> entry=entries.next();
            print(4,entry.getKey()+":"+entry.getValue());
        }

    }
    //异常处理
    public static void demoError(){
        try {
            //空指针错误
            String s=null;
            s.charAt(1);
            //其他错误
            int a=0,b=1;
            int c=b/a;


        }catch (NullPointerException e){
            print(1,"NullPointer");

        }catch (Exception ex){
            print(2,"Exception");
        }finally {
            print(3,"执行");
        }
    }

    public static void main(String[] args) {
        //继承/封装/多态的实现
//        Animation dog=new Animation("小黑",17);
//        dog.say();
//        dog.talk();
//        //多态的表现，父类可以new出任何子类，在修改时不需要关注前面的定义
//        Animation people=new People("小明",18,"softwareengineer");
//        people.say();
//        people.talk();
        //字符串
//          demoString();
        //List
//        demoList();
        //set
//        demoSet();
        //demoError
//        demoError();
        //map
        demoMap();
    }
}
