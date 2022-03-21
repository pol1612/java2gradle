package cat.uvic.teknos.m06.java2gradle;

public class App {
    public static int squareArea(int side){
        return side*side;
    }
    public static void main(String[] args){
        var square1= new Square();
        square1.side=10;
        square1.computeArea();
        System.out.println("Square 1  side: " +square1.side+" Square 1 area: "+square1.area());
        
    }
    
}
