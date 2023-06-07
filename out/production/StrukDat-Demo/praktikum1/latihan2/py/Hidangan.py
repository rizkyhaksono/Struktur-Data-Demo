__author__      = "rizkyhaksono"
__copyright__   = "Copyright 2023, Malang"

class Hidangan:

    # def getNamaHidangan(self):
    #     return self.namaHidangan

    # def setNamaHidangan(self, namaHidangan):
    #     self.namaHidangan = namaHidangan

    # def disantap(self):
    #     print("Hidangan " + self.namaHidangan + " disantap dengan tangan")

    def __init__(self, name=''):
        self._name = name

    @property
    def namaHidangan(self):
        return self._name
    
    @namaHidangan.setter
    def namaHidangan(self, name):
        self._name = name
        
    def disantap(self):
        print("Hidangan " + self._name + " disantap dengan tangan")