__author__      = "rizkyhaksono"
__copyright__   = "Copyright 2023, Malang"

class CoffeeShop:
    def __init__(self):
        self.items = []
    def isEmpty(self):
        return self.items == []
    def enqueue(self, item):
        self.items.insert(0,item)
    def dequeue(self):
        return self.items.pop()
    def size(self):
        return len(self.items)
    def show(self):
        return self.items
    def peek(self):
        return self.items[len(self.items)-1]

if __name__ == "__main__":
    q = CoffeeShop()
    q.enqueue(10)
    q.enqueue(20)
    print(q.show())

    q.enqueue(30)
    q.enqueue(50)
    print(q.show())

    print(q.dequeue())
    print(q.show())

    print(q.peek())
    print(q.show())

    print(q.size())
    print(q.show())

    print(q.isEmpty())