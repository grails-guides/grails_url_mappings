package demo

class TalkController {

    def index() {
        render "Retrieving all Talks..."
    }

    def save() {
        render "Saving new Talk..."
    }

    def show(Serializable id) {
        render "Retrieving Talk ${id}..."
    }

    def update(Serializable id) {
        render "Updating Talk ${id}..."
    }

    def delete(Serializable id) {
        render "Deleting Talk ${id}..."
    }
}
