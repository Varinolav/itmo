# 466985 % 6 = 5
import re

regexp = re.compile("[а-я]*[еыаоэиюуя][еыаоэиюуя][а-я]*", re.IGNORECASE)


def test(f):
    print(re.findall(regexp, f))


test("аааКривоше существо гуляет - по парку")




