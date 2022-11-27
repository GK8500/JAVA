public class z {
    static class vehical {
        int maxSpeed = 120;
    }
    static class car extends vehical{
        // int maxSpeed = 180;
        void display(){
            // System.out.println("Maximum speed: " + maxSpeed);
            System.out.println("Maximum speed: " + super.maxSpeed);
        }
    }

    static class Person{

        Person(){
            System.out.println("A contructor of parent class.");
        }
        void message(){
            System.out.println("This is the parent class person");
        }
    }
    static class Boy extends Person{
        void message(){
            System.out.println("This is a message from boy class");
            super.message();
        }
    }
    static class girl extends Person{
        girl(){
            super();
            System.out.println("Constructor of girl class.");
        }
    }



public static void main(String[] args) {
    car c = new car();
    c.display();

    Boy b1 = new Boy();
    b1.message();

    girl g1 = new girl();
    
}
}