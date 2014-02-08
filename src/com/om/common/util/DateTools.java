package com.om.common.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.commons.lang3.time.FastDateFormat;

/**
 * 日期工具类
  * @ClassName: DateTools  
  * @Description: TODO 
  * @author: libin 
  * @date:Nov 5, 2012 11:26:50 PM
 */
public class DateTools {

	private static SimpleDateFormat fullSimpleDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");

	private static SimpleDateFormat DateFormatyyMMdd = new SimpleDateFormat(
			"yyMMdd");

	private static SimpleDateFormat DateFormatyyyyMMdd = new SimpleDateFormat(
			"yyyy-MM-dd");

	private static SimpleDateFormat DateFormatyyyy = new SimpleDateFormat(
			"yyyy");

	private static SimpleDateFormat DateFormatyyyyMM = new SimpleDateFormat(
			"yyyy-MM");

	private static SimpleDateFormat DateFormatssmmHHddMM = new SimpleDateFormat(
			"ss mm HH dd MM ?");

	private static SimpleDateFormat DateFormatyyyyMMddHHmmss = new SimpleDateFormat(
			"yyyyMMddHHmmss");

	private static Date rightNow = null;

	/**
	 * 按照格式将时间转化为字符串
	  * @Title: convertDateToString  
	  * @Description: TODO 
	  * @param source  日期
	  * @param pattern  指定的日期格式
	  * @return 
	  * @return String 
	  * @author: libin  
	  * @date:Nov 5, 2012 11:27:12 PM 
	  * @throws
	 */
	public static String convertDateToString(Date source, String pattern) {
		if (StringUtils.isBlank(pattern)) {
			pattern = "yyyy-MM-dd";
		}
		FastDateFormat format = FastDateFormat.getInstance(pattern);
		return format.format(source);
	}

	/**
	 * 按照格式将字符串转换为日期
	  * @Title: convertStringToDate  
	  * @Description: TODO 
	  * @param source
	  * @param pattern
	  * @return 
	  * @return Date 
	  * @author: libin  
	  * @date:Nov 5, 2012 11:27:48 PM 
	  * @throws
	 */
	public static Date convertStringToDate(String source, String pattern) {
		if (StringUtils.isBlank(pattern)) {
			pattern = "yyyy-MM-dd";
		}
		Date date = null;
		try {
			date = DateUtils.parseDate(source, new String[] { pattern });
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	/**
	 * 把Timestamp时间类型转换成字符串类型
	  * @Title: getTimestampString  
	  * @Description: TODO 
	  * @param convertDate
	  * @return 
	  * @return String 
	  * @author: libin  
	  * @date:Nov 5, 2012 11:28:45 PM 
	  * @throws
	 */
	public static String getTimestampString(Timestamp convertDate) {
		String t1 = fullSimpleDateFormat.format(convertDate);
		return t1;
	}

	/**
	 * 按照 'yyyy-MM-dd HH:mm:ss' 格式把字符串类型转换为时间类型
	  * @Title: getTimeStringByFullString  
	  * @Description: TODO 
	  * @param convertDate
	  * @return 
	  * @return Date 
	  * @author: libin  
	  * @date:Nov 5, 2012 11:37:29 PM 
	  * @throws
	 */
	public static Date getTimeStringByFullString(String convertDate) {
		Date timeString = null;
		try {
			timeString = fullSimpleDateFormat.parse(convertDate);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return timeString;
	}

	/**
	 * 把字符串类型转换为Timestamp时间类型
	  * @Title: getTimestampByTimeString  
	  * @Description: TODO 
	  * @param convertDate
	  * @return 
	  * @return Timestamp 
	  * @author: libin  
	  * @date:Nov 5, 2012 11:37:42 PM 
	  * @throws
	 */
	public static Timestamp getTimestampByTimeString(String convertDate) {
		Timestamp t1 = Timestamp.valueOf(convertDate);
		return t1;
	}


	/**
	 * 校验日期格式
	  * @Title: checkDateString  
	  * @Description: TODO 
	  * @param checkValue
	  * @return 
	  * @return boolean 
	  * @author: libin  
	  * @date:Nov 5, 2012 11:37:50 PM 
	  * @throws
	 */
	public static boolean checkDateString(String checkValue) {
		String eL = "^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))(\\s(((0?[0-9])|(1[0-9])|(2[0-3]))\\:(([0-5][0-9])|([0-9]))(((\\s)|(\\:(([0-5][0-9])|([0-9]))))?)))?$";
		Matcher m = Pattern.compile(eL).matcher(checkValue);
		return m.matches();
	}
}	
