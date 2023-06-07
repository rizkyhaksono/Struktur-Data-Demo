__author__      = "rizkyhaksono"
__copyright__   = "Copyright 2023, Malang"

class Mahasiswa:
    dict = {
        'id': 1,
        'namaMhs': 'Rizky',
        'klsMhs': "3G",
        'matkulMhs': 'Pemrograman Python',
        'nimMhs': 325
    }
        
    print("Id\t: ", dict['id'])
    print("Nama\t: ", dict['namaMhs'])
    print("Kelas\t: ", dict['klsMhs'])
    print("Matkul\t: ", dict['matkulMhs'])
    print("NIM\t: ", dict['klsMhs'])
        
    dict['id'] = input("Masukkan id yang dirubah : ")

    if dict['id'] == 1:
        dict['namaMhs'] = input("Masukkan nama yang dirubah : ")
        dict['klsMhs'] = input("Masukkan kelas yang dirubah : ")
        dict['matkulMhs'] = input("Masukkan matkul yang dirubah : ")
        dict['nimMhs'] = input("Masukkan nim yang dirubah : ")
    else:
        print("Data tidak ada")

    ulang = input("Ulang program? y/t : ")
    if ulang == "y" or ulang == "Y":
        # Path: src\praktikum3\latihan1\Mahasiswa.py
        from Mahasiswa import Mahasiswa
    else:
        print("Terima kasih")
        exit()