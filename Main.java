public class Main {

    public static void main(String[] arg) {
        Human human = new Human();
        human.setName("Mikhail");
        human.setSurname("Brann");
        human.setSex(true);
        human.setAge(25);

        System.out.println("Name: " + human.getName());
        System.out.println("Surname: " + human.getSurname());
        System.out.println("Sex: " + (human.getSex() ? "male" : "female"));
        System.out.println("Age: " + human.getAge());

    }

}
