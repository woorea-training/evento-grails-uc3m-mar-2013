package org.cloud

class FirewallRule {

	String protocol
	
	String source = "0.0.0.0/24"
	
	Integer fromPort
	
	Integer toPort
	
	static belongsTo = [
		firewall : Firewall
	]

    static constraints = {
		firewall()
		protocol()
		source()
		fromPort()
		toPort()
    }
}
