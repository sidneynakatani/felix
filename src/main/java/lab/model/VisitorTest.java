package lab.model;

import java.io.Serializable;

public class VisitorTest implements Serializable {


	private static final long serialVersionUID = -4402367763487512916L;
	
	protected long id;
	protected String name;
	
	public VisitorTest(){
		
	}
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
