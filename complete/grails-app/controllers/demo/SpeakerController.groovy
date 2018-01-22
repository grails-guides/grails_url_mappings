package demo

class SpeakerController {

    def index() {
        render "Retrieving all Speakers..."
    }

    def save() {
        render "Saving new Speaker..."
    }

    def show(Serializable id) {
        render "Retrieving Speaker ${id}..."
    }

    def update(Serializable id) {
        render "Updating Speaker ${id}..."
    }

    def delete(Serializable id) {
        render "Deleting Speaker ${id}..."
    }
}
