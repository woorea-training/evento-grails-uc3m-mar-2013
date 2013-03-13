package org.cloud

class Volume {

	String name
	
	Integer capacity
	
	static mapping = {
		version false
	}

    static constraints = {
		name()
		capacity()
    }
}
