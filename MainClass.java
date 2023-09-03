public class MainClass {
    public static void main(String[] args) {

        Cat [] cats = {
                new Cat("Барсик", 25, false),
                new Cat("Мурка", 15, false),
                new Cat("Беляш", 10,false),
                new Cat("Васька", 20,false)
        };

        Plate plate = new Plate(60);

        for (Cat cat : cats){
            cat.eat(plate);
            plate.info();
            if (cat.isSatiety()) {
                System.out.printf("Кот %s наелся\n", cat.getName());
            } else {
                System.out.printf("Коту %s не хватило еды\n", cat.getName());
            }
        }
    }
}

