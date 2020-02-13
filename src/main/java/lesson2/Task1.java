package main.java.lesson2;

public class Task1 {

    private int age;
    private String name;
    private String ageGroup;


    public void setAge(int age) {
        if (age <= 0 || age > 100) {
            System.out.println("Please enter the valid age from 0 to 100");
        } else {
            this.age = age;
        }

    }

    public int getAge() {
        return age;
    }


    public void setName(String name) {
        if (name.isEmpty() || ( name.length() < 3 ) || name.trim().isEmpty() ) {
            System.out.println("The name should contain more than 3 symbols");
        } else if (name.length() > 3 && name.length() <= 49) {
            System.out.println(name.substring(0, 1).toUpperCase() + name.substring(1));
        } else if (name.length() > 50) {
            System.out.println(name.substring(0, 1).toUpperCase() + name.substring(1,50));
        }
        System.out.println(this.name);


        }

        public String getName(){
            return name;
        }

        public void setAgeGroup(){
            this.ageGroup = ageGroup;
            int age = getAge();
            if (age <= 15) {
                System.out.println("Child");
            } else if (age > 15 && age <= 25) {
                System.out.println("Student");
            } else if (age > 25 && age <= 65) {
                System.out.println("Worker");
            } else if (age > 65 && age <= 100) {
                System.out.println("Pensioner");
            } else if (age > 100) {
                System.out.println("Group is not defined");
            }
            System.out.println(this.ageGroup);
        }


    }









