package org.cloud

import grails.converters.JSON

class ServersApiController {

	def serversService

    def list() { 
		render serversService.list().collect {
			[id : it.id, nombre : it.name]
		} as JSON
    }
	
	def save() {
		def json = request.JSON
		def server = new Server(
			name : json.name,
			title : json.title,
			image : [
				id : json.imageId
			],
			hardware : [
				id : json.hardwareId
			]
		)
		render serversService.save(server) as JSON
	}
	
	def show(Long id) { 
		render serversService.show(id) as JSON
	}
	
	def update(Long id) { 
		render serversService.update(request.JSON) as JSON
	}
	
	def delete(Long id) { 
		serversService.delete(id)
		response.statusCode = 204
	}
}
