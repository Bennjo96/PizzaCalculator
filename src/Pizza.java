import java.util.HashMap;

public class Pizza {
    String name;
    int sliceCount;

    public static HashMap<String,Pizza> pizzas= new HashMap<String,Pizza>();
    public Pizza (String name){
        this.name= name;
        sliceCount= 0;

        pizzas.put(name,this);
    }
}
