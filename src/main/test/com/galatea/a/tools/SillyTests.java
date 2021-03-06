package com.galatea.a.tools;

import org.junit.Assert;
import org.junit.Test;
import com.galatea.models.Position;
import com.galatea.models.Side;
import com.galatea.models.Trade;
import com.galatea.models.TradeMutator;

/**
 * Get all the tests to pass
 *
 * Created by stephenwebel1 on 9/28/16.
 */
public class SillyTests {


    @Test
    public void assertingTrue(){
        Assert.assertTrue("Why won't this pass?!?!", false);
    }

    @Test
    public void assertingEquals(){
        String expectedString = "the world";
        String actualString = "The world";

        Assert.assertEquals(expectedString,actualString);
    }

    @Test
    public void assertingEqualPositions(){
        Position expectedPosition = new Position(123.0,"IBM","webz123");
        Position actualPosition = new Position(123.0,"IBM","webz123");

        Assert.assertEquals("These objects should be equal... what happened?",expectedPosition,actualPosition);
    }

    @Test
    public void assertingNotEqualTrades(){
        TradeMutator tradeMutator = new TradeMutator();

        Trade initialTrade = new Trade(123.0, Side.LONG, "IBM","webz123");
        Trade mutatedTrade = tradeMutator.incrementTradeQty(initialTrade,100);

        Assert.assertNotEquals("Wait.. wut?!?! The updated trade is still equal?",initialTrade,mutatedTrade);
    }
}