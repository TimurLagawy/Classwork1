public class Car {
    String marc;
    int age;
    String color;
    String c_type;
    int max_speed;

    Car(String color, String c_type, int max_speed) {
        this.color = color;
        this.c_type = c_type;
        this.max_speed = max_speed;
    }

    Car(String marc, int age, int max_speed) {
        this.marc = marc;
        this.age = age;
        this.max_speed = max_speed;
    }

    Car(String marc, String color, String c_type, int max_speed) {
        this.marc = marc;
        this.color = color;
        this.c_type = c_type;
        this.max_speed = max_speed;
    }

    Car(String marc, int age, String color, String c_type, int max_speed) {
        this.marc = marc;
        this.age = age;
        this.color = color;
        this.c_type = c_type;
        this.max_speed = max_speed;
    }

    void say() {
        System.out.println(this.marc + this.age + this.color + this.c_type + this.max_speed);
    }
}
