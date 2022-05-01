public class CoinSimulation {
    public static void main(String[] args) {
        //This program simulates the tossing of a coin using Java Random method
        // Done for basic college assignment
        int headCount = 0;
        int tailCount = 0;
        for (int i = 0; i < 100; i++) {
            if (Math.random() < 0.5) {
                headCount++;
            } else {
                tailCount++;
            }
        }
        System.out.println("Total number of Heads : " + headCount);
        System.out.println("Total number of Tails : " + tailCount);
    }
}
