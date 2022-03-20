public class Human {
    String name;
    int age;
    String job;
    String p_type;
    String marc;

    Human(String job, int age, String p_type, String marc) {
        this.job = job;
        this.age = age;
        this.p_type = p_type;
        this.marc = marc;
    }

    Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Human(String name, int age, String job, String p_type, String marc) {
        this.name = name;
        this.job = job;
        this.p_type = p_type;
        this.marc = marc;
    }

    Human(String name, String p_type, String marc) {
        this.name = name;
        this.p_type = p_type;
        this.marc = marc;
    }

    void say() {
        System.out.println("Hi, I am  " + this.name + " " + this.age + " I am a " + this.job + " .I have a " + this.p_type + " .I have a car. This is a " + this.marc);
    }
}

