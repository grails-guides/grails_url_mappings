package demo

class ConferenceUrlMappings {

    static mappings = {

        group "/conf", {
            get "/talks"(controller: 'conference', action: 'talks')
            get "/speakers"(controller: 'conference', action: 'speakers')
            get "/agenda"(controller: 'conference', action: 'agenda')
        }
    }
}
