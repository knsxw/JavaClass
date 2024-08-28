public class Mortorcycle extends Vehicle{
    private boolean hasSidecar;

    public Mortorcycle(String brand, String model,Boolean hasSidecar){
        super(brand, model);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void displayInfo() {
        System.out.println("***Mortorcycle***");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        if(hasSidecar){
            System.out.println("It has Sidecar");
        } else {
            System.out.println("It has no Sidecar");
        }
    }
}
