package Animals;

public class Cat {
    private String name;
    private int age;
    private String breed;
    private String size;

    public Cat(String name, int age, String breed, String size) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.size = size;
    }

    public String meow(String size) {
        String meow = "'";
        if (size.equalsIgnoreCase("small")) {
            meow = "silent meow";
        } else if (size.equalsIgnoreCase("medium")) {
            meow = "meow";
        } else if (size.equalsIgnoreCase("large")) {
            meow = "MEOW!";
        }
        return meow;
    }

    public String sleep(String breed) {
        String sleep = "";
        if (breed.equalsIgnoreCase("munchkin")) {
            sleep = "You are too small therefore I sleep all day";
        } else if (breed.equalsIgnoreCase("Egyptian Mau")) {
            sleep = "I'm too sophisticated to sleep";
        } else if (breed.equalsIgnoreCase("Ragdoll")) {
            sleep = "I can never sleep because I like playinng too much";
        }
        return sleep;
    }

    public String beHuman(String name, int age, String breed) {
        return "Hello human, I'm " + name + " and I am a " + age + " year old " + breed + ", What breed are you?";
    }
}
