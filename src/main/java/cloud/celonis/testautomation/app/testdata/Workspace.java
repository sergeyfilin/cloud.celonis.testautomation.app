package cloud.celonis.testautomation.app.testdata;

public enum Workspace {
    ORDER_TO_CASH("SAP ECC - Order to Cash"),
    PURCHASE_TO_PAY("SAP ECC - Purchase to Pay "),
    TICKETING("ServiceNow Ticketing");

    private String space;

    Workspace(String space) {
        this.space = space;
    }

    public String getSpace() {
        return space;
    }
}
