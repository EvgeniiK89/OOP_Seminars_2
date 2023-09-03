public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public String getName() {
        return name;
    }
    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }
    public void eat(Plate plate) {

        if (this.satiety) {
            return;
        }
        if (plate.minusFood(this.appetite)) {
            System.out.printf("Кот %s съел %d ед. еды\n", this.name, this.appetite);
            this.setSatiety(true);
        }
    }
    }

