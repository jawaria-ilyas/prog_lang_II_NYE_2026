package prog_lang_II_NYE_2026;

 class car {
   private String brand;
   private int year;
   private String model;
   public car (String brand,int year,String model) {
      this.brand = brand;
      this.year = year;
      this.model = model;
   }
public void displayinfo(){
    System.out.println("brand: " + brand);
    System.out.println("year: " + year);
    System.out.println("model: " + model);
}
public void startengine(){
    System.out.println("the car is starting");
}
public void stopengine(){
    System.out.println("the car is stopping");
}
}
 class student{
    private String name;
    private double[]grades;
    public student(String name,double[]grades){
        this.name=name;
        this.grades=grades;

    }
    public double calculateaverage(){
        double sum=0.0;
        for (int i=0;i<grades.length;i++){
            sum+=grades[i];
        }
        return sum/grades.length;
        
    }
public void displayinfo(){
    System.out.println("name: " + name);
    System.out.println("average grade: " + calculateaverage());

}
}
public class week3 {
public static void main (String[] args){
    car Car= new car ("merecedes Benz",2026,"s-class");
    Car.displayinfo();
    Car.startengine();
    Car.stopengine();
 student Student= new student ("Jawaria",new double[]{85.5,90.0,78.0});
    Student.displayinfo();
}
}