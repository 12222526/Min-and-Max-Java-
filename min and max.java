public class Main{
    int wheels;
    int steering;
    int gears;
    boolean exhaust;
      public Main(int wheels, int steering, int gears, boolean exhaust){
        this.wheels = wheels;
        this.steering = steering;
        this.gears = gears;
        this.exhaust = exhaust;
      }
    
    void move(){
        System.out.println(wheels);
    }
    void functionality(){
        System.out.println(steering);
        System.out.println(gears);
    }
    void speed(){
        System.out.println(exhaust);
    }

    public static void main(String[] args){
        Main Tata = new Main(3,5,6,false);
        
        Tata.move();
        Tata.speed();
        Tata.functionality();
     }
}