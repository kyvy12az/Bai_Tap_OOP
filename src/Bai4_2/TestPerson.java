package Bai4_2;

public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Alice", "123 Main St");
        System.out.println(p1); // Person[name=Alice, address=123 Main St]

        Student s1 = new Student("Bob", "456 College Rd", "Computer Science", 2023, 15000.5);
        System.out.println(s1); // Student[Person[name=Bob, address=456 College Rd], program=Computer Science, year=2023, fee=15000.5]

        Staff st1 = new Staff("Charlie", "789 School Ave", "XYZ High School", 5000.75);
        System.out.println(st1); // Staff[Person[name=Charlie, address=789 School Ave], school=XYZ High School, pay=5000.75]
    }
}
