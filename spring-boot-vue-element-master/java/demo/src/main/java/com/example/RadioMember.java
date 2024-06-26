package com.example;

<<<<<<< HEAD
import java.util.Date;

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
=======
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
>>>>>>> d4ce27fb2171dde8094328a6a597cc1876e877fa

/**
 * 会员
 *
 * @author 刘冬 博客出处：http://www.cnblogs.com/GoodHelper/
 *
 */
@Entity
<<<<<<< HEAD
@Table(name = "air_6419_b41")
public class RadioMember {

	@Id
	@Column(name = "`id`", length = 36)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
=======
@Table(name = "radio")
public class RadioMember {

	@Id
	@Column(name = "id", length = 36)
>>>>>>> d4ce27fb2171dde8094328a6a597cc1876e877fa
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
	 * channel_model
	 */
	@Column(name = "`channel_model`", length = 50)
	public String channel_model;

	/**
	 * lac_config_file
	 */
	@Column(name = "`lac_config_file`", length = 50)
	public String lac_config_file;

	/**
	 * notes
	 */
	@Column(name = "`notes`", length = 50)
	public String notes;


	// 省略 get set
<<<<<<< HEAD
}
=======
}
>>>>>>> d4ce27fb2171dde8094328a6a597cc1876e877fa
