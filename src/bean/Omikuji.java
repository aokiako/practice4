package bean;

import java.sql.Date;

public abstract class Omikuji {
	private int omikujiId;
	protected String unseiNm;
	private String negaigoto;
	private String akinai;
	private String gakumon;
	private Date upDate;
	private String changer;
	private Date createDay;
	private String creater;

	/**
	 * 運勢を設定
	 */
	public abstract void setUnsei();

	public String getUnseiNm() {
		return unseiNm;
	}

	public int getOmikujiId() {
		return omikujiId;
	}

	public void setOmikujiId(int omikujiId) {
		this.omikujiId = omikujiId;
	}

	public String getNegaigoto() {
		return negaigoto;
	}

	public void setNegaigoto(String negaigoto) {
		this.negaigoto = negaigoto;
	}

	public String getAkinai() {
		return akinai;
	}

	public void setAkinai(String akinai) {
		this.akinai = akinai;
	}

	public String getGakumon() {
		return gakumon;
	}

	public void setGakumon(String gakumon) {
		this.gakumon = gakumon;
	}

	public Date getUpDate() {
		return upDate;
	}

	public void setUpDate(Date upDate) {
		this.upDate = upDate;
	}

	public String getChanger() {
		return changer;
	}

	public void setChanger(String changer) {
		this.changer = changer;
	}

	public Date getCreateDay() {
		return createDay;
	}

	public void setCreateDay(Date createDay) {
		this.createDay = createDay;
	}

	public String getCreater() {
		return creater;
	}

	public void setCreater(String creater) {
		this.creater = creater;
	}

}
