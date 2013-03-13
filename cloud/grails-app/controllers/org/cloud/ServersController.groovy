package org.cloud

class ServersController {

	def serversService

    def list() { 
		def servers = serversService.list()
		[servers : servers]
    }

	def create() { 
		def server = new Server()
		[server : server]
	}
	
	def save() { 
		def server = new Server(params)
		serversService.save(server)
		redirect(action : 'list')
	}
	
	def show() { 
	
	}
	
	def edit() { }
	
	def update() { 
		redirect(action : 'edit', id : 1)
	}
	
	def delete() { 
		redirect(action : 'list')
	}
}
