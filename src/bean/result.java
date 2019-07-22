package bean;

import java.sql.Date;

public class result {

	private Date fortuneDay;
	private Date birthDay;
	private String canger;
	private Date update;
	private String creater;
	private Date createDay;
	private int omikujiId;

	public Date getFortuneDay() {
		return fortuneDay;
	}

	public void setFortuneDay(Date fortuneDay) {
		this.fortuneDay = fortuneDay;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public String getCanger() {
		return canger;
	}

	public void setCanger(String canger) {
		this.canger = canger;
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

	public int getOmikujiId() {
		return omikujiId;
	}

	public void setOmikujiId(int omikujiId) {
		this.omikujiId = omikujiId;
	}

}
