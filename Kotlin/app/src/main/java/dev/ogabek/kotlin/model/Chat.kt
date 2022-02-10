package dev.ogabek.kotlin.model

class Chat {
    var message: Message? = null
    var rooms = ArrayList<Room>()

    constructor(message: Message?) {
        this.message = message
    }

    constructor(rooms: ArrayList<Room>) {
        this.rooms = rooms
    }
}
