package ex003;

public class Cat
{
    private String name;
    private int hungry;
    private int status;

    public Cat(String name,int hungry,int status)
    {
        this.hungry = hungry;
        this.status = status;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setHungry(int hungry) {
        this.hungry = hungry;
    }
    
    public int getHungry() {
        return hungry;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String info()
    {
        return String.format("Имя:%s, Аппетит:%d, Голод:%d", name,hungry,status);
    }

     public void eat(int foodinplate)
    {
        if(foodinplate >= hungry)
        {
            setHungry(foodinplate);
            System.out.println("Котик доволен");
        }
        else{
            System.out.println("Слишком мало еды чтобы поесть");
        }
    }

    public boolean checkhungry(int status)
    {
        if(status < 5)
        {
            System.out.println("Котик голоден");
            return true;
        }
        else{
            return false;
        }
    }
}