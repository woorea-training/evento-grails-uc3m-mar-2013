package es.woorea;

public class Server {

	private String name;
	
	private String title;
	
	private Long imageId;
	
	private Long hardwareId;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the imageId
	 */
	public Long getImageId() {
		return imageId;
	}

	/**
	 * @param imageId the imageId to set
	 */
	public void setImageId(Long imageId) {
		this.imageId = imageId;
	}

	/**
	 * @return the hardwareId
	 */
	public Long getHardwareId() {
		return hardwareId;
	}

	/**
	 * @param hardwareId the hardwareId to set
	 */
	public void setHardwareId(Long hardwareId) {
		this.hardwareId = hardwareId;
	}

}
