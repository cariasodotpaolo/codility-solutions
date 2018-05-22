package future.skill;

public class BuyAndSellStock {

    private static int[] prices;
    private int sellDay = -1;
    private int buyDay = -1;

    public int getTotalDays() {
        return prices.length;
    }

    public int getPriceOnDay(int day) {

        return prices[day];
    }

    public BuyAndSellStock(int[] prices) {
        this.prices = prices;
        getOptimalBuyOrSellDay();
    }

    private void getOptimalBuyOrSellDay() {

        int totalDays = getTotalDays();
        int largestVariance = 0;

        for (int b = 0; b < totalDays; b++) {

            int priceOnCurrentDay = getPriceOnDay(b);

            for (int s = b + 1; s < totalDays; s++) {

                int futureDayPrice = getPriceOnDay(s);

                if (priceOnCurrentDay < futureDayPrice) {

                    int variance = futureDayPrice - priceOnCurrentDay;

                    if (variance > largestVariance) {
                        largestVariance = variance;
                        buyDay = b;
                        sellDay = s;
                    }
                }
            }
        }
    }

    public int getBuyDay() {

        return buyDay;
    }

    public int getSellDay() {

        return sellDay;
    }

    //This is used for running test only
    public static void main(String[] args) {

        int[] prices  = {7, 9, 4, 5, 14, 12, 1, 5, 12, 8, 12, 9, 10};

        BuyAndSellStock bns = new BuyAndSellStock(prices);
        int buyDay = bns.getBuyDay();
        int sellDay = bns.getSellDay();
        int buyPrice = bns.getPriceOnDay(buyDay);
        int sellPrice = bns.getPriceOnDay(sellDay);
        int profit = sellPrice - buyPrice;

        System.out.println("BUY DAY: " + buyDay + " @ PRICE: " + buyPrice);
        System.out.println("SELL DAY: " + sellDay + " @ PRICE: " + sellPrice);
        System.out.println("MAX PROFIT: " + profit);
    }
}
