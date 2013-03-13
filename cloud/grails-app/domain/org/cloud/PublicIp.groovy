package org.cloud

class PublicIp {

	String address

    static constraints = {
		address(blank : false)
    }
}
