package org.cloud

class ApplicationController {

    def login() { 
		if('POST'.equals(request.method)) {
			//if login ok
			redirect(controller : 'servers', action : 'list')
		}
	}

	def logout() { 
	
	}
	
}
