class Human {

    private String name;

    private String surname;

    private boolean sex;

    private int age;

    public void setName(String humanName) {
        if (humanName.isEmpty()){
            System.out.println("Invalid Name!");
        }
        name = humanName;
    }
    public String getName(){
        return name;
    }

    public void setSurname(String humanSurname) {
        surname = humanSurname;
    }
    public String getSurname(){
        return surname;
    }

    public void setSex(boolean humanSex) {
        sex = humanSex;
    }
    public boolean getSex(){
        return sex;
    }

    public void setAge(int humanAge) {
        if (humanAge<0){
            System.out.println("Invalid age!");
        }
        age = humanAge;
    }
    public int getAge(){
        return age;
    }

}