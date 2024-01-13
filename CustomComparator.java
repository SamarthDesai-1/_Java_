import java.util.PriorityQueue;

public class CustomComparator {

    public static class Student implements Comparable<Student> {
        String name;
        int marks;
        int age;

        Student(String name, int marks, int age) {
            this.name = name;
            this.age = age;
            this.marks = marks;
        }

        @Override
        public int compareTo(Student b) {
            return this.age - b.age;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        String[] name = { "Harry", "Bill", "Jacob", "Samarth", "Elon", "Joma" };
        int[] marks = { 75, 85, 17, 36, 100, 96 };
        int[] age = { 20, 28, 26, 32, 28, 45 };

        for (int i = 0; i < name.length; i++) {
            pq.add(new Student(name[i], marks[i], age[i]));
        }

        System.out.println("Sorting is did with respect to AGE.");
        while (pq.size() > 0) {
            Student temp = pq.remove();
            System.out.println(temp.name + " " + temp.marks + " " + temp.age);
        }

    }

}

