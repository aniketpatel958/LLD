interface Burger{
   void prepare();
}

//concrete Burger
class BasicBurger implements Burger{
      @Override
      public void prepare(){
        System.out.println("Preparing Basic  Burger with bun, patty, cheese, and lettuce!");
      }
}

class StandardBurger implements Burger{
    @Override
    public void prepare(){
        System.out.println("Preparing Standard Burger with bun, patty, and ketchup!");
    }
}

//BurgerFactory

class BurgerFactory{
    public Burger CreateBurger(String type){
        if(type.equalsIgnoreCase("basic")){
            return new BasicBurger();
        }
        else if(type.equalsIgnoreCase("standard")){
            return new StandardBurger();
        }
        else{
            System.out.println("invalid");
            return null;
        }
    }
}

//main class

class SimpleFactory{
    public static void main(String[] args){
        String type = "standard";

        BurgerFactory myBurgerFactory = new BurgerFactory();
        Burger burger = myBurgerFactory.CreateBurger(type);

        if(burger != null){
            burger.prepare();
        }
    } 
}