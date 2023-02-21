package org.tnsif.multipleinheritance;

public class Android extends Nokia {
	private String version;
	public void accept()
	{
		System.out.println("Android version is:"+version);
	}
	// Generate getter setter
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Android(String version) {
		super();
		this.version = version;
	}
//generate constructor using fields
   public Android(int modelno,String version) {
	super(modelno);
	this.version = version;
}

public Android() {
	super();
}

	

}
