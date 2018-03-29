public class Human {

    boolean walking; // false
    String name; // null
    int age; // 0
    Animal animal;

    public static void main(String [] args){
        Human ivan = new Human("ivan", 23); // тип переменной (имя класса) переменная -> новый объект
//        Human human2 = new Human();
//        Human human3 = human2;
        ivan.walk();
//        ivan.setName("ivan");
        ivan.stop();
        Animal cat = new Animal("tolik", "grey");
        ivan.addPet(cat);
//        System.out.println(ivan.getName());
    }


    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }





    public void walk() {
        if (!walking){
            System.out.println("walking...");
            walking = true;
        }
        System.out.println("Already walking...");
    }



//    public void setName(String name){
//        this.name = name;
//    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return age;
    }

    public void addPet(Animal animal){
        this.animal = animal;
    }



    public void stop(){
        if (walking){
        System.out.println("Stop...");
        walking = false;
        } else {
            System.out.println("Already stop...");
        }
    }
}

class Animal{

    String name;
    String color;
    int age;

    public Animal(String name, String color){
       this.name = name;
       this.color = color;
    }
}