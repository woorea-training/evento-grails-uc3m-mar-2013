class UrlMappings {

	static mappings = {
		"/api/servers"(controller : 'serversApi') {
			action = [
				GET : 'list',
				POST : 'save'
			]
		}
		"/api/servers/$id"(controller : 'serversApi') {
			action = [
				GET : 'show',
				PUT : 'update',
				DELETE : 'delete'
			]
		}
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/"(controller:"application",action:"login")
		"500"(view:'/error')
	}
}
