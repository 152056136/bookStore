package com.nsc.backend.entity;

import java.util.Date;

/**
 * Book实体类
 * @author Lenovo
 *
 */
public class Book {
	
		//基本属性
		private Integer bookId;
		private String bookISBN;
		private String bookName;
		private Double bookUnitPrice;
		private String bookPreface;
		private	String bookConBrief;
		private String bookAuthorBrief;
		private String bookCatalog;
		private String bookAuthor;
		private String bookPress;
		private Date bookPubTime;
		private Date bookPriTime;
		private String bookEdition;
		private String bookImpression;
		private String bookPaper;
		private String bookPacking;
		private String bookSuit;
		private String bookImgUrl;
		private Integer bookStock;
		private Date  bookValidityPeriod;
		private Double bookOriginalPrice;
		private Double bookDiscount;
		//关联外键属性,一本书根据之前的数据，设计两个外键,可以直接关联一级也可以关联二级分类
		private  Category category;
		private  SecondCategory  secondCate;
		private	 ThirdCategory	thirdCate;
		//关联供应商
		private	Distributor distributor;
		
		
		public Distributor getDistributor() {
			return distributor;
		}
		public void setDistributor(Distributor distributor) {
			this.distributor = distributor;
		}
		public Integer getBookId() {
			return bookId;
		}
		public void setBookId(Integer bookId) {
			this.bookId = bookId;
		}
		public String getBookISBN() {
			return bookISBN;
		}
		public void setBookISBN(String bookISBN) {
			this.bookISBN = bookISBN;
		}
		public String getBookName() {
			return bookName;
		}
		public void setBookName(String bookName) {
			this.bookName = bookName;
		}
		public Double getBookUnitPrice() {
			return bookUnitPrice;
		}
		public void setBookUnitPrice(Double bookUnitPrice) {
			this.bookUnitPrice = bookUnitPrice;
		}
		public String getBookPreface() {
			return bookPreface;
		}
		public void setBookPreface(String bookPreface) {
			this.bookPreface = bookPreface;
		}
		public String getBookConBrief() {
			return bookConBrief;
		}
		public void setBookConBrief(String bookConBrief) {
			this.bookConBrief = bookConBrief;
		}
		public String getBookAuthorBrief() {
			return bookAuthorBrief;
		}
		public void setBookAuthorBrief(String bookAuthorBrief) {
			this.bookAuthorBrief = bookAuthorBrief;
		}
		public String getBookCatalog() {
			return bookCatalog;
		}
		public void setBookCatalog(String bookCatalog) {
			this.bookCatalog = bookCatalog;
		}
		public String getBookAuthor() {
			return bookAuthor;
		}
		public void setBookAuthor(String bookAuthor) {
			this.bookAuthor = bookAuthor;
		}
		public String getBookPress() {
			return bookPress;
		}
		public void setBookPress(String bookPress) {
			this.bookPress = bookPress;
		}
		public Date getBookPubTime() {
			return bookPubTime;
		}
		public void setBookPubTime(Date bookPubTime) {
			this.bookPubTime = bookPubTime;
		}
		public Date getBookPriTime() {
			return bookPriTime;
		}
		public void setBookPriTime(Date bookPriTime) {
			this.bookPriTime = bookPriTime;
		}
		public String getBookEdition() {
			return bookEdition;
		}
		public void setBookEdition(String bookEdition) {
			this.bookEdition = bookEdition;
		}
		public String getBookImpression() {
			return bookImpression;
		}
		public void setBookImpression(String bookImpression) {
			this.bookImpression = bookImpression;
		}
		public String getBookPaper() {
			return bookPaper;
		}
		public void setBookPaper(String bookPaper) {
			this.bookPaper = bookPaper;
		}
		public String getBookPacking() {
			return bookPacking;
		}
		public void setBookPacking(String bookPacking) {
			this.bookPacking = bookPacking;
		}
		public String getBookSuit() {
			return bookSuit;
		}
		public void setBookSuit(String bookSuit) {
			this.bookSuit = bookSuit;
		}
		public String getBookImgUrl() {
			return bookImgUrl;
		}
		public void setBookImgUrl(String bookImgUrl) {
			this.bookImgUrl = bookImgUrl;
		}
		public Integer getBookStock() {
			return bookStock;
		}
		public void setBookStock(Integer bookStock) {
			this.bookStock = bookStock;
		}
		public Date getBookValidityPeriod() {
			return bookValidityPeriod;
		}
		public void setBookValidityPeriod(Date bookValidityPeriod) {
			this.bookValidityPeriod = bookValidityPeriod;
		}
		public Double getBookOriginalPrice() {
			return bookOriginalPrice;
		}
		public void setBookOriginalPrice(Double bookOriginalPrice) {
			this.bookOriginalPrice = bookOriginalPrice;
		}
		public Double getBookDiscount() {
			return bookDiscount;
		}
		public void setBookDiscount(Double bookDiscount) {
			this.bookDiscount = bookDiscount;
		}
		public Category getCategory() {
			return category;
		}
		public void setCategory(Category category) {
			this.category = category;
		}
		public SecondCategory getSecondCate() {
			return secondCate;
		}
		public void setSecondCate(SecondCategory secondCate) {
			this.secondCate = secondCate;
		}
		public ThirdCategory getThirdCate() {
			return thirdCate;
		}
		public void setThirdCate(ThirdCategory thirdCate) {
			this.thirdCate = thirdCate;
		}
		
		
		
		
		
	
	
}
