package com.binance.api.client.domain.account;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FutureAccountBalance {

	@JsonProperty("accountAlias")
	private String accountAlias;

	@JsonProperty("maxWithdrawAmount")
	private String maxWithdrawAmount;

	@JsonProperty("balance")
	private String balance;

	@JsonProperty("crossWalletBalance")
	private String crossWalletBalance;

	@JsonProperty("crossUnPnl")
	private String crossUnPnl;

	@JsonProperty("updateTime")
	private Long updateTime;

	@JsonProperty("asset")
	private String asset;

	@JsonProperty("marginAvailable")
	private boolean marginAvailable;

	@JsonProperty("availableBalance")
	private String availableBalance;

	public void setAccountAlias(String accountAlias){
		this.accountAlias = accountAlias;
	}

	public String getAccountAlias(){
		return accountAlias;
	}

	public void setMaxWithdrawAmount(String maxWithdrawAmount){
		this.maxWithdrawAmount = maxWithdrawAmount;
	}

	public String getMaxWithdrawAmount(){
		return maxWithdrawAmount;
	}

	public void setBalance(String balance){
		this.balance = balance;
	}

	public String getBalance(){
		return balance;
	}

	public void setCrossWalletBalance(String crossWalletBalance){
		this.crossWalletBalance = crossWalletBalance;
	}

	public String getCrossWalletBalance(){
		return crossWalletBalance;
	}

	public void setCrossUnPnl(String crossUnPnl){
		this.crossUnPnl = crossUnPnl;
	}

	public String getCrossUnPnl(){
		return crossUnPnl;
	}

	public void setUpdateTime(Long updateTime){
		this.updateTime = updateTime;
	}

	public Long getUpdateTime(){
		return updateTime;
	}

	public void setAsset(String asset){
		this.asset = asset;
	}

	public String getAsset(){
		return asset;
	}

	public void setMarginAvailable(boolean marginAvailable){
		this.marginAvailable = marginAvailable;
	}

	public boolean isMarginAvailable(){
		return marginAvailable;
	}

	public void setAvailableBalance(String availableBalance){
		this.availableBalance = availableBalance;
	}

	public String getAvailableBalance(){
		return availableBalance;
	}

	@Override
 	public String toString(){
		return 
			"AccountBalance{" + 
			"accountAlias = '" + accountAlias + '\'' + 
			",maxWithdrawAmount = '" + maxWithdrawAmount + '\'' + 
			",balance = '" + balance + '\'' + 
			",crossWalletBalance = '" + crossWalletBalance + '\'' + 
			",crossUnPnl = '" + crossUnPnl + '\'' + 
			",updateTime = '" + updateTime + '\'' + 
			",asset = '" + asset + '\'' + 
			",marginAvailable = '" + marginAvailable + '\'' + 
			",availableBalance = '" + availableBalance + '\'' + 
			"}";
		}
}