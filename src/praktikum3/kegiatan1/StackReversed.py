__author__      = "rizkyhaksono"
__copyright__   = "Copyright 2023, Malang"

class StackReversed:

    def __init__(self):
        self.datas = []

    def push(self, datas):
        self.datas.append(datas)

    def show(self):
        print("".join(self.datas))

    def reversed(self):
        self.datas.reverse()

    def reversedString(self):
        return "".join(self.datas[::-1])

if __name__ == "__main__":
    stack = StackReversed()
    # stack.push("S")
    # stack.push("t")
    # stack.push("r")
    # stack.push("u")
    # stack.push("k")
    # stack.push("t")
    # stack.push("u")
    # stack.push("r")
    # stack.push("D")
    # stack.push("a")
    # stack.push("t")
    # stack.push("a")

    # stack.show()
    # stack.reversed()
    # stack.show()

    # menu
    while True:
        print("1. Push")
        print("2. Show")
        print("3. Reversed")
        print("4. Exit")
        menu = int(input(">> "))
        if menu == 1:
            data = input("Masukkan data: ")
            stack.push(data)
        elif menu == 2:
            stack.show()
        elif menu == 3:
            # reverse string
            # print(stack.reversedString())
            stack.reversed()
            stack.show()
        elif menu == 4:
            print("Terima kasih")
            break
        else:
            print("Menu tidak tersedia")