package org.cloud

class ServersService {

    def list() { 
		Server.list()
    }
	
	def save(Server server) { 
		server.save()
	}
	
	def show(Long id) { 
		Server.get(id)
	}
	
	def update(Server server) { 
		server.merge()
	}
	
	def delete(Long id) { 
		Server.load(id).delete()
	}
}
