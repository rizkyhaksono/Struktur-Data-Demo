__author__      = "rizkyhaksono"
__copyright__   = "Copyright 2023, Malang"

class DataPraktikan:
    # hashmap untuk menyimpan data praktikan
    data = {}

    # constructor
    def __init__(self, nimPraktikan, namaAsisten):
        self.nimPraktikan = "rizkyhaksono"
        self.namaAsisten = "123"

    # method untuk menambahkan data praktikan
    def tambahData(self, nimPraktikan, namaAsisten):
        DataPraktikan.data[self.nimPraktikan] = self.namaAsisten

    # method untuk menghapus data praktikan
    def hapusData(self):
        del DataPraktikan.data[self.nimPraktikan]

    # method untuk menampilkan data praktikan
    def tampilkanData(self):
        print("NIM Praktikan: " + self.nimPraktikan)
    
    # method untuk menampilkan data asisten
    def tampilkanAsisten(self):
        print("Nama Asisten: " + self.namaAsisten)

    # method untuk edit data praktikan
    def editData(self, nimPraktikan, namaAsisten):
        DataPraktikan.data[nimPraktikan] = namaAsisten

    # method untuk mencari data praktikan
    def cariData(self, nimPraktikan):
        if nimPraktikan in DataPraktikan.data:
            print("Data ditemukan")
            return True
        else:
            print("Data tidak ditemukan")
            return False

    # method login untuk memastikan data praktikan ada
    def login(self, username, password):
        if username in DataPraktikan.data:
            print("Login berhasil")
            return True
        else:
            print("Login gagal")
            return False

    # method logout untuk memastikan data praktikan ada
    def logout(self, nimPraktikan):
        if nimPraktikan in DataPraktikan.data:
            print("Logout berhasil")
            return True
        else:
            print("Logout gagal")
            return False

    # method untuk menghitung total data praktikan
    def totalData(self):
        print("Total data: " + str(len(DataPraktikan.data)))

# main program
if __name__ == "__main__":
    username = input("Masukkan email: ")
    password = input("Masukkan password: ")

    if username == "rizkyhaksono" and password == "123":
        # switch case
        print("1. Tambah data")
        print("2. Hapus data")
        print("3. Tampilkan data")
        print("4. Edit data")
        print("5. Cari data")
        print("6. Login")
        print("7. Logout")
        print("8. Total data")
        print("9. Keluar")

        pilihan = int(input("Masukkan pilihan: "))
        if pilihan == 1:
            nimPraktikan = input("Masukkan nim praktikan: ")
            namaAsisten = input("Masukkan nama asisten: ")
            DataPraktikan.tambahData(nimPraktikan, namaAsisten)
        elif pilihan == 2:
            nimPraktikan = input("Masukkan nim praktikan: ")
            DataPraktikan.hapusData(nimPraktikan)
        elif pilihan == 3:
            nimPraktikan = input("Masukkan nim praktikan: ")
            DataPraktikan.tampilkanData(nimPraktikan)
        elif pilihan == 4:
            nimPraktikan = input("Masukkan nim praktikan: ")
            namaAsisten = input("Masukkan nama asisten: ")
            DataPraktikan.editData(nimPraktikan, namaAsisten)
        elif pilihan == 5:
            nimPraktikan = input("Masukkan nim praktikan: ")
            DataPraktikan.cariData(nimPraktikan)
        elif pilihan == 6:
            username = input("Masukkan email: ")
            password = input("Masukkan password: ")
            DataPraktikan.login(username, password)
        elif pilihan == 7:
            nimPraktikan = input("Masukkan nim praktikan: ")
            DataPraktikan.logout(nimPraktikan)
        elif pilihan == 8:
            DataPraktikan.totalData()
        elif pilihan == 9:
            exit()
    else:
        print("Login gagal")