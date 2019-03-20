package com.upcard.object;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 重叠构造器,
 * 提供必要的参数列表，然后依次添加非必要参数，直到最后一个构造器包含所有的参数
 * 但是当参数列表过多时难以阅读，需要为一些不想设值的参数进行设值
 * 调用者无法区分，如果参数位置写错，无法分辨;
 * <p> 解决办法，build模式
 * 多参数的类，尤其是大部分参数是可选的参数时候，设计时尽量使用build模式
 * @author chenliang
 *
 */
public class OverlapConstructor {

	public static void main(String[] args) {
		String cardNo = "2336000568";
		Date expireDate = new Date();
		//静态工厂模式
		BigDecimal denomination = BigDecimal.valueOf(1L);
		BigDecimal balanceAmount = BigDecimal.valueOf(255155, 2);
		Card card = new Card(cardNo, expireDate, denomination, balanceAmount);
		String cardName = "端午美食卡";
		Date activeDate = new Date();
		//如果只是需要一个激活时间，那么还要为卡名称多赋值
		card = new Card(cardNo, expireDate, denomination, balanceAmount, cardName, activeDate);
		System.out.println(card.toString());
		/* 构造模式 */
		//如果是只需要激活时间
		CardBuild cardBuild = new CardBuild.Build(cardNo, expireDate, denomination, balanceAmount).activeDate(activeDate).build();
		System.out.println(cardBuild.toString());
		
	}
}

class CardBuild {
	private String cardNo;//required
	private Date expireDate;//required
	private BigDecimal denomination;//required
	private BigDecimal balanceAmount;//required
	
	private String cardName;//optional
	private Date activeDate;//optional
	private String imgUrl;//optional
	private int color;//optional
	private String issuer;//optional
	
	public static class Build {
		private String cardNo;//required
		private Date expireDate;//required
		private BigDecimal denomination;//required
		private BigDecimal balanceAmount;//required
		
		//optional param set default value
		private String cardName = null;//optional
		private Date activeDate = new Date();//optional
		private String imgUrl = null;//optional
		private int color = 0;//optional
		private String issuer = null;//optional
		public Build(String cardNo, Date expireDate, BigDecimal denomination, BigDecimal balanceAmount) {
			super();
			this.cardNo = cardNo;
			this.expireDate = expireDate;
			this.denomination = denomination;
			this.balanceAmount = balanceAmount;
		}
		public Build cardName(String cardName) {
			this.cardName = cardName;
			return this;
		}
		public Build activeDate(Date activeDate) {
			this.activeDate = activeDate;
			return this;
		}
		public Build imgUrl(String imgUrl) {
			this.imgUrl = imgUrl;
			return this;
		}
		public Build color(int color) {
			this.color = color;
			return this;
		}
		public Build issuer(String issuer) {
			this.issuer = issuer;
			return this;
		}
		
		public CardBuild build() {
			return new CardBuild(this);
		}
	}
	private CardBuild (Build build) {
		this.cardNo = build.cardNo;
		this.expireDate = build.expireDate;
		this.denomination = build.denomination;
		this.balanceAmount = build.balanceAmount;
		this.cardName = build.cardName;
		this.activeDate = build.activeDate;
		this.imgUrl = build.imgUrl;
		this.color = build.color;
		this.issuer = build.issuer;
	}

	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public Date getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	public BigDecimal getDenomination() {
		return denomination;
	}
	public void setDenomination(BigDecimal denomination) {
		this.denomination = denomination;
	}
	public BigDecimal getBalanceAmount() {
		return balanceAmount;
	}
	public void setBalanceAmount(BigDecimal balanceAmount) {
		this.balanceAmount = balanceAmount;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public Date getActiveDate() {
		return activeDate;
	}
	public void setActiveDate(Date activeDate) {
		this.activeDate = activeDate;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	public String getIssuer() {
		return issuer;
	}
	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	@Override
	public String toString() {
		return "CardBuild [cardNo=" + cardNo + ", expireDate=" + expireDate + ", denomination=" + denomination
				+ ", balanceAmount=" + balanceAmount + ", cardName=" + cardName + ", activeDate=" + activeDate
				+ ", imgUrl=" + imgUrl + ", color=" + color + ", issuer=" + issuer + "]";
	}
	
}




class Card {
	private String cardNo;//required
	private Date expireDate;//required
	private BigDecimal denomination;//required
	private BigDecimal balanceAmount;//required
	private String cardName;//optional
	private Date activeDate;//optional
	private String imgUrl;//optional
	private int color;//optional
	private String issuer;//optional
	//等等 telescoping constructor
	
	public Card(String cardNo, Date expireDate, BigDecimal denomination, BigDecimal balanceAmount) {
		this(cardNo, expireDate, denomination, balanceAmount, null, null, null, 0, null);
	}
	
	public Card(String cardNo, Date expireDate, BigDecimal denomination, BigDecimal balanceAmount, String cardName) {
		this(cardNo, expireDate, denomination, balanceAmount, cardName, null, null, 0, null);
	}
	
	public Card(String cardNo, Date expireDate, BigDecimal denomination, BigDecimal balanceAmount, String cardName,
			Date activeDate) {
		this(cardNo, expireDate, denomination, balanceAmount, cardName, activeDate, null, 0, null);
	}
	
	public Card(String cardNo, Date expireDate, BigDecimal denomination, BigDecimal balanceAmount, String cardName,
			Date activeDate, String imgUrl) {
		this(cardNo, expireDate, denomination, balanceAmount, cardName, activeDate, imgUrl, 0, null);
	}
	
	public Card(String cardNo, Date expireDate, BigDecimal denomination, BigDecimal balanceAmount, String cardName,
			Date activeDate, String imgUrl, int color) {
		this(cardNo, expireDate, denomination, balanceAmount, cardName, activeDate, imgUrl, color, null);
	}
	
	public Card(String cardNo, Date expireDate, BigDecimal denomination, BigDecimal balanceAmount, String cardName,
			Date activeDate, String imgUrl, int color, String issuer) {
		super();
		this.cardNo = cardNo;
		this.expireDate = expireDate;
		this.denomination = denomination;
		this.balanceAmount = balanceAmount;
		this.cardName = cardName;
		this.activeDate = activeDate;
		this.imgUrl = imgUrl;
		this.color = color;
		this.issuer = issuer;
	}
	
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public Date getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	public BigDecimal getDenomination() {
		return denomination;
	}
	public void setDenomination(BigDecimal denomination) {
		this.denomination = denomination;
	}
	public BigDecimal getBalanceAmount() {
		return balanceAmount;
	}
	public void setBalanceAmount(BigDecimal balanceAmount) {
		this.balanceAmount = balanceAmount;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public Date getActiveDate() {
		return activeDate;
	}
	public void setActiveDate(Date activeDate) {
		this.activeDate = activeDate;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}
	public String getIssuer() {
		return issuer;
	}
	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	@Override
	public String toString() {
		return "Card [cardNo=" + cardNo + ", expireDate=" + expireDate + ", denomination=" + denomination
				+ ", balanceAmount=" + balanceAmount + ", cardName=" + cardName + ", activeDate=" + activeDate
				+ ", imgUrl=" + imgUrl + ", color=" + color + ", issuer=" + issuer + "]";
	}
	
}
