package hacker.rank;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BudgetShop {


    static int budgetShopping(int n, int[] bundleQuantities, int[] bundleCosts) {

        int optimalUnitsCount = 0;
        int optimalBundleCount = 0;
        int optimalBundleQuantity = 0;

        int totalUnits = 0;

        int storesCount = bundleQuantities.length;


        System.out.println(storesCount);

        for (int s = 0 ; s < storesCount ; s++ ) {

            int currBundleCount = n / bundleCosts[s];

            int currMaxUnitsCount = currBundleCount * bundleQuantities[s];

            if (s == 0) {
                optimalUnitsCount = currMaxUnitsCount;
                optimalBundleCount = currBundleCount;
                optimalBundleQuantity = bundleQuantities[s];
            }

            if (currMaxUnitsCount > optimalUnitsCount) {
                optimalUnitsCount = currMaxUnitsCount;
                optimalBundleCount = currBundleCount;
                optimalBundleQuantity = bundleQuantities[s];
            }



        }

        totalUnits = optimalBundleCount * optimalBundleQuantity;

        return totalUnits;
    }

    public static void main(String[] args) {

        int[] qtyArr = {20, 19};
        int[] costArr = {24,20};

        System.out.println(BudgetShop.budgetShopping(50, qtyArr , costArr));
    }

}
