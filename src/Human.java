public class Human {

    boolean walking; // false
    String name; // null
    int age; // 0

    public static void main(String [] args){
        Human ivan = new Human("ivan", 23); // тип переменной (имя класса) переменная -> новый объект
//        Human human2 = new Human();
//        Human human3 = human2;
        ivan.walk();
//        ivan.setName("ivan");
        ivan.stop();
        System.out.println(ivan.getName());
    }

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }





    public void walk() {
        System.out.println("walking...");
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




    public void stop(){
        System.out.println("Stop...");
    }












}
