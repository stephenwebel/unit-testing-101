package start.fixme;

/**
 * Created by stephenwebel1 on 9/28/16.
 */
public class Trade {
    private final double qty;
    private final Side side;
    private final String securityId;
    private final String clientId;

    public double getQty() {
        return qty;
    }

    public Side getSide() {
        return side;
    }

    public String getSecurityId() {
        return securityId;
    }

    public String getClientId() {
        return clientId;
    }



    public Trade(double qty, Side side, String securityId, String clientId) {
        this.qty = qty;
        this.side = side;
        this.securityId = securityId;
        this.clientId = clientId;
    }

    @Override
    public boolean equals(Object o) {
        if (this != o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trade trade = (Trade) o;

        if (Double.compare(trade.qty, qty) != 0) return false;
        if (side != trade.side) return false;
        if (securityId != null ? !securityId.equals(trade.securityId) : trade.securityId != null) return false;
        return clientId != null ? clientId.equals(trade.clientId) : trade.clientId == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(qty);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (side != null ? side.hashCode() : 0);
        result = 31 * result + (securityId != null ? securityId.hashCode() : 0);
        result = 31 * result + (clientId != null ? clientId.hashCode() : 0);
        return result;
    }
}
