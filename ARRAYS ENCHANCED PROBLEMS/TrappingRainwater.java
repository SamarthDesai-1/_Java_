public class TrappingRainwater {

    public static void main(String[] args) {
        int[] height = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trapedWater(height));
       
    }

    private static int trapedWater(int[] height) {
        int[] maxLEFT = new int[height.length];
        maxLEFT[0] = height[0];
        for (int i = 1; i < maxLEFT.length; i++) {
            maxLEFT[i] = Math.max(height[i], maxLEFT[i - 1]);
        }

        int[] maxRIGHT = new int[height.length];
        maxRIGHT[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            maxRIGHT[i] = Math.max(height[i], maxRIGHT[i + 1]);
        }

        int trapWater = 0;
        for (int i = 0; i < height.length; i++) {
            int waterLevel = Math.min(maxLEFT[i] ,maxRIGHT[i]);
            trapWater += (waterLevel - height[i]);
        }


        return trapWater;

    }

   

}
