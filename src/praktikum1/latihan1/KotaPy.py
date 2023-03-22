__author__      = "rizkyhaksono"
__copyright__   = "Copyright 2023, Malang"

class KotaPy:

    def __init__(self):
        self.namaKota = "Malang"
        self.jumlahKota = 2

    def main(self):
        print("Nama Kota: " + self.namaKota)
        print("Jumlah Kota: " + str(self.jumlahKota))

if __name__ == "__main__":
    kota = KotaPy()
    kota.main()