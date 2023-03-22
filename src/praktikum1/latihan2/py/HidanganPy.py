__author__      = "rizkyhaksono"
__copyright__   = "Copyright 2023, Malang"

class HidanganPy:

    def getNamaHidangan(self):
        return self.namaHidangan

    def setNamaHidangan(self, namaHidangan):
        self.namaHidangan = namaHidangan

    def disantap(self):
        print("Hidangan " + self.namaHidangan + " disantap dengan tangan")