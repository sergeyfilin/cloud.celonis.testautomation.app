package cloud.celonis.testautomation.app.testdata;

public enum Workspace {
    ORDER_TO_CASH("Order to Cash"),
    PURCHASE_TO_PAY("Purchase to Pay "),
    SERVICE_NOW("ServiceNow");

    private String space;

    Workspace(String space) {
        this.space = space;
    }

    public String getSpace() {
        return space;
    }
}
