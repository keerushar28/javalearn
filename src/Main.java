public class Main {
     static class Animal{
       void Eat(){
           System.out.println("animal is eating");
       }

    }

     static  class Dog extends  Animal {
        @Override
        void Eat() {
            super.Eat();
        }
    }

    //this is my first java program using IntelliJ IDEA
    public   void main(String[] args){
        Dog dog1 = new Dog();
        dog1.Eat();
        System.out.println("Hello World");
        System.out.println("This is my first java program in intelliJ IDEA");
        System.out.println("I am learning the New Programming Concepts");

    }
}
