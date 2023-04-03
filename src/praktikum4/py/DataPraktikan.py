__author__      = "rizkyhaksono"
__copyright__   = "Copyright 2023, Malang"

class DataPraktikan:
    def __init__(self, nama, nim, nilai):
        self.nama = nama
        self.nim = nim
        self.nilai = nilai

    def getNama(self):
        return self.nama

    def getNim(self):
        return self.nim

    def getNilai(self):
        return self.nilai

    def setNama(self, nama):
        self.nama = nama

    def setNim(self, nim):
        self.nim = nim

    def setNilai(self, nilai):
        self.nilai = nilai

    def __str__(self):
        return "Nama : " + self.nama + ", NIM : " + self.nim + ", Nilai : " + str(self.nilai)

# Path: src\praktikum3\py\Main.py
from DataPraktikan import DataPraktikan

def main():
    print("======================")
    print("Masukkan data praktikan")
    print("======================")

    nama = input("Nama : ")
    nim = input("NIM : ")
    nilai = int(input("Nilai : "))

    dataPraktikan = DataPraktikan(nama, nim, nilai)

    print("==============")
    print("Data Praktikan")
    print("==============")
    print(dataPraktikan)

if __name__ == "__main__":
    main()