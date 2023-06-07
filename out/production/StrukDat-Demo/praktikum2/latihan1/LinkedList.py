__author__      = "rizkyhaksono"
__copyright__   = "Copyright 2023, Malang"

class LinkedList:

    my_list = ["Sapi", "Kelinci", "Kambing", "Unta", "Domba"]
    print(my_list)

    # delete list item
    del my_list[0]
    print(my_list)

    # append list item
    my_list.append('Kuda')
    print(my_list)

    # insert list item
    my_list.insert(2, 'Rizky')
    print(my_list)