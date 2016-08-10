/**
 * Created by lindseyringwald on 8/8/16.
 */
public class Inventory throws Exception {
    String name;
    int quantity;
    String category;


    public static Category createItem(String itemType) {
        switch(category):
            case "Fruit":
                return ("pineapple", 1, "Fruit");
                break;
            case "Vegetables":
                return ("artichoke", 1, "Vegetables");
                break;
            case "Starch":
                return ("potatoes", 1, "Starch");
                break;
             case "Wine":
                return ("merlot", 1, "Wine");
               break;
            case "Meat":
                return ("steak", 1, "Meat");
                break;
             default:
                throw new Exception("This is not a valid character type");
                break;
        }

    }



