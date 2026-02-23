const CircularLinkedList = require("../src/CircularLinkedList");

describe("CircularLinkedList", () => {

    test("lista inicia vacía", () => {
        const list = new CircularLinkedList();
        expect(list.isEmpty()).toBe(true);
        expect(list.size()).toBe(0);
    });

    test("insertLast agrega elementos correctamente", () => {
        const list = new CircularLinkedList();

        list.insertLast(10);
        list.insertLast(20);

        expect(list.size()).toBe(2);
        expect(list.first.data).toBe(10);
        expect(list.last.data).toBe(20);
        expect(list.last.next).toBe(list.first); // circularidad
    });

    test("insertByPosition inserta al inicio", () => {
        const list = new CircularLinkedList();

        list.insertLast(10);
        list.insertByPosition(0, 5);

        expect(list.first.data).toBe(5);
        expect(list.last.next).toBe(list.first);
    });

    test("insertByPosition inserta en posición intermedia", () => {
        const list = new CircularLinkedList();

        list.insertLast(10);
        list.insertLast(30);
        list.insertByPosition(1, 20);

        expect(list.size()).toBe(3);
        expect(list.first.next.data).toBe(20);
    });

    test("remove elimina nodo intermedio", () => {
        const list = new CircularLinkedList();

        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);

        const result = list.remove(20);

        expect(result).toBe(true);
        expect(list.size()).toBe(2);
        expect(list.first.next.data).toBe(30);
    });

    test("remove elimina único nodo", () => {
        const list = new CircularLinkedList();

        list.insertLast(10);
        expect(list.remove(10)).toBe(true);
        expect(list.isEmpty()).toBe(true);
    });

    test("remove retorna false si el elemento no existe", () => {
        const list = new CircularLinkedList();

        list.insertLast(10);
        expect(list.remove(99)).toBe(false);
    });

});
