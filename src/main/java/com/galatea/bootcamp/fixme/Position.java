package com.galatea.bootcamp.fixme;

/**
 * Created by stephenwebel1 on 9/28/16.
 */
class Position {
    private final double qty;
    private final String securityId;
    private final String clientId;


    Position(double qty, String securityId, String clientId) {
        this.qty = qty;
        this.securityId = securityId;
        this.clientId = clientId;
    }
}
