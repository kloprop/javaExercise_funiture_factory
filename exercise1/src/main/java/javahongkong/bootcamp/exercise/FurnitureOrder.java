package javahongkong.bootcamp.exercise;

import java.util.HashMap;

public class FurnitureOrder implements FurnitureOrderInterface {
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
    HashMap<Furniture, Integer> ordersOfFurnitures;

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        this.ordersOfFurnitures = new HashMap<>();
    }

    public void addToOrder(final Furniture type, final int furnitureCount) {
        this.ordersOfFurnitures.put(type,furnitureCount);
    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        return this.ordersOfFurnitures;
    }

    public float getTotalOrderCost() {
        /* float total = 0;
        for (var entry : this.ordersOfFurnitures.entrySet()){
            Furniture item  = entry.getKey();
            int quantities = entry.getValue();
            total += item.cost() * quantities;
           
            
        }
        return total; */
        return this.ordersOfFurnitures.entrySet().stream()//
                                                .map(entry -> entry.getKey().cost()*entry.getValue())//
                                                .reduce(0.0f, (sub,element) -> sub+element);

                                                
    }

    public int getTypeCount(Furniture type) {
        return this.ordersOfFurnitures.getOrDefault(type,0);
    }

    public float getTypeCost(Furniture type) {
         return this.getTypeCount(type) * type.cost();
    }

    public int getTotalOrderQuantity() {
        /* int count = 0;
        for (int quantity : this.ordersOfFurnitures.values()){
            count += quantity;
        }
        return count; */
        return this.ordersOfFurnitures.entrySet().stream()//
                                                .mapToInt(entry ->entry.getValue())//
                                                .sum();
    }
}