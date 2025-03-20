// Nathan loves cycling.

// Because Nathan knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.

// You get given the time in hours and you need to return the number of litres Nathan will drink, rounded down.


public class keepHydrated{
    public static int keepHydratedMethod(double time){
       return (int)(time * 0.5);
    }

    public static void main(String[] args){
        System.out.println(keepHydratedMethod(11.8));
    }
}