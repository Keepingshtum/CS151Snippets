package designpatterns;

    class SubsystemOne {
        void operationOne() {
            System.out.println("SubsystemOne: Operation One");
        }

        void operationTwo() {
            System.out.println("SubsystemOne: Operation Two");
        }
    }

    class SubsystemTwo {
        void operationOne() {
            System.out.println("SubsystemTwo: Operation One");
        }

        void operationTwo() {
            System.out.println("SubsystemTwo: Operation Two");
        }
    }

    class Facade {
        private SubsystemOne subsystemOne;
        private SubsystemTwo subsystemTwo;

        public Facade() {
            subsystemOne = new SubsystemOne();
            subsystemTwo = new SubsystemTwo();
    }

        public void operationGroupOne() {
            subsystemOne.operationOne();
            subsystemTwo.operationOne();
        }

        public void operationGroupTwo() {
            subsystemOne.operationTwo();
            subsystemTwo.operationTwo();
        }
    }

    public class FacadeDesign {
        public static void main(String[] args) {
            Facade facade = new Facade();

            facade.operationGroupOne();
            facade.operationGroupTwo();
        }
    }
