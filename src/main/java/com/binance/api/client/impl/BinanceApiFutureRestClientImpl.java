package com.binance.api.client.impl;

import com.binance.api.client.BinanceApiFutureRestClient;
import com.binance.api.client.domain.account.FutureAccountBalance;
import com.binance.api.client.domain.general.ServerTime;

import static com.binance.api.client.impl.BinanceApiServiceGenerator.createService;
import static com.binance.api.client.impl.BinanceApiServiceGenerator.executeSync;

public class BinanceApiFutureRestClientImpl implements BinanceApiFutureRestClient {
    private final BinanceFutureApiService binanceFutureApiService;

    public BinanceApiFutureRestClientImpl(String apiKey, String secret) {
        binanceFutureApiService = createService(BinanceFutureApiService.class, apiKey, secret);
    }

    @Override
    public FutureAccountBalance getFutureAccountBalance() {
        long timestamp = System.currentTimeMillis();
        ServerTime systemTime = executeSync(binanceFutureApiService.getServerTime());
        return executeSync(binanceFutureApiService.getFutureAccountBalance(systemTime.getServerTime()));
    }
}
