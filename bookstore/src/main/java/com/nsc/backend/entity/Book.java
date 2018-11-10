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
		private Date bookPubTime;
		private Date bookPriTime;
		private String bookEdtion;
		private String bookImpression;
		private String bookSize;
		private String bookPaper;
		private String bookPacking;
		private String bookSuit;
		private String bookImgUrl;
		private Integer bookStock;
		private Date  bookValidityPeriod;
		private String bookOriginalPrice;
		private int bookIsDetele;
		private String bookKeyWord1;
		private String bookKeyWord2;
		private String bookSeriesAb;
		private String bookPublicSort;
		private String bookScores;
		private String bookCode;
		private String bookPicture;
		private String bookTitles;
		private String bookMeasurementUnit;
		private String publish_house;
		private Integer bookDiscount;
		private String bookNote;
		private Double orderFreight;
		//关联外键属性,一本书根据之前的数据，设计两个外键,可以直接关联一级也可以关联二级分类
		private  Category category;
		private  SecondCategory  secondCate;
		private	 ThirdCategory	thirdCate;
		//关联供应商
		private	Distributor distributor;
		private Integer storeId; 
		private String storeName;
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
		public String getBookEdtion() {
			return bookEdtion;
		}
		public void setBookEdtion(String bookEdtion) {
			this.bookEdtion = bookEdtion;
		}
		public String getBookImpression() {
			return bookImpression;
		}
		public void setBookImpression(String bookImpression) {
			this.bookImpression = bookImpression;
		}
		public String getBookSize() {
			return bookSize;
		}
		public void setBookSize(String bookSize) {
			this.bookSize = bookSize;
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
		public String getBookOriginalPrice() {
			return bookOriginalPrice;
		}
		public void setBookOriginalPrice(String bookOriginalPrice) {
			this.bookOriginalPrice = bookOriginalPrice;
		}
		public int getBookIsDetele() {
			return bookIsDetele;
		}
		public void setBookIsDetele(int bookIsDetele) {
			this.bookIsDetele = bookIsDetele;
		}
		public String getBookKeyWord1() {
			return bookKeyWord1;
		}
		public void setBookKeyWord1(String bookKeyWord1) {
			this.bookKeyWord1 = bookKeyWord1;
		}
		public String getBookKeyWord2() {
			return bookKeyWord2;
		}
		public void setBookKeyWord2(String bookKeyWord2) {
			this.bookKeyWord2 = bookKeyWord2;
		}
		public String getBookSeriesAb() {
			return bookSeriesAb;
		}
		public void setBookSeriesAb(String bookSeriesAb) {
			this.bookSeriesAb = bookSeriesAb;
		}
		public String getBookPublicSort() {
			return bookPublicSort;
		}
		public void setBookPublicSort(String bookPublicSort) {
			this.bookPublicSort = bookPublicSort;
		}
		public String getBookScores() {
			return bookScores;
		}
		public void setBookScores(String bookScores) {
			this.bookScores = bookScores;
		}
		public String getBookCode() {
			return bookCode;
		}
		public void setBookCode(String bookCode) {
			this.bookCode = bookCode;
		}
		public String getBookPicture() {
			return bookPicture;
		}
		public void setBookPicture(String bookPicture) {
			this.bookPicture = bookPicture;
		}
		public String getBookTitles() {
			return bookTitles;
		}
		public void setBookTitles(String bookTitles) {
			this.bookTitles = bookTitles;
		}
		public String getBookMeasurementUnit() {
			return bookMeasurementUnit;
		}
		public void setBookMeasurementUnit(String bookMeasurementUnit) {
			this.bookMeasurementUnit = bookMeasurementUnit;
		}
		public String getPublish_house() {
			return publish_house;
		}
		public void setPublish_house(String publish_house) {
			this.publish_house = publish_house;
		}
		public Integer getBookDiscount() {
			return bookDiscount;
		}
		public void setBookDiscount(Integer bookDiscount) {
			this.bookDiscount = bookDiscount;
		}
		public String getBookNote() {
			return bookNote;
		}
		public void setBookNote(String bookNote) {
			this.bookNote = bookNote;
		}
		public Double getOrderFreight() {
			return orderFreight;
		}
		public void setOrderFreight(Double orderFreight) {
			this.orderFreight = orderFreight;
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
		public Distributor getDistributor() {
			return distributor;
		}
		public void setDistributor(Distributor distributor) {
			this.distributor = distributor;
		}
		public Integer getStoreId() {
			return storeId;
		}
		public void setStoreId(Integer storeId) {
			this.storeId = storeId;
		}
		public String getStoreName() {
			return storeName;
		}
		public void setStoreName(String storeName) {
			this.storeName = storeName;
		}
		
		
		
		
		
		
		
	
	
}
