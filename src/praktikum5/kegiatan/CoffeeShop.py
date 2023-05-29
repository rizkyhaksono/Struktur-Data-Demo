class CoffeeShop:
    def __init__(self, data):
        self.data = data
        self.left = None
        self.right = None

def preOrder(node):
    if node is not None:
        print(node.data, end=" ")
        preOrder(node.left)
        preOrder(node.right)

def inOrder(node):
    if node is not None:
        inOrder(node.left)
        print(node.data, end=" ")
        inOrder(node.right)

def postOrder(node):
    if node is not None:
        postOrder(node.left)
        postOrder(node.right)
        print(node.data, end=" ")

print("===Coffee Shop===\n")
print("Masukkan Orderan dan Jumlah")

value = input("Masukkan Nama Pemesan dan Usia : ")
root = CoffeeShop(value)
value2 = input("Nama Menu ke-1: ")
root.left = CoffeeShop(value2)
value3 = input("Nama Menu ke-2: ")
root.right = CoffeeShop(value3)
value4 = input("Nama Menu ke-3: ")
root.left.left = CoffeeShop(value4)
value5 = input("Nama Menu ke-4: ")
root.left.right = CoffeeShop(value5)

print("Inorder: ")
inOrder(root)
print("\n")

print("Preorder: ")
preOrder(root)
print("\n")

print("Postorder: ")
postOrder(root)
print("\n")
