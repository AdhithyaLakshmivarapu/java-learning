/* PS: Write a class Temperature that stores temperature in Celsius as a private field.
 Provide a setter that prevents temperatures below -273°C (absolute zero) 
 and a getter that returns the temperature in Celsius. 
 Add a bonus getter that converts and returns the temperature in Fahrenheit.*/
package OOPS.Encapsulation.Basics;

public class Temperature {
    private double temperature;
    public void setTemperature(double temperature ){
        if (temperature>=-273) {
            this.temperature=temperature;
        }
        else{
            System.out.println("Invalid Temperature");
        }
    }
    
    public double getTemperature(){
        return temperature;
    }
    public double getFtemp() {
        return (temperature* 9/5)+32;
    }
}
class Test1{
    public static void main(String[] args) {
        Temperature t1 = new Temperature();
        t1.setTemperature(600);
        System.out.println(t1.getTemperature());
        System.out.println(t1.getFtemp());
    }
}
