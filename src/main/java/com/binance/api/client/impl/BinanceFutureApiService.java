package com.binance.api.client.impl;

import com.binance.api.client.constant.BinanceApiConstants;
import com.binance.api.client.domain.OrderSide;
import com.binance.api.client.domain.OrderType;
import com.binance.api.client.domain.SwapRemoveType;
import com.binance.api.client.domain.TimeInForce;
import com.binance.api.client.domain.account.*;
import com.binance.api.client.domain.account.request.CancelOrderListResponse;
import com.binance.api.client.domain.account.request.CancelOrderResponse;
import com.binance.api.client.domain.event.ListenKey;
import com.binance.api.client.domain.general.Asset;
import com.binance.api.client.domain.general.ExchangeInfo;
import com.binance.api.client.domain.general.ServerTime;
import com.binance.api.client.domain.market.*;
import retrofit2.Call;
import retrofit2.http.*;

import java.util.List;

/**
 * Binance's REST API URL mappings and endpoint security configuration.
 */
public interface BinanceFutureApiService {

    // General endpoints

    @GET("/fapi/v1/ping")
    Call<Void> ping();

    @GET("/fapi/v1/time")
    Call<ServerTime> getServerTime();

    @GET("/fapi/v3/exchangeInfo")
    Call<ExchangeInfo> getExchangeInfo();

    // Future APIs
    @Headers({BinanceApiConstants.ENDPOINT_SECURITY_TYPE_APIKEY_HEADER, BinanceApiConstants.ENDPOINT_SECURITY_TYPE_SIGNED_HEADER})
    @GET("/fapi/v2/balance")
    Call<List<FutureAccountBalance>> getFutureAccountBalance(
            @Query("timestamp") Long timestamp, @Query("recvWindow") Long recvWindow);

}
