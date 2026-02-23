class Node {
    constructor(data = null) {
        this.data = data;
        this.next = null;
    }
}

export default class CircularLinkedList {
    constructor() {
        this.first = null;
        this.last = null;
    }

    isEmpty() {
        return this.first === null;
    }

    insertLast(data) {
        const newNode = new Node(data);

        if (this.isEmpty()) {
            this.first = newNode;
            this.last = newNode;
            newNode.next = this.first;
        } else {
            this.last.next = newNode;
            newNode.next = this.first;
            this.last = newNode;
        }
    }

    insertByPosition(position, data) {
        const newNode = new Node(data);

        if (this.isEmpty()) {
            this.first = newNode;
            this.last = newNode;
            newNode.next = newNode;
            return;
        }

        if (position === 0) {
            newNode.next = this.first;
            this.first = newNode;
            this.last.next = this.first;
            return;
        }

        let current = this.first;
        let index = 0;

        while (index < position - 1 && current.next !== this.first) {
            current = current.next;
            index++;
        }

        newNode.next = current.next;
        current.next = newNode;

        if (current === this.last) {
            this.last = newNode;
        }
    }

    size() {
        if (this.isEmpty()) return 0;

        let count = 1;
        let current = this.first.next;

        while (current !== this.first) {
            count++;
            current = current.next;
        }

        return count;
    }

    remove(data) {
        if (this.isEmpty()) return false;

        let current = this.first;
        let previous = this.last;

        do {
            if (current.data === data) {
                if (this.first === this.last) {
                    this.first = null;
                    this.last = null;
                    return true;
                }

                previous.next = current.next;

                if (current === this.first) {
                    this.first = current.next;
                }

                if (current === this.last) {
                    this.last = previous;
                }

                this.last.next = this.first;
                return true;
            }

            previous = current;
            current = current.next;

        } while (current !== this.first);

        return false;
    }
}

