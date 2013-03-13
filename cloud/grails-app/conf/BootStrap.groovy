import org.cloud.*

class BootStrap {

    def init = { servletContext ->
    	def user = new User(
			username : "luis",
			password : "secret0",
			contact : new ContactInfo(
				email : "luis@woorea.es"
			)
		).save()
		['ubuntu','windows','redhat'].each {
			new Image(name : it).save(flush : true)
		}
		new VHardware(
			name : "tiny",
			vcpus : 1,
			ram : 512,
			hardDisk : 10
		).save(flush : true)
		new VHardware(
			name : "small",
			vcpus : 2,
			ram : 1024,
			hardDisk : 20
		).save(flush : true)
		new VHardware(
			name : "medium",
			vcpus : 4,
			ram : 2048,
			hardDisk : 50
		).save(flush : true)
		new PublicIp(address : "10.0.0.1").save()
		new PublicIp(address : "10.0.0.2").save()
		new PublicIp(address : "10.0.0.3").save()
		new Volume(name : "vol1", capacity : 1).save()
		new Volume(name : "vol2", capacity : 2).save()
		new Volume(name : "vol3", capacity : 3).save()
		def fw = new Firewall(
			name : "fw1"
		)
		(1..5).each {
			fw.addToRules(
				protocol : "TCP",
				fromPort : 1024,
				toPort : 2048
			)
		}
		fw.save()
	}
    def destroy = {
    }
}
