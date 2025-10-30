public class Account {
    public double findPrice(int itemId){
        double price = 0;
        switch (itemId){
            case 1001:
                price = 25;
                break;
            case 1002:
                price = 20;
                break;
            case 1003:
                price = 23;
                break;
            default:
                price = 18;
        }
        return price;
    }
    public double findPrice(String brandName, String itemType, int size){
        double price = 0;
        if(brandName == "Puma"){
            if(itemType == "T-shirt" && (size == 34 || size == 36)) price = 25;
            else price = 20;
        }else{
            if(itemType == "T-shirt" && (size == 34 || size == 36)) price = 23;
            else price = 18;
        }
        return price;
    }
}
class Tester {

    public static void main(String[] args) {

        Bill bill = new Bill();

        double price = bill.findPrice(1001);
        if(price>0)
            System.out.println("Price of the selected item is $"+price);
        else
            System.out.println("The Item Id is invalid");

        price = bill.findPrice("Reebok","T-shirt",34);
        if(price>0)
            System.out.println("Price of the selected item is $"+price);
        else
            System.out.println("The values are not valid");
    }

}

