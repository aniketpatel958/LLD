interface WalkableRobot{
    void walk();
}

class NormalWalk implements WalkableRobot{
    public void walk(){
        System.out.println("Walk normal");
    }
}

class NoWalk implements WalkableRobot{
    public void walk(){
        System.out.println("No walk");
    }
}


interface FlyRobot{
    void fly();
}

class NormalFly implements FlyRobot{
    public void fly(){
        System.out.println("Normal fly");
    }
}

class NoFly implements FlyRobot{
    public void fly(){
        System.out.println("No fly");
    }
}

//Robot

abstract class Robot{
    protected WalkableRobot walkbe;
   protected FlyRobot flybe;

   public Robot(WalkableRobot w, FlyRobot f){
    this.walkbe = w;
    this.flybe = f;
   }

   public void walk(){
    walkbe.walk();
   }

   public void fly(){
    flybe.fly();
   }

   public abstract void projection();
}


//concrete robot types

class CompanionRobot extends Robot{
    public CompanionRobot(WalkableRobot w , FlyRobot f){
        super(w,f);
    }

    public void projection(){
        System.out.println("frindly companion features");
    }
}

class WorkerRobot extends Robot{
    public WorkerRobot(WalkableRobot w, FlyRobot f){
        super(w,f);
    }

    public void projection(){
        System.out.println("worker efficiency");
    }
}

//main

public class StrategyPattern{
    public static void main(String[] args){
        Robot robot1 = new CompanionRobot(new NormalWalk() , new NoFly());
        robot1.walk();
        robot1.fly();

        robot1.projection();

        System.out.println("--------");

        Robot robot2 = new WorkerRobot(new NoWalk() , new NormalFly());
        robot1.walk();
        robot2.fly();
        robot2.projection();
    }
}