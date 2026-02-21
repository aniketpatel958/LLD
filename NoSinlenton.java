public class NoSinlenton{
     public NoSinlenton(){
        System.out.println("Singleton Constructor called. New Object created.");
     }

     public static void main(String[] args){
        NoSinlenton s1 = new NoSinlenton();
        NoSinlenton s2 = new NoSinlenton();

        System.out.println(s1==s2);
     }
}