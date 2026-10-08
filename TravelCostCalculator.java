class TravelCostCalculator {
    public static void calculateTravelCost() {
        double distance = 150.0;
        double fuelEfficiency = 15.0;
        double fuelPrice = 100.0;
        double parkingCost = 200.0;
        double totalTravelCost = ((distance / fuelEfficiency) * fuelPrice) + parkingCost;
        System.out.println("Total Travel Cost: " + totalTravelCost);
    }

    public static void main(String[] args) {
        calculateTravelCost();
    }
}