class Person {

    String name;
    int age;

    // Parent class constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Common method
    void showPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


// Learner inherits Person
class Learner extends Person {

    String learnerId;
    String course;

    // Learner constructor
    Learner(String name, int age, String learnerId, String course) {

        // Call parent constructor
        super(name, age);

        this.learnerId = learnerId;
        this.course = course;
    }

    void showLearnerDetails() {

        showPersonDetails();

        System.out.println("Learner ID: " + learnerId);
        System.out.println("Course: " + course);
    }
}


// Teacher inherits Person
class Teacher extends Person {

    String teacherId;
    String subject;

    // Teacher constructor
    Teacher(String name, int age, String teacherId, String subject) {

        // Call parent constructor
        super(name, age);

        this.teacherId = teacherId;
        this.subject = subject;
    }

    void showTeacherDetails() {

        showPersonDetails();

        System.out.println("Teacher ID: " + teacherId);
        System.out.println("Subject: " + subject);
    }
}


public class inheritance {

    public static void main(String[] args) {

        Learner learner = new Learner(
                "Ali Hassan",
                20,
                "LR001",
                "Computer Science"
        );

        Teacher teacher = new Teacher(
                "Ahmed Khan",
                35,
                "TR001",
                "Java Programming"
        );

        System.out.println("----- Learner Details -----");
        learner.showLearnerDetails();

        System.out.println();

        System.out.println("----- Teacher Details -----");
        teacher.showTeacherDetails();
    }
}
