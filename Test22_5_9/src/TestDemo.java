import java.util.*;

public class TestDemo {
    public static void main2(String[] args) {
        //使用HashMap存储数据
        Map<String,Integer> map=new HashMap<>();

        //添加元素
        map.put("abc",3);
        map.put("bit",2);
        map.put("hello",4);
        //打印map
        System.out.println(map);
        //打印map对应的主键的值
        int ret=map.get("bit");
        System.out.println(ret);
        System.out.println(map.get("bit2"));//打印null
        System.out.println(map.getOrDefault("bit",11));//如果有该主键就打印值，没有该主键就默认打印定义的值

        //将map的主键存放进set集合中
        Set<String> set=map.keySet();
        System.out.println(set);

        //将map的每个主键和值封分别装放，然后存放进set集合中
        Set<Map.Entry<String,Integer>> entrySet= map.entrySet();
        //打印集合中的map的元素的主键和值
        for (Map.Entry<String,Integer> entry: entrySet) {
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
    }

    //key表示数字，value表示出现的次数
    public static Map<Integer,Integer> func(int[] array){
        Map<Integer,Integer> map=new HashMap<>();
        for (int i:array){
            if (map.get(i)==null){
                map.put(i,1);
            }else {
                int val=map.get(i);
                map.put(i,val+1);
            }
        }

        return map;
    }
    public static void main(String[] args) {
        int[] array=new int[10];
        Random random=new Random();
        for (int i=0;i<array.length;i++){
            array[i]=random.nextInt(10);
            System.out.print(array[i]+" ");
        }

        System.out.println();
        System.out.println(func3(array));

    }

    public static  int func3(int[] array) {
        Set<Integer> set=new HashSet<>();
        for (int i:array){
            if (!set.contains(i)){
                set.add(i);
            }else {
                return i;
            }

        }
        return -1;
    }
    //找第一次出现的重复数据1
    public static  int func2(int[] array){
        Map<Integer,Integer> map=new HashMap<>();

        for (int i:array){
            if (map.get(i)==null){
                map.put(i,1);
            }else {
                return i;
            }
        }
        return -1;
    }
    //将数据存放进HashSet集合中，利用set将数据进行去重，不过数据之前的顺序将打乱。
    public static Set<Integer> func1(int[] array){
        Set<Integer> set=new HashSet<>();
        for (int i:array){
            set.add(i);
        }

        return set;
    }


}
