public class Plate {
    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    private int food;
    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        if (food < 0) {
            food = 0;
        }
        System.out.println("В тарелке еды: " + food);
    }

    public boolean minusFood(int eating){
        if (food < eating) {
            System.out.println("В тарелке мало еды");
            return false;
        } else {

            food = food - eating;
            return true;
        }
    }
}
