package com.binance.api.client;

import com.binance.api.client.domain.account.FutureAccountBalance;

import java.util.List;

public interface BinanceApiFutureRestClient {
    /**
     * Get current future account balance information using default parameters.
     */
    List<FutureAccountBalance> getFutureAccountBalance(Long recvWindow);



}
