package com.example;

/**
 * 分页查询参数DTO
 * 
 * @author 刘冬 博客出处：http://www.cnblogs.com/GoodHelper/
 *
 */
public class PageQueryParamDTO {

	/**
	 * 页码
	 */
	private int page;

	/**
	 * 每页数量
	 */
	private int limit;

<<<<<<< HEAD
	private Long id;
=======
	private int id;
>>>>>>> d4ce27fb2171dde8094328a6a597cc1876e877fa
	private Long record_id;
	private String name;
	private String revision;
	private String number;
	private String stp_name;
	private String stp_hw_config;
	private String stp_sw_config;
	private String up_version_nr;
	private String up_release_nr;
	private String up_version_lte;
	private String up_release_lte;
	private String channel_model;
	private String lac_config_file;
	private String notes;
<<<<<<< HEAD

	private String mu_test_result;
	private String mu_test_setting;

=======
>>>>>>> d4ce27fb2171dde8094328a6a597cc1876e877fa

	/**
	 * 查询条件
	 */
	private Object query;

	public PageQueryParamDTO() {
	}

	public PageQueryParamDTO(int page, int limit, Object query) {
		this.page = page;
		this.limit = limit;
		this.query = query;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public Object getQuery() {
		return query;
	}

	public void setQuery(Object query) {
		this.query = query;
	}


<<<<<<< HEAD
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
=======
	public int getId() {
		return id;
	}

	public void setId(int id) {
>>>>>>> d4ce27fb2171dde8094328a6a597cc1876e877fa
		this.id = id;
	}

	public Long getRecord_id() {
		return record_id;
	}

	public void setRecord_id(Long record_id) {
		this.record_id = record_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRevision() {
		return revision;
	}

	public void setRevision(String revision) {
		this.revision = revision;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getStp_name() {
		return stp_name;
	}

	public void setStp_name(String stp_name) {
		this.stp_name = stp_name;
	}

	public String getStp_hw_config() {
		return stp_hw_config;
	}

	public void setStp_hw_config(String stp_hw_config) {
		this.stp_hw_config = stp_hw_config;
	}

	public String getStp_sw_config() {
		return stp_sw_config;
	}

	public void setStp_sw_config(String stp_sw_config) {
		this.stp_sw_config = stp_sw_config;
	}

	public String getUp_version_nr() {
		return up_version_nr;
	}

	public void setUp_version_nr(String up_version_nr) {
		this.up_version_nr = up_version_nr;
	}

	public String getUp_release_nr() {
		return up_release_nr;
	}

	public void setUp_release_nr(String up_release_nr) {
		this.up_release_nr = up_release_nr;
	}

	public String getUp_version_lte() {
		return up_version_lte;
	}

	public void setUp_version_lte(String up_version_lte) {
		this.up_version_lte = up_version_lte;
	}

	public String getUp_release_lte() {
		return up_release_lte;
	}

	public void setUp_release_lte(String up_release_lte) {
		this.up_release_lte = up_release_lte;
	}

	public String getChannel_model() {
		return channel_model;
	}

	public void setChannel_model(String channel_model) {
		this.channel_model = channel_model;
	}

	public String getLac_config_file() {
		return lac_config_file;
	}

	public void setLac_config_file(String lac_config_file) {
		this.lac_config_file = lac_config_file;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

<<<<<<< HEAD
	public String getMu_test_result() {
		return mu_test_result;
	}

	public void setMu_test_result(String mu_test_result) {
		this.mu_test_result = mu_test_result;
	}

	public String getMu_test_setting() {
		return mu_test_setting;
	}

	public void setMu_test_setting(String mu_test_setting) {
		this.mu_test_setting = mu_test_setting;
	}

}
=======
}
>>>>>>> d4ce27fb2171dde8094328a6a597cc1876e877fa
