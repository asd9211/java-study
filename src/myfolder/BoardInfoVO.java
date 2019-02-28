package myfolder;

public class BoardInfoVO {

	private Integer biNum;
	private String biTitle;
	private String biContent;
	private String biCredat;
	private String biCreti;
	private Integer biCnt;
	private String biIsactive;
	public Integer getBiNum() {
		return biNum;
	}
	public void setBiNum(Integer biNum) {
		this.biNum = biNum;
	}
	public String getBiTitle() {
		return biTitle;
	}
	public void setBiTitle(String biTitle) {
		this.biTitle = biTitle;
	}
	public String getBiContent() {
		return biContent;
	}
	public void setBiContent(String biContent) {
		this.biContent = biContent;
	}
	public String getBiCredat() {
		return biCredat;
	}
	public void setBiCredat(String biCredat) {
		this.biCredat = biCredat;
	}
	public String getBiCreti() {
		return biCreti;
	}
	public void setBiCreti(String biCreti) {
		this.biCreti = biCreti;
	}
	public Integer getBiCnt() {
		return biCnt;
	}
	public void setBiCnt(Integer biCnt) {
		this.biCnt = biCnt;
	}
	public String getBiIsactive() {
		return biIsactive;
	}
	public void setBiIsactive(String biIsactive) {
		this.biIsactive = biIsactive;
	}
	@Override
	public String toString() {
		return "BoardInfoVO [biNum=" + biNum + ", biTitle=" + biTitle + ", biContent=" + biContent + ", biCredat="
				+ biCredat + ", biCreti=" + biCreti + ", biCnt=" + biCnt + ", biIsactive=" + biIsactive + "]";
	}
	
	
}
