package inheritancepackage;

public class Player extends Sport{

        private String name;
        private String about;
        private double salary;

        public Player(String name,double salary){
                this.name=name;
                this.salary=salary;
        }
        //constructor overloading
        public Player(String name,String about,double salary){
                this.name=name;
                this.about=about;
                this.salary=salary;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getAbout() {
                return about;
        }

        public void setAbout(String about) {
                this.about = about;
        }

        public double getSalary() {
                return salary;
        }

        public void setSalary(double salary) {
                this.salary = salary;
        }

        @Override
        public void display() {                                        //overriding
                System.out.println("Name of the player: "+this.name);
                super.display();
        }
}
