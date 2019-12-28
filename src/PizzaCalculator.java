import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

class MamaPizzaCaculator {
    public static void main(String[] args) {

        int pizzaSlice;
        new Pizza("Margaritha");
        new Pizza("Tunna");
        new Pizza("Mozarella");



        String name ="";
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("enter pizza name here");
            name =input.nextLine();

            Pizza pizza = Pizza.pizzas.get(name);
            if (pizza!=null)
            pizza.sliceCount += 4;
        } while ( !"end".equals(name) );

        for (Map.Entry<String, Pizza> pizzaEntry : Pizza.pizzas.entrySet()) {
            Pizza pizza = pizzaEntry.getValue();
            System.out.println(pizza.name + " "+ pizza.sliceCount);
        }

//        Scanner input = new Scanner(System.in);
//        System.out.println("Hi welcome to Mama Pizza:)");
//        System.out.println("How many Slices do you want ? ");
//        System.out.println("enter number of slices you want ");
//
//        pizzaSlice = input.nextInt();
//
//        if (pizzaSlice < 4) {
//            System.out.println(" you receive " + pizzaSlice + " slices ");
//        }
//        if (pizzaSlice == 4) {
//            System.out.println(" you receive 1 " + " pizza ");
//        }
//        if (pizzaSlice == 8) {
//            System.out.println(" you receive 2 " + " pizza " + "which is equal to");
//
//        }
//        if (pizzaSlice == 12) {
//            System.out.println(" you receive 3 " + " pizza ");
//        } else
//            System.out.println(" you receive " + pizzaSlice + " slices ");
    }
}

