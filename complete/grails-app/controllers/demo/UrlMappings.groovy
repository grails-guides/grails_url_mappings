package demo

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }


        get "/talks"(controller: 'conference', action: 'talks') //<1>
        get "/speakers"(controller: 'conference', action: 'speakers')
        get "/agenda"(controller: 'conference', action: 'agenda')


        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
