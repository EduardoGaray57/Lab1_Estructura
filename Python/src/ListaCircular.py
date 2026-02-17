class Node:
    def __init__(self, data=None):
        self.data = data
        self.next = None

class CircularLinkedList:
    def __init__(self):
        self.first = None
        self.last = None
    
    def is_empty(self):
        return self.first is None
    
    def insertLast(self, data):
        new_node = Node(data)
        if self.is_empty():
            self.first = new_node
            self.last = new_node
            new_node.next = self.first  # Make it circular
        else:
            self.last.next = new_node
            new_node.next = self.first  # Make it circular
            self.last = new_node
    
    def insertByPosition(self, position, data):
        new_node = Node(data)

        # Case 1: list is empty
        if self.is_empty():
            self.first = new_node
            self.last = new_node
            new_node.next = new_node
            return
        #Case 2: insert at the beginning
        if position == 0:
            new_node.next = self.first
            self.first = new_node
            self.last.next = self.first  # Update last node's next to new first
            return
        #Case 3: insert in intermediate position
        current = self.first
        index = 0

        while index < position - 1 and current.next != self.first:
            current = current.next
            index += 1
        
        new_node.next = current.next
        current.next = new_node
        #Case 4: If it was inserted at the end
        if current == self.last:
            self.last = new_node
    
    def display(self):
        if self.is_empty():
            print("List is empty")
            return
        current = self.first
        while True:
            print(current.data, end=' -> ')
            current = current.next
            if current == self.first:
                break
        print("(Circular)")
    
    def size(self):
        if self.is_empty():
            return 0
        count = 1
        current = self.first.next
        while current != self.first:
            count += 1
            current = current.next
        return count
    
    # Delete
    def remove(self, data):
        if self.is_empty():
            return False

        current = self.first
        previous = self.last

        while True:
            if current.data == data:
                # Caso: un solo nodo
                if self.first == self.last:
                    self.first = None
                    self.last = None
                    return True  # ⬅ salir inmediatamente

                # Caso: más de un nodo
                previous.next = current.next

                if current == self.first:
                    self.first = current.next

                if current == self.last:
                    self.last = previous

                # Mantener circularidad
                self.last.next = self.first
                return True

            previous = current
            current = current.next

            if current == self.first:
                break

        return False
