/**
 * 
 */
package com.zpark.springboot.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author lity
 *
 */
public class ResultVO<T> implements java.io.Serializable {

	private static final long serialVersionUID = 417759602056089394L;

	@JsonProperty("code") // 如果json字符串中的名字与成员变量名不一致时需要使用
	/** 错误码 */
	private Integer code;
	/** 提示信息 */
	private String msg;
	/** 数据 */
	private T data;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
