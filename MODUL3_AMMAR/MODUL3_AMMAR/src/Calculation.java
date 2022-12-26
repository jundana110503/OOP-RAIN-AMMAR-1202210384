public class Calculation implements Runnable{
    private double radius;
    private double side;
    private double area;
    private final double phi = 3.14;

    public void setSquare(double side) throws IllegalArgumentException{
        if(side < 1){
            throw new IllegalArgumentException("Illegal Exception");
        }
        this.side = side;
        this.area = side *side;
    }

    public double getSquare(){
        return this.area;
    }

    public void setCircle(double radius) throws IllegalArgumentException{
        if(radius < 1){
            throw new  IllegalArgumentException("Illegal Exception");
        }
        this.radius = radius;
        this.area = phi * radius * radius;
    }

    public double getCircle(){
        return this.area;
    }

    public void setTrapezoid(double a,double b, double t) throws IllegalArgumentException{
        if(a < 1 || b < 1 || t < 1 ){
            throw new  IllegalArgumentException("Illegal Exception");
        }
        this.area = (a+b)*t/2;
    }

    public double getTrapezoid(){
        return this.area;
    }

    @Override
    public void run(){
        System.out.println("Program dimulai");
        for(int i=3; i>0; i--){
            try{
                System.out.println(i);
                Thread.sleep(1000);
            } catch(InterruptedException e){
                System.out.println("Pesan Error");
            }
        }
        System.out.println("Program Di Mulai");
    }


}