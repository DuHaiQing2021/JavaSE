package com.company;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 三个常用的接口
 *Comparable接口：如果自定义的数据类型进行大小比较一定要实现可以比较的接口，这个接口有一个很大的缺点
 *
 */
class StudentAgeComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.age- o2.age;
    }
}
class Student implements Comparable<Student>{
    public int age;
    public String name;
    public double score;

    public Student(int age, String name, double score) {
        this.age = age;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", score=" + score +
                '}';
    }


    @Override
    public int compareTo(Student o) {
//        if (this.age>o.age){
//            return 1;
//        }else if(this.age==o.age){
//            return 0;
//        }else{
//            return -1;
//        }
        return this.age-o.age;
    }
}

public class TestDemo6 {


    public static void main(String[] args) {
        Student[] students=new Student[3];
        students[0] = new Student(12,"bit",99.3);
        students[1] = new Student(6,"bit",55.3);
        students[2] = new Student(18,"bit",88.3);
        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));





    }
    public static void main2(String[] args) {
        Student[] students=new Student[3];
        students[0] = new Student(12,"bit",99.3);
        students[1] = new Student(6,"bit",55.3);
        students[2] = new Student(18,"bit",88.3);

        System.out.println(Arrays.toString(students));
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

    }

    public static void main1(String[] args) {
        int[] array={1,55,3,62,13,12,2,1,35};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }


}
