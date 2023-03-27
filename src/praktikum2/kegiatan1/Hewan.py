__author__      = "rizkyhaksono"
__copyright__   = "Copyright 2023, Malang"

class Hewan:
    # tahap 1
    namaHewan = ["Angsa", "Bebek", "Cicak", "Domba", "Elang", "Gajah"]

    print("=== Tahap 1 ===")
    print("Nama Hewan : ", namaHewan)

    # tahap 2
    print("\n=== Tahap 2 ===")
    namaHewan.append("Badak")
    namaHewan.append("Bebek")

    totalBebek = 0
    for (i, nama) in enumerate(namaHewan):
        if nama == "Bebek":
            totalBebek += 1

    print("Total Bebek : ", totalBebek)
    print("Posisi Index Bebek : ", [i for i, x in enumerate(namaHewan) if x == "Bebek"])

    print("Nama Hewan : ", namaHewan)

    # tahap 3
    print("\n=== Tahap 3 ===")
    namaHewan.remove("Bebek")

    print("Nama Hewan : ", namaHewan)

    # tahap 4
    print("\n=== Tahap 4 ===")
    print("Index ke-0 : ", namaHewan[0])
    print("Index ke-2 : ", namaHewan[2])
    namaHewan.remove(namaHewan[0])
    print("Nama Hewan : ", namaHewan)

    # tahap 5
    print("\n=== Tahap 5 ===")
    print("Nama Hewan : ", namaHewan)

    namaHewan[0] = "Ular"
    namaHewan.insert(2, "Itik")

    print("Nama Hewan : ", namaHewan)

    # tahap 6
    print("\n=== Tahap 6 ===")
    del namaHewan[2:5]

    print("Nama Hewan : ", namaHewan)

    # tahap 7
    print("\n=== Tahap 7 ===")
    print("Elemen pertama : ", namaHewan[0])
    print("Elemen terakhir : ", namaHewan[-1])

    # tahap 8
    print("\n=== Tahap 8 ===")
    print("Total elemen hewan : ", len(namaHewan))

    # tahap 9
    print("\n=== Tahap 9 ===")
    print("Posisi index badak : ", namaHewan.index("Badak"))