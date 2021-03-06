package com.fortwone.vo;

/**
 * 日程的VO类
 * @author jack_peng
 *
 */
public class ScheduleVO {

	private int scheduleID;
	private int scheduleTypeID;
	private int remindID;
	private String scheduleContent;
	private String scheduleDate;
	private String scheduleTime;
	
	public ScheduleVO(){}
	
	public ScheduleVO(int scheduleID,int scheduleTypeID,int remindID,String scheduleContent,String scheduleDate,String scheduleTime){
		this.scheduleID = scheduleID;
		this.scheduleTypeID = scheduleTypeID;
		this.remindID = remindID;
		this.scheduleContent = scheduleContent;
		this.scheduleDate = scheduleDate;
		this.scheduleTime = scheduleTime ;
	}
	
	public int getScheduleID() {
		return scheduleID;
	}
	public void setScheduleID(int scheduleID) {
		this.scheduleID = scheduleID;
	}
	public int getScheduleTypeID() {
		return scheduleTypeID;
	}
	public void setScheduleTypeID(int scheduleTypeID) {
		this.scheduleTypeID = scheduleTypeID;
	}
	public int getRemindID() {
		return remindID;
	}
	public void setRemindID(int remindID) {
		this.remindID = remindID;
	}
	public String getScheduleContent() {
		return scheduleContent;
	}
	public void setScheduleContent(String scheduleContent) {
		this.scheduleContent = scheduleContent;
	}
	public String getScheduleDate() {
		return scheduleDate;
	}

	public void setScheduleDate(String scheduleDate) {
		this.scheduleDate = scheduleDate;
	}
	public String getScheduleTime() {
		return scheduleTime;
	}

	public void setScheduletime(String scheduleTime) {
		this.scheduleTime = scheduleTime;
	}
	
}
