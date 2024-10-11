# 466985 % 5 = 0
import re

regexp = re.compile("[0-9a-z._]+@[a-z]+\\.[a-z]+", re.IGNORECASE)


def test(f):
    if not re.match(regexp, f):
        print('Fail!')
        return
    else:
        print(f.split('@')[-1])


test('morj@gmail.com') # gmail.com
test('morj@gmailcom') # Fail!
test('morj@yandex.ru') # yandex.ru
test('morj@gmail.') # Fail!
test('100mo_r.j@gmail.com') # gmail.com


