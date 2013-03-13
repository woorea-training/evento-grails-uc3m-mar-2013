package org.cloud

class ContactInfo {

	String email
	
	static belongsTo = [
		user : User
	]

    static constraints = {
    }
}
