package com.galatea.b.poorly_designed;

import com.galatea.models.Trade;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * This class reads trades
 * <p>
 * Created by stephenwebel1 on 10/16/16.
 */
public class TradeReader {

    private final String pathToTrades;
    private final File tradeFile;
    private final FileReader tradeFileReader;

    public TradeReader(String pathToTrades) {
        FileReader tradeFileReader1;

        this.pathToTrades = pathToTrades;
        this.tradeFile = new File(pathToTrades);
        try {
            tradeFileReader1 = new FileReader(tradeFile);
        } catch (FileNotFoundException e) {
            tradeFileReader1 = null;
            e.printStackTrace();
        }

        this.tradeFileReader = tradeFileReader1;
    }

    public Collection<Trade> getTrades() {
        BufferedReader fileBufferedReader = new BufferedReader(tradeFileReader);

        Collection<Trade> trades = new ArrayList<>();
        fileBufferedReader.lines().forEach(tradeJson -> {

        });
        return trades;
    }
}
