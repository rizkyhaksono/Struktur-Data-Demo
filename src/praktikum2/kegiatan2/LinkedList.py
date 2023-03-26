__author__      = "rizkyhaksono"
__copyright__   = "Copyright 2023, Malang"

class LinkedList:
    def __init__(self):
        self.arrays = []
        self.length = 0

    def add(self, data):
        self.arrays.append(data)
        self.length += 1

    def print(self):
        print(self.arrays)

    def sortData(self, data):
        self.arrays.sort()
        self.print()

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

    print("Data after sorting : ")
    arrayList.sortData(arrayList.arrays)
    