__author__      = "rizkyhaksono"
__copyright__   = "Copyright 2023, Malang"

# call function from another file
# from praktikum1.latihan2.py.HidanganPy import disantap

# import function from another file
from praktikum1.latihan2.py.Hidangan import disantap

class Main:

    def main():
        # call function from another file
        disantap()

# call main function
if __name__ == "__main__":
    main()
    

