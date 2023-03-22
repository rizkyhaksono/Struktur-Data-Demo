__author__      = "rizkyhaksono"
__copyright__   = "Copyright 2023, Malang"

from typing import Any, List

class SegitigaPy:
    def __init__(self, alas: int, tinggi: int):
        self.alas = alas
        self.tinggi = tinggi

    def luas(self) -> float:
        return self.alas * self.tinggi / 2

    def keliling(self) -> float:
        return self.alas * 3

    def __str__(self) -> str:
        return f"Segitiga dengan alas {self.alas} dan tinggi {self.tinggi}"

if __name__ == "__main__":
    segitiga = SegitigaPy(10, 5)
    print(segitiga)
    print(f"Luas: {segitiga.luas()}")
    print(f"Keliling: {segitiga.keliling()}")
