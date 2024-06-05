public class Calculator3 {
    public double tax = .05;
    public double tip = .15;
    
    public void findTotal(double price){
        double total = 10*(1+tax+tip);
        System.out.println("$" +total);

    }
}
class Calculator {
    void findTotal(int i) {
}
}