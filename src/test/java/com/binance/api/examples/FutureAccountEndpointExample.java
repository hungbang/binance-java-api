package com.binance.api.examples;

import com.binance.api.client.BinanceApiClientFactory;
import com.binance.api.client.BinanceApiFutureRestClient;
import com.binance.api.client.domain.account.FutureAccountBalance;

public class FutureAccountEndpointExample {


    public static void main(String[] args) {
        BinanceApiClientFactory factory = BinanceApiClientFactory.newInstance(
                "YOUR_API_KEY", "YOUR_SECRET", true, false, true);
        BinanceApiFutureRestClient client = factory.newFuturesRestClient();

        // Get account balances
        FutureAccountBalance futureAccountBalance = client.getFutureAccountBalance();
        System.out.println(futureAccountBalance.getAccountAlias());
        System.out.println(futureAccountBalance.getAsset());
        System.out.println(futureAccountBalance.getBalance());
    }
}


