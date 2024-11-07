from time import time

from lab4_0_3 import lab_4
from lab4_1 import lab_4_1
from lab4_2 import lab_4_2


def test():
    start_0 = time()

    for i in range(100):
        lab_4()
    end_0 = time() - start_0

    start_1 = time()
    for i in range(100):
        lab_4_1()
    end_1 = time() - start_1

    start_2 = time()
    for i in range(100):
        lab_4_2('schedule1.xml', 'schedule1.json')
    end_2 = time() - start_2

    print(end_0, end_1, end_2)


test()
