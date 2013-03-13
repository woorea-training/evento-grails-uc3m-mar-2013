package org.cloud

class Firewall {

	String name
	
	Set rules
	
	static hasMany = [
		rules : FirewallRule
	]

    static constraints = {
    }
}
