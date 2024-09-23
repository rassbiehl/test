public class Main {
    public static void main(String[] args) {
        Cupcake chocolateSprinkle = new Cupcake("chocolate", true);

        // Create an object that takes in an object as a parameter
        Bakery myBakery = new Bakery(chocolateSprinkle, 3.25);

        // Output a value of parameter object
        System.out.println("Our object sent as a parameter has a flavor value of "  + myBakery.bakeryCupcake.flavor);

        // Output a value of original object
        System.out.println("Our original object has a flavor value of " + chocolateSprinkle.flavor);
    }
}