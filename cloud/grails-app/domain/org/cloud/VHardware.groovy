package org.cloud

class VHardware {

	String name
	
	Integer vcpus
	
	Integer ram
	
	Integer hardDisk

    static constraints = {
		name()
		vcpus()
		ram()
		hardDisk()
    }

	public String toString() {
		vcpus + " VCPUS | " + ram + " RAM | " + hardDisk + " HD"
	}
}
