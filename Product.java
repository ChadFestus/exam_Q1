
public class Product implements IProduct {
    private final String[] names;   // single-dimensional array
    private final int[][] sales;    // [product][month]
    public Product(String[] names, int[][] sales) {
        this.names = names;
        this.sales = sales;
    }
    public int GetProductTotal(int p) {
        int t = 0;
    }
        for (int s: sales[p]) t += s;
        return t;
    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int p = 0; p < sales.length; p++) total += GetProductTotal(p);
        return total;
    }

    @Override
    public double GetAverageProductSold() {
        int count = 0;
        for (int[] row : sales) count += row.length;
        return count == 0 ? 0 : (double) GetTotalProductsSold() / count;
    }

    @Override
    public String GetMostPopularProduct() {
        int best = 0;
        for (int p = 1; p < sales.length; p++)
            if (GetProductTotal(p) > GetProductTotal(best)) best = p;
        return names[best];
    }
    }
