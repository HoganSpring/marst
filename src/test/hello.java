package test;

public class hello {
    public static void main(String[] args) {
        Son son = new Son();
        Son son2 = new Son();
    }
}

class Son {

    public Son() {
        System.out.println("this is son.");
    }

    public Son(int age) {
        System.out.println("son is " + age + " years old.");
    }
    
    private Height height = new Height(1.8f);
    
    public static Gender gender = new Gender(true);
}

class Height {
    public Height(float height) {
        System.out.println("initializing height " + height + " meters.");
    }
}

class Gender {
    public Gender(boolean isMale) {
        if (isMale) {
            System.out.println("this is a male.");
        } else {
            System.out.println("this is a female.");
        }
    }
}