package com.example;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 会员
 *
 * @author 刘冬 博客出处：http://www.cnblogs.com/GoodHelper/
 *
 */
@Entity
@Table(name = "air_3229_b40_b78ab")
public class FourtyMember {

	@Id
	@Column(name = "`id`", length = 36)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;

	@Column(name = "`record_id`", length = 50)
	public Long record_id;

	/**
	 * name
	 */
	@Column(name = "`name`", length = 50)
	public String name;

	/**
	 * Radio_productRevision
	 */
	@Column(name = "`revision`", length = 50)
	public String revision;

	/**
	 * Radio_serialNumber
	 */
	@Column(name = "`number`", length = 50)
	public String number;

	/**
	 * stp_name
	 */
	@Column(name = "`stp_name`", length = 50)
	public String stp_name;

	/**
	 * stp_hw_config
	 */
	@Column(name = "`stp_hw_config`", length = 50)
	public String stp_hw_config;

	/**
	 * stp_sw_config
	 */
	@Column(name = "`stp_sw_config`", length = 50)
	public String stp_sw_config;

	/**
	 * up_version_nr
	 */
	@Column(name = "`up_version_nr`", length = 50)
	public String up_version_nr;

	/**
	 * up_release_nr
	 */
	@Column(name = "`up_release_nr`", length = 50)
	public String up_release_nr;

	/**
	 * up_version_lte
	 */
	@Column(name = "`up_version_lte`", length = 50)
	public String up_version_lte;

	@Column(name = "`up_release_lte`", length = 50)
	public String up_release_lte;

	/**
	 * mu_test_result
	 */
	@Column(name = "`mu_test_result`", length = 255)
	public String mu_test_result;

	/**
	 * mu_test_setting
	 */
	@Column(name = "`mu_test_setting`", length = 255)
	public String mu_test_setting;

	/**
	 * notes
	 */
	@Column(name = "`notes`", length = 255)
	public String notes;


	// 省略 get set
}