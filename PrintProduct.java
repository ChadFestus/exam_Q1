public class PrintProduct {
    private final IProduct product;
    private final int year;

    public PrintProduct(IProduct product, int year) {
        this.product = product;
        this.year = year;
    }

    public void PrintTotal() {
        System.out.println("TOTAL PRODUCT SALES: " + product.GetTotalProductsSold());
    }

    public void PrintAverage() {
        System.out.println("AVERAGE PRODUCT SALES: " + (int) Math.round(product.GetAverageProductsSold()));
    }

    public void PrintMostPopular() {
        System.out.println("MOST POPULAR PRODUCT: " + product.GetMostPopularProduct());
    }

    public void PrintReport() {
        System.out.println("PRODUCT SALES REPORT - " + year);
        System.out.println("*".repeat(60));
        PrintTotal();
        PrintAverage();
        PrintMostPopular();
    }
}
