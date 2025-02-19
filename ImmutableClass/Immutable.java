package Java.ImmutableClass;

public final class Immutable {

    private final String name;
    private final int age;

    public Immutable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void about() {
        System.out.println("Hi, "+name+".\nYour age is "+age);
    }
}
