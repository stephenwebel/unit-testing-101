package com.galatea.models;

/**
 * Created by stephenwebel1 on 9/28/16.
 */
public class TradeMutator {

    public Trade incrementTradeQty(Trade initialTrade, double incrementalQty){
        double qty = initialTrade.getQty();
        Side side = initialTrade.getSideMark();
        String securityId = initialTrade.getSecurityId();
        String clientId = initialTrade.getClientId();

        return new Trade(qty+incrementalQty,side,securityId,clientId);
    }

}
