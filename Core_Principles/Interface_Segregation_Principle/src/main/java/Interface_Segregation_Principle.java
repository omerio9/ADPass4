public class Interface_Segregation_Principle {

    public interface Animal {

        void cry();

        void walk();

        void fly();

        void run();

    }
    public class Ostrich implements Animal {

        @Override
        public void run() {
            System.out.println("Ostrich started running");
        }

        @Override
        public void walk() {
            System.out.println("Ostrich started walking");
        }

        @Override
        public void fly() {
        }

        @Override
        public void cry () {
        }
    }
    /******************************************/
    //The violation is because a class cannot implement an interface when it does not need to use all its methods
    //So to make it compliant, the interface can be split into 2 categories
    public interface RunningAnimal extends Animal {

        void run();
        void walk();
    }



    public interface FlyingAnimal extends Animal {

        void fly();

        void walk();

    }

    public class Ostrich implements RunningAnimal {

        @Override
        public void run() {
            System.out.println("Ostrich started running");
        }

        @Override
        public void walk() {
            System.out.println("Ostrich started walking");
        }

    }

}
