package ex003;



public class Program {
    public static void main(String[] args) {
        
        // Cat cat1 = new Cat("Барсик", 10, 1);
        // Plate plate1 = new Plate(9);

        // System.out.println(cat1.info());
        // plate1.info();
        // cat1.checkhungry(cat1.getStatus());

        // cat1.eat(plate1.getFoodinplate());

        // plate1.addfood(1);
        // cat1.eat(plate1.getFoodinplate());

        Plate plate2 = new Plate(9);

        Cat[]cats = {
            new Cat("Барсик", 9, 1),
            new Cat("Вискас",200,0),
            new Cat("Мурзик",11,2),
            new Cat("Котик",5,10)
        };

        for(Cat cat:cats)
        {
            System.out.println(cat.info());
            cat.eat(plate2.getFoodinplate());
            System.out.println();
        }

        
    }
}
