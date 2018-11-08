package com.nsc.backend.entity;

import java.util.Date;

public class ErpBookInfo {
	
    /*private String id;
    private Integer Book_ID;
    private String Book_Name;
    private String ISBN;
    private String Sort1;
    private String Sort2;
    private String Editor_house;
    private String Duty_editor;
    private String Author;
    private String if_Series;
    private String SeriesAb;
    private double Unit_Price;
    private Integer Tatol_Printnumber_Begin;
    private Integer Tatol_Printnumber_End;
    private Integer Exclusive_num;
	private Integer Sample_amount;
	private Date  Publish_Date;
	private String  Edition;
	private String  Orders;
	private String  Book_No;
	private String Reprint;
	private String Frame;
	private double Weight_Per_Volume;
	private Integer Volume_Per_Bag;
	private Integer Bag_Per_RailwayPiece;
	private double Receive_Discount;
	private double Min_Discount;
	private double Min_Storage;
	private double Register_Date;
	private String  Register_Person;
	private String book_code;
	private String provider;
	private String if_foreign;
	private String older;
	private double backup_date;
	private String Publish_house;
	private String cn_mark;
	private Date First_Receive_date;
	private String if_repair_date;
	private String Publish_Sort;
	private String Sort3;
	private String Bar_code;
	private double Tax_rate;
	private String sort1_id;
	private String ISRC;
	private String fh_flag;
	private String th_flag;
	private String check_flag;
	private String if_duties;
	private String if_initiative;
	private Date update_time;
	private String if_export;
	private String series_name;
	private String Key_word3;
	private String Key_word4;
	private String uf_code;
	private String uf_ch_code;
	private String update_or_insert;
	private double minrepertory;
	private double saferepertory;
	private Integer discount;
	private String if_specials;
	private String Format;
	private String Word_face;
	private String goodsallocation;
	private String Ornament;
	private String Words;
	private String Finished_size;
	private String Print_color;
	private String Reader;
	private String Book_description;
	private String Copy_paper;
	private String default_location;
	private Integer retail_discount;
	private String ismanual;
	private Integer new_publish_house;
	private Integer online_discount;
	private String gift;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getBook_ID() {
		return Book_ID;
	}
	public void setBook_ID(Integer book_ID) {
		Book_ID = book_ID;
	}
	public String getBook_Name() {
		return Book_Name;
	}
	public void setBook_Name(String book_Name) {
		Book_Name = book_Name;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getSort1() {
		return Sort1;
	}
	public void setSort1(String sort1) {
		Sort1 = sort1;
	}
	public String getSort2() {
		return Sort2;
	}
	public void setSort2(String sort2) {
		Sort2 = sort2;
	}
	public String getEditor_house() {
		return Editor_house;
	}
	public void setEditor_house(String editor_house) {
		Editor_house = editor_house;
	}
	public String getDuty_editor() {
		return Duty_editor;
	}
	public void setDuty_editor(String duty_editor) {
		Duty_editor = duty_editor;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getIf_Series() {
		return if_Series;
	}
	public void setIf_Series(String if_Series) {
		this.if_Series = if_Series;
	}
	public String getSeriesAb() {
		return SeriesAb;
	}
	public void setSeriesAb(String seriesAb) {
		SeriesAb = seriesAb;
	}
	public double getUnit_Price() {
		return Unit_Price;
	}
	public void setUnit_Price(double unit_Price) {
		Unit_Price = unit_Price;
	}
	public Integer getTatol_Printnumber_Begin() {
		return Tatol_Printnumber_Begin;
	}
	public void setTatol_Printnumber_Begin(Integer tatol_Printnumber_Begin) {
		Tatol_Printnumber_Begin = tatol_Printnumber_Begin;
	}
	public Integer getTatol_Printnumber_End() {
		return Tatol_Printnumber_End;
	}
	public void setTatol_Printnumber_End(Integer tatol_Printnumber_End) {
		Tatol_Printnumber_End = tatol_Printnumber_End;
	}
	public Integer getExclusive_num() {
		return Exclusive_num;
	}
	public void setExclusive_num(Integer exclusive_num) {
		Exclusive_num = exclusive_num;
	}
	public Integer getSample_amount() {
		return Sample_amount;
	}
	public void setSample_amount(Integer sample_amount) {
		Sample_amount = sample_amount;
	}
	public Date getPublish_Date() {
		return Publish_Date;
	}
	public void setPublish_Date(Date publish_Date) {
		Publish_Date = publish_Date;
	}
	public String getEdition() {
		return Edition;
	}
	public void setEdition(String edition) {
		Edition = edition;
	}
	public String getOrders() {
		return Orders;
	}
	public void setOrders(String orders) {
		Orders = orders;
	}
	public String getBook_No() {
		return Book_No;
	}
	public void setBook_No(String book_No) {
		Book_No = book_No;
	}
	public String getReprint() {
		return Reprint;
	}
	public void setReprint(String reprint) {
		Reprint = reprint;
	}
	public String getFrame() {
		return Frame;
	}
	public void setFrame(String frame) {
		Frame = frame;
	}
	public double getWeight_Per_Volume() {
		return Weight_Per_Volume;
	}
	public void setWeight_Per_Volume(double weight_Per_Volume) {
		Weight_Per_Volume = weight_Per_Volume;
	}
	public Integer getVolume_Per_Bag() {
		return Volume_Per_Bag;
	}
	public void setVolume_Per_Bag(Integer volume_Per_Bag) {
		Volume_Per_Bag = volume_Per_Bag;
	}
	public Integer getBag_Per_RailwayPiece() {
		return Bag_Per_RailwayPiece;
	}
	public void setBag_Per_RailwayPiece(Integer bag_Per_RailwayPiece) {
		Bag_Per_RailwayPiece = bag_Per_RailwayPiece;
	}
	public double getReceive_Discount() {
		return Receive_Discount;
	}
	public void setReceive_Discount(double receive_Discount) {
		Receive_Discount = receive_Discount;
	}
	public double getMin_Discount() {
		return Min_Discount;
	}
	public void setMin_Discount(double min_Discount) {
		Min_Discount = min_Discount;
	}
	public double getMin_Storage() {
		return Min_Storage;
	}
	public void setMin_Storage(double min_Storage) {
		Min_Storage = min_Storage;
	}
	public double getRegister_Date() {
		return Register_Date;
	}
	public void setRegister_Date(double register_Date) {
		Register_Date = register_Date;
	}
	public String getRegister_Person() {
		return Register_Person;
	}
	public void setRegister_Person(String register_Person) {
		Register_Person = register_Person;
	}
	public String getBook_code() {
		return book_code;
	}
	public void setBook_code(String book_code) {
		this.book_code = book_code;
	}
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public String getIf_foreign() {
		return if_foreign;
	}
	public void setIf_foreign(String if_foreign) {
		this.if_foreign = if_foreign;
	}
	public String getOlder() {
		return older;
	}
	public void setOlder(String older) {
		this.older = older;
	}
	public double getBackup_date() {
		return backup_date;
	}
	public void setBackup_date(double backup_date) {
		this.backup_date = backup_date;
	}
	public String getPublish_house() {
		return Publish_house;
	}
	public void setPublish_house(String publish_house) {
		Publish_house = publish_house;
	}
	public String getCn_mark() {
		return cn_mark;
	}
	public void setCn_mark(String cn_mark) {
		this.cn_mark = cn_mark;
	}
	public Date getFirst_Receive_date() {
		return First_Receive_date;
	}
	public void setFirst_Receive_date(Date first_Receive_date) {
		First_Receive_date = first_Receive_date;
	}
	public String getIf_repair_date() {
		return if_repair_date;
	}
	public void setIf_repair_date(String if_repair_date) {
		this.if_repair_date = if_repair_date;
	}
	public String getPublish_Sort() {
		return Publish_Sort;
	}
	public void setPublish_Sort(String publish_Sort) {
		Publish_Sort = publish_Sort;
	}
	public String getSort3() {
		return Sort3;
	}
	public void setSort3(String sort3) {
		Sort3 = sort3;
	}
	public String getBar_code() {
		return Bar_code;
	}
	public void setBar_code(String bar_code) {
		Bar_code = bar_code;
	}
	public double getTax_rate() {
		return Tax_rate;
	}
	public void setTax_rate(double tax_rate) {
		Tax_rate = tax_rate;
	}
	public String getSort1_id() {
		return sort1_id;
	}
	public void setSort1_id(String sort1_id) {
		this.sort1_id = sort1_id;
	}
	public String getISRC() {
		return ISRC;
	}
	public void setISRC(String iSRC) {
		ISRC = iSRC;
	}
	public String getFh_flag() {
		return fh_flag;
	}
	public void setFh_flag(String fh_flag) {
		this.fh_flag = fh_flag;
	}
	public String getTh_flag() {
		return th_flag;
	}
	public void setTh_flag(String th_flag) {
		this.th_flag = th_flag;
	}
	public String getCheck_flag() {
		return check_flag;
	}
	public void setCheck_flag(String check_flag) {
		this.check_flag = check_flag;
	}
	public String getIf_duties() {
		return if_duties;
	}
	public void setIf_duties(String if_duties) {
		this.if_duties = if_duties;
	}
	public String getIf_initiative() {
		return if_initiative;
	}
	public void setIf_initiative(String if_initiative) {
		this.if_initiative = if_initiative;
	}
	public Date getUpdate_time() {
		return update_time;
	}
	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}
	public String getIf_export() {
		return if_export;
	}
	public void setIf_export(String if_export) {
		this.if_export = if_export;
	}
	public String getSeries_name() {
		return series_name;
	}
	public void setSeries_name(String series_name) {
		this.series_name = series_name;
	}
	public String getKey_word3() {
		return Key_word3;
	}
	public void setKey_word3(String key_word3) {
		Key_word3 = key_word3;
	}
	public String getKey_word4() {
		return Key_word4;
	}
	public void setKey_word4(String key_word4) {
		Key_word4 = key_word4;
	}
	public String getUf_code() {
		return uf_code;
	}
	public void setUf_code(String uf_code) {
		this.uf_code = uf_code;
	}
	public String getUf_ch_code() {
		return uf_ch_code;
	}
	public void setUf_ch_code(String uf_ch_code) {
		this.uf_ch_code = uf_ch_code;
	}
	public String getUpdate_or_insert() {
		return update_or_insert;
	}
	public void setUpdate_or_insert(String update_or_insert) {
		this.update_or_insert = update_or_insert;
	}
	public double getMinrepertory() {
		return minrepertory;
	}
	public void setMinrepertory(double minrepertory) {
		this.minrepertory = minrepertory;
	}
	public double getSaferepertory() {
		return saferepertory;
	}
	public void setSaferepertory(double saferepertory) {
		this.saferepertory = saferepertory;
	}
	public Integer getDiscount() {
		return discount;
	}
	public void setDiscount(Integer discount) {
		this.discount = discount;
	}
	public String getIf_specials() {
		return if_specials;
	}
	public void setIf_specials(String if_specials) {
		this.if_specials = if_specials;
	}
	public String getFormat() {
		return Format;
	}
	public void setFormat(String format) {
		Format = format;
	}
	public String getWord_face() {
		return Word_face;
	}
	public void setWord_face(String word_face) {
		Word_face = word_face;
	}
	public String getGoodsallocation() {
		return goodsallocation;
	}
	public void setGoodsallocation(String goodsallocation) {
		this.goodsallocation = goodsallocation;
	}
	public String getOrnament() {
		return Ornament;
	}
	public void setOrnament(String ornament) {
		Ornament = ornament;
	}
	public String getWords() {
		return Words;
	}
	public void setWords(String words) {
		Words = words;
	}
	public String getFinished_size() {
		return Finished_size;
	}
	public void setFinished_size(String finished_size) {
		Finished_size = finished_size;
	}
	public String getPrint_color() {
		return Print_color;
	}
	public void setPrint_color(String print_color) {
		Print_color = print_color;
	}
	public String getReader() {
		return Reader;
	}
	public void setReader(String reader) {
		Reader = reader;
	}
	public String getBook_description() {
		return Book_description;
	}
	public void setBook_description(String book_description) {
		Book_description = book_description;
	}
	public String getCopy_paper() {
		return Copy_paper;
	}
	public void setCopy_paper(String copy_paper) {
		Copy_paper = copy_paper;
	}
	public String getDefault_location() {
		return default_location;
	}
	public void setDefault_location(String default_location) {
		this.default_location = default_location;
	}
	public Integer getRetail_discount() {
		return retail_discount;
	}
	public void setRetail_discount(Integer retail_discount) {
		this.retail_discount = retail_discount;
	}
	public String getIsmanual() {
		return ismanual;
	}
	public void setIsmanual(String ismanual) {
		this.ismanual = ismanual;
	}
	public Integer getNew_publish_house() {
		return new_publish_house;
	}
	public void setNew_publish_house(Integer new_publish_house) {
		this.new_publish_house = new_publish_house;
	}
	public Integer getOnline_discount() {
		return online_discount;
	}
	public void setOnline_discount(Integer online_discount) {
		this.online_discount = online_discount;
	}
	public String getGift() {
		return gift;
	}
	public void setGift(String gift) {
		this.gift = gift;
	}
	@Override
	public String toString() {
		return "ErpBookInfo [id=" + id + ", Book_ID=" + Book_ID + ", Book_Name=" + Book_Name + ", ISBN=" + ISBN
				+ ", Sort1=" + Sort1 + ", Sort2=" + Sort2 + ", Editor_house=" + Editor_house + ", Duty_editor="
				+ Duty_editor + ", Author=" + Author + ", if_Series=" + if_Series + ", SeriesAb=" + SeriesAb
				+ ", Unit_Price=" + Unit_Price + ", Tatol_Printnumber_Begin=" + Tatol_Printnumber_Begin
				+ ", Tatol_Printnumber_End=" + Tatol_Printnumber_End + ", Exclusive_num=" + Exclusive_num
				+ ", Sample_amount=" + Sample_amount + ", Publish_Date=" + Publish_Date + ", Edition=" + Edition
				+ ", Orders=" + Orders + ", Book_No=" + Book_No + ", Reprint=" + Reprint + ", Frame=" + Frame
				+ ", Weight_Per_Volume=" + Weight_Per_Volume + ", Volume_Per_Bag=" + Volume_Per_Bag
				+ ", Bag_Per_RailwayPiece=" + Bag_Per_RailwayPiece + ", Receive_Discount=" + Receive_Discount
				+ ", Min_Discount=" + Min_Discount + ", Min_Storage=" + Min_Storage + ", Register_Date=" + Register_Date
				+ ", Register_Person=" + Register_Person + ", book_code=" + book_code + ", provider=" + provider
				+ ", if_foreign=" + if_foreign + ", older=" + older + ", backup_date=" + backup_date
				+ ", Publish_house=" + Publish_house + ", cn_mark=" + cn_mark + ", First_Receive_date="
				+ First_Receive_date + ", if_repair_date=" + if_repair_date + ", Publish_Sort=" + Publish_Sort
				+ ", Sort3=" + Sort3 + ", Bar_code=" + Bar_code + ", Tax_rate=" + Tax_rate + ", sort1_id=" + sort1_id
				+ ", ISRC=" + ISRC + ", fh_flag=" + fh_flag + ", th_flag=" + th_flag + ", check_flag=" + check_flag
				+ ", if_duties=" + if_duties + ", if_initiative=" + if_initiative + ", update_time=" + update_time
				+ ", if_export=" + if_export + ", series_name=" + series_name + ", Key_word3=" + Key_word3
				+ ", Key_word4=" + Key_word4 + ", uf_code=" + uf_code + ", uf_ch_code=" + uf_ch_code
				+ ", update_or_insert=" + update_or_insert + ", minrepertory=" + minrepertory + ", saferepertory="
				+ saferepertory + ", discount=" + discount + ", if_specials=" + if_specials + ", Format=" + Format
				+ ", Word_face=" + Word_face + ", goodsallocation=" + goodsallocation + ", Ornament=" + Ornament
				+ ", Words=" + Words + ", Finished_size=" + Finished_size + ", Print_color=" + Print_color + ", Reader="
				+ Reader + ", Book_description=" + Book_description + ", Copy_paper=" + Copy_paper
				+ ", default_location=" + default_location + ", retail_discount=" + retail_discount + ", ismanual="
				+ ismanual + ", new_publish_house=" + new_publish_house + ", online_discount=" + online_discount
				+ ", gift=" + gift + "]";
	}*/
	
	
	
	
	
