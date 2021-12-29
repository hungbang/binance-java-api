package com.binance.api.examples;

import com.binance.api.client.BinanceApiClientFactory;
import com.binance.api.client.BinanceApiFutureRestClient;
import com.binance.api.client.domain.account.FutureAccountBalance;

import java.util.List;

public class FutureAccountEndpointExample {


    public static void main(String[] args) {
        BinanceApiClientFactory factory = BinanceApiClientFactory.newInstance(
                "a110d50a1a739e457677725d5d8dd45f98d43d9fa113e5885fa9e709ef4ffaa9",
                "a3b4d53b53d1acc888381c10f0697ae3d19fe80ae2d6a2e9f52168724a38fe59", true, false, true);
        BinanceApiFutureRestClient client = factory.newFuturesRestClient();

        // Get account balances
        List<FutureAccountBalance> futureAccountBalance = client.getFutureAccountBalance(100000000L);
        System.out.println(futureAccountBalance.get(0).getAccountAlias());
        System.out.println(futureAccountBalance.get(0).getAsset());
        System.out.println(futureAccountBalance.get(0).getBalance());
    }
}


