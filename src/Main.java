public class Main{
    public static void main(String[] args) {
        // Declare and initialize maintenance costs for each season
        double springCost = 200.0;  // Cost for spring
        double summerCost = 300.0;  // Cost for summer
        double fallCost = 250.0;    // Cost for fall
        double winterCost = 350.0;  // Cost for winter

        // Calculate the total yearly maintenance cost
        double totalYearlyCost = springCost + summerCost + fallCost + winterCost;

        // Display the costs for each season and the total yearly maintenance cost
        System.out.println("Maintenance Costs for Each Season:");
        System.out.println("Spring: $" + springCost);
        System.out.println("Summer: $" + summerCost);
        System.out.println("Fall: $" + fallCost);
        System.out.println("Winter: $" + winterCost);
        System.out.println("----------------------------------");
        System.out.println("Total Yearly Maintenance Cost: $" + totalYearlyCost);
    }
}