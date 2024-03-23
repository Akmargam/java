public class PolyDemo1 {
    class Animal {
        public void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    class Dog extends Animal {
        public void sound() {
            System.out.println("Dog barks");
        }
    }

    public void main(String[] args){
        Animal obj=new Dog();
        obj.sound();

    }

}
