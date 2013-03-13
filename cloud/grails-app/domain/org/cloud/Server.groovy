package org.cloud

class Server {

	String name
	
	String title
	
	Image image
	
	VHardware hardware
	
	Set volumes = [] as Set
	
	Set publicIps = [] as Set
	
	Firewall firewall
	
	static hasMany = [
		volumes : Volume,
		publicIps : PublicIp
	]

    static constraints = {
		name(blank : false)
		title(nullable : true)
		image(nullable : false)
		hardware(nullable : false)
		volumes()
		publicIps()
		firewall(nullable : true)
    }
}
