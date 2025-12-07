package practice;

public class Mfls {

	String value;
	String desc;
	EffinTimestamp effinTimestamp;
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public EffinTimestamp getEffinTimestamp() {
		return effinTimestamp;
	}
	public void setEffinTimestamp(EffinTimestamp effinTimestamp) {
		this.effinTimestamp = effinTimestamp;
	}
	
	
	
	@Override
	public String toString() {
		return "Mfls [value=" + value + ", desc=" + desc + ", effinTimestamp=" + effinTimestamp + "]";
	}

}
