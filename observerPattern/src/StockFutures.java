public class StockFutures extends AStockPrice {
    public StockFutures(String code) {
        super(code);
    }

    @Override
    protected void notifyHolder() {
        System.out.println("�ڻ�������-" + code + ":" +price);
        for (IStockHolder ish : stockHolderList) {
            ish.update(this);
        }
        price2 = price;
    }
}