	private String id;
	private double price;
	private String data;
	private Date create_date;
	private Date update_date;
	private String outer_id;
	private String shopid;
	private String contrast_flag;
	private String num_iid;
	private String title;
	private String props_name;
	private String version;
	private String pic_url;
	private String author;
	private Date print_date;
	private String print_house;
	private String frame;
	private String if_series;
	private String is_update;
	private String is_show;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public Date getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}
	public String getOuter_id() {
		return outer_id;
	}
	public void setOuter_id(String outer_id) {
		this.outer_id = outer_id;
	}
	public String getShopid() {
		return shopid;
	}
	public void setShopid(String shopid) {
		this.shopid = shopid;
	}
	public String getContrast_flag() {
		return contrast_flag;
	}
	public void setContrast_flag(String contrast_flag) {
		this.contrast_flag = contrast_flag;
	}
	public String getNum_iid() {
		return num_iid;
	}
	public void setNum_iid(String num_iid) {
		this.num_iid = num_iid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getProps_name() {
		return props_name;
	}
	public void setProps_name(String props_name) {
		this.props_name = props_name;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getPic_url() {
		return pic_url;
	}
	public void setPic_url(String pic_url) {
		this.pic_url = pic_url;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getPrint_date() {
		return print_date;
	}
	public void setPrint_date(Date print_date) {
		this.print_date = print_date;
	}
	public String getPrint_house() {
		return print_house;
	}
	public void setPrint_house(String print_house) {
		this.print_house = print_house;
	}
	public String getFrame() {
		return frame;
	}
	public void setFrame(String frame) {
		this.frame = frame;
	}
	public String getIf_series() {
		return if_series;
	}
	public void setIf_series(String if_series) {
		this.if_series = if_series;
	}
	public String getIs_update() {
		return is_update;
	}
	public void setIs_update(String is_update) {
		this.is_update = is_update;
	}
	public String getIs_show() {
		return is_show;
	}
	public void setIs_show(String is_show) {
		this.is_show = is_show;
	}
	@Override
	public String toString() {
		return "ErpBookInfo [id=" + id + ", price=" + price + ", data=" + data + ", create_date=" + create_date
				+ ", update_date=" + update_date + ", outer_id=" + outer_id + ", shopid=" + shopid + ", contrast_flag="
				+ contrast_flag + ", num_iid=" + num_iid + ", title=" + title + ", props_name=" + props_name
				+ ", version=" + version + ", pic_url=" + pic_url + ", author=" + author + ", print_date=" + print_date
				+ ", print_house=" + print_house + ", frame=" + frame + ", if_series=" + if_series + ", is_update="
				+ is_update + ", is_show=" + is_show + "]";
	}



}
