__author__      = "rizkyhaksono"
__copyright__   = "Copyright 2023, Malang"

class Node:
    def __init__(self, data = None):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None

    def add(self, data):
        if self.head is None:
            self.head = Node(data)
        else:
            current = self.head
            while current.next:
                current = current.next
            current.next = Node(data)

    def print(self):
        current = self.head
        while current:
            print(current.data , end=" ")
            current = current.next

    def sortData(self, callback):
        current = self.head
        while current:
            index = current.next
            while index:
                if current.data > index.data:
                    temp = current.data
                    current.data = index.data                    
                    index.data = temp
                index = index.next
            current = current.next
        callback()
    

if __name__ == "__main__":
    arrayList = LinkedList()

    arrayList.add(7)
    arrayList.add(1)
    arrayList.add(4)
    arrayList.add(6)
    arrayList.add(2)
    arrayList.add(3)

    print("Data before sorting : ")
    arrayList.print()

    print("\nData after sorting : ")
    arrayList.sortData(arrayList.print)
    