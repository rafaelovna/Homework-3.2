public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int human = 25;
        if (human >=2 && human <=6){
            System.out.println("Если возраст человека равен "+human+", то ему нужно ходить в детский сад!");
        }else if (human >=7 && human <=18){
            System.out.println("Если возраст человека равен "+human+", то ему нужно ходить в школу!");
        }else if (human > 18 && human < 24){
            System.out.println("Если возраст человека равен "+human+", то ему нужно ходить в университет!");
        }else if (human > 24){
            System.out.println("Если возраст человека равен "+human+", то ему нужно ходить на работу!");
        }

        System.out.println("Задание 2");
        int childAge = 15;
        if (childAge < 5){
            System.out.println("Если возраст ребенка "+childAge+", то он не может кататься на аттракционе.");
        } else if (childAge > 5 && childAge < 14){
            System.out.println("Если возраст ребенка "+childAge+", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }else if (childAge > 14){
            System.out.println("Если возраст ребенка "+childAge+",то он может кататься без сопровождения взрослого.");
        }

        System.out.println("Задание 3");
        int one = 6;
        int two = 13;
        int three = 3;
        if (one >= two && one >= three){
            System.out.println("Число "+one+" большее!");
        }else if (two >= one && two >= three){
            System.out.println("Число "+two+" большее!");
        }else if (three >= one && three >= two){
            System.out.println("Число "+three+" большее!");
        }
    }
}