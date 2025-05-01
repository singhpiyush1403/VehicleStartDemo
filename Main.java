class bike{
  void start(){
  System.out.println(" start with kick");
}
}
class car extends bike{
  void start(){
  System.out.println(" start with key");
}
}

public class main{
public static void main(String args[]){
  bike mybike = new bike();
  mybike.start();
  
  car mycar = new car();
  mycar.start();
}
}