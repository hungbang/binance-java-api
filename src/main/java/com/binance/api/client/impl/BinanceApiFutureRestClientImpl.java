package com.binance.api.client.impl;

import com.binance.api.client.BinanceApiFutureRestClient;
import com.binance.api.client.domain.account.FutureAccountBalance;

import java.util.List;

import static com.binance.api.client.impl.BinanceApiServiceGenerator.createService;
import static com.binance.api.client.impl.BinanceApiServiceGenerator.executeSync;

public class BinanceApiFutureRestClientImpl implements BinanceApiFutureRestClient {
    private final BinanceFutureApiService binanceFutureApiService;

    public BinanceApiFutureRestClientImpl(String apiKey, String secret) {
        binanceFutureApiService = createService(BinanceFutureApiService.class, apiKey, secret);
    }

    @Override
    public List<FutureAccountBalance> getFutureAccountBalance(Long recvWindow) {
        long timestamp = System.currentTimeMillis();
        return executeSync(binanceFutureApiService.getFutureAccountBalance(timestamp, recvWindow));
    }
}
