package com.galatea;

import com.galatea.models.Position;
import com.galatea.models.Side;
import com.galatea.models.Trade;
import com.galatea.models.TradeMutator;
import org.junit.Assert;
import org.junit.Test;

/**
 * Please ensure all tests are passing
 *
 * Created by stephenwebel1 on 10/15/16.
 */
public class IntroToTesting {


    @Test
    public void assertingTrue(){
        Assert.assertTrue("Why won't this pass?!?!", false);
    }

    @Test
    public void assertingEquals(){
        String expectedString = "the world";
        String actualString = "The world";

        //todo add to readme that this is not right needs comment
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

