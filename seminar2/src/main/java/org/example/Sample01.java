package org.example;

public class Sample01 {
    public void main(String[] args){
        Cat cat1 = new Cat("Peach");
        Dog dog1 = new  Dog("Ballon");


    }

    public class Dog extends Animal{
        public Dog(String name){
            super(name);
        }
        @Override
        public void voice(){
        System.out.println("Ow-ow");
        };
        @Override
        public void jump(){
            super.jump();
        }
    }

    class Cat extends Animal{
        public Cat(String name){
            super(name);
        }
        public void voice(){
            System.out.println("Meow");
        }
    }



    abstract class Animal{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Animal(String name){
            this.name = name;
        }

        public void jump(){
            System.out.println("Jump");
        }

        public abstract void voice();
    }
}

