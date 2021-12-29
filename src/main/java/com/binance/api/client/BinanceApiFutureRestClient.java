package com.binance.api.client;

import com.binance.api.client.domain.account.FutureAccountBalance;

public interface BinanceApiFutureRestClient {
    /**
     * Get current future account balance information using default parameters.
     */
    FutureAccountBalance getFutureAccountBalance();



}
