package ex003;

public class Plate {
    private int foodinplate;

    public Plate(int foodinplate)
    {
        this.foodinplate = foodinplate;
    }

    public int getFoodinplate() {
        return foodinplate;
    }
    
    public void setFoodinplate(int foodinplate) {
        this.foodinplate = foodinplate;
    }

    public void info()
    {
        System.out.println("Еда в тарелке:" + foodinplate);
    }

    public void addfood(int food)
    {
        setFoodinplate(foodinplate + food);
    }
}
