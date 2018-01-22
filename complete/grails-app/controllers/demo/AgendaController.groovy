package demo

class AgendaController {

    def index() {
        render "Retrieving all Agendas..."
    }

    def save() {
        render "Saving new Agenda..."
    }

    def show(Serializable id) {
        render "Retrieving Agenda ${id}..."
    }

    def update(Serializable id) {
        render "Updating Agenda ${id}..."
    }

    def delete(Serializable id) {
        render "Deleting Agenda ${id}..."
    }
}
