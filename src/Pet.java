

    public class Pet {
        String p_type;
        String name;
        int age;
        String color;
        String breed;

        Pet(String p_type, String name, int age) {
            this.p_type = p_type;
            this.name = name;
            this.age = age;
        }

        Pet(String name, int age) {
            this.name = name;
            this.age = age;
        }

        Pet(String name, String color, String breed) {
            this.name = name;
            this.color = color;
            this.breed = breed;
        }

        void say() {
            System.out.println();
        }
    }

