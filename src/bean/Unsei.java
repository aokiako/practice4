package bean;

import java.sql.Date;

public class Unsei {

 private int unseiId;
 private String unseiName;
 private String changer;
 private Date update;
 private String creater;
 private Date createDay;

 public int getUnseiId() {
	return unseiId;
}
public void setUnseiId(int unseiId) {
	this.unseiId = unseiId;
}
public String getUnseiName() {
	return unseiName;
}
public void setUnseiName(String unseiName) {
	this.unseiName = unseiName;
}
public String getChanger() {
	return changer;
}
public void setChanger(String changer) {
	this.changer = changer;
}
public Date getUpdate() {
	return update;
}
public void setUpdate(Date update) {
	this.update = update;
}
public String getCreater() {
	return creater;
}
public void setCreater(String creater) {
	this.creater = creater;
}
public Date getCreateDay() {
	return createDay;
}
public void setCreateDay(Date createDay) {
	this.createDay = createDay;
}



}
