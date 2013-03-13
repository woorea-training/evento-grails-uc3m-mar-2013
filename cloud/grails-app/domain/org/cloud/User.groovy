package org.cloud

class User {

	String username
	
	String password
	
	static hasOne = [
		contact : ContactInfo
	]

    static constraints = {
		username()
		password()
		contact()
    }
}
