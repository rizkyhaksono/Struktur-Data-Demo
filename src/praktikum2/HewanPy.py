__author__      = "rizkyhaksono"
__copyright__   = "Copyright 2023, Malang"

class HewanPy:
    
    namaHewan = ["Angsa", "Bebek", "Cicak", "Domba", "Elang", "Gajah"]

    def tambahHewan(self):
        add = input("[Add] hewan  : ")
        self.namaHewan.append(add)

    def hapusHewan(self):
        try :
            remove = input("[Delete] hewan : ")
            self.namaHewan.remove(remove)
        except:
            print("Hewan tidak ada\n")

    def tampilHewan(self):
        print(self.namaHewan)

    def tampilMenu(self):
        print("Menu : ")
        print("1. Tambah Hewan")
        print("2. Hapus Hewan")
        print("3. Tampilkan Hewan")
        print("4. Exit")

    def pilihMenu(self):
        pilih = input("Pilih Menu : ")
        if pilih == "1":
            self.tambahHewan()
        elif pilih == "2":
            self.hapusHewan()
        elif pilih == "3":
            self.tampilHewan()
        elif pilih == "4":
            print('Terima kasih')
            exit()
        else:
            print("Menu tidak ada\n")

    def main(self):
        while True:
            self.tampilHewan()
            self.tampilMenu()
            self.pilihMenu()

# Main Program
hewan = HewanPy()
hewan.main()