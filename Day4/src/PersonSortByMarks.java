// PROG 2: Sorting Custom Objects (Person) by Marks
import java.util.*;

public class PersonSortByMarks {

    static class Person {
        String name;
        int age;
        int marks;
        String department;

        Person(String name, int age, int marks, String department) {
            this.name = name;
            this.age = age;
            this.marks = marks;
            this.department = department;
        }

        @Override
        public String toString() {
            return name + " (" + age + ") (" + marks + ") (" + department + ")";
        }
    }

    public static void main(String[] args) {
        Person[] people = {
                new Person("Alice", 30, 56, "AI"),
                new Person("Bob", 25, 78, "DS"),
                new Person("Charlie", 35, 99, "CSE")
        };

        Arrays.sort(people, (a, b) -> a.marks - b.marks);
        System.out.println("Sorted people by marks: " + Arrays.toString(people));
    }
}

/*
Test Cases:
People:
- Alice, 30, 56, AI
- Bob, 25, 78, DS
- Charlie, 35, 99, CSE

→ Output:
Sorted order:
Alice (30) (56) (AI), Bob (25) (78) (DS), Charlie (35) (99) (CSE)
*/
