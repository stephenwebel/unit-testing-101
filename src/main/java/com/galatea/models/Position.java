package com.galatea.models;

/**
 * Created by stephenwebel1 on 9/28/16.
 */
public class Position {
    private final double qty;
    private final String securityId;
    private final String clientId;


    public Position(double qty, String securityId, String clientId) {
        this.qty = qty;
        this.securityId = securityId;
        this.clientId = clientId;
    }
}
