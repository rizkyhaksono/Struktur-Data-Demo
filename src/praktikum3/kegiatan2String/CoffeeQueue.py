__author__      = "rizkyhaksono"
__copyright__   = "Copyright 2023, Malang"

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class CoffeeQueue:
    def __init__(self): 
        self.head = None

    def isEmpty(self):
        return self.head == None

    def enqueue(self, data):
        if self.head == None:
            self.head = Node(data)
        else:
            node = self.head
            while node.next != None:
                node = node.next
            node.next = Node(data)

    def dequeue(self):
        if self.head == None:
            return None
        else:
            popped = self.head.data
            self.head = self.head.next
            return popped

    def peek(self):
        if self.head == None:
            return None
        else:
            return self.head.data

    def show(self):
        if self.head == None:
            return None
        else:
            node = self.head
            while node != None:
                print(node.data, end = " ")
                node = node.next
            print()

    def size(self):
        node = self.head
        count = 0
        while node != None:
            count += 1
            node = node.next
        return count

if __name__ == "__main__":
    c = CoffeeQueue()

    # c.enqueue("Matcha")
    # c.enqueue("Cappucino")
    # print("Queue [Head -> Tail] : ", end = "")
    # c.show()

    # c.enqueue("Americano")
    # c.enqueue("Espresso")
    # print("Queue [Head -> Tail] : ", end = "")
    # c.show()
    
    # print("Remove: ", c.dequeue())
    # print("Queue [Head -> Tail] : ", end = "")
    # c.show()

    # print("Top queue : ", c.peek())
    # print("Queue [Head -> Tail] : ", end = "")
    # c.show()

    # print("Size : ", c.size())
    # print("Empty : ", c.isEmpty())

    # menu
    while True:
        print("\n===============================")
        print("Coffee Queue")
        print("===============================")
        print("1. Enqueue")
        print("2. Dequeue")
        print("3. Peek")
        print("4. Show")
        print("5. Size")
        print("6. Empty")
        print("7. Exit")
        print("===============================")
        menu = int(input(">> "))
        print("===============================")

        if menu == 1:
            data = input("Masukkan data: ")
            c.enqueue(data)
        elif menu == 2:
            print("Data yang dikeluarkan: ", c.dequeue())
        elif menu == 3:
            print("Data teratas: ", c.peek())
        elif menu == 4:
            print("Queue [Head -> Tail] : ", end = "")
            c.show()
        elif menu == 5:
            print("Size : ", c.size())
        elif menu == 6:
            print("Empty : ", c.isEmpty())
        elif menu == 7:
            break
        else:
            print("Menu tidak tersedia")

    print("Program selesai")