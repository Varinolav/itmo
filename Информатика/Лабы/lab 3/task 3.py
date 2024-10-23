# 466985 % 5 = 0
import re

# Написать регулярное выражение, которое проверяет корректность email и в качестве
# ответа выдаёт почтовый сервер (почтовый сервер – часть email идущая после «@»).
# Для простоты будем считать, что почтовый адрес может содержать в себе буквы,
# цифры, «.» и «_», а почтовый сервер только буквы и «.». При этом почтовый сервер,
# обязательно должен содержать верхний уровень домена («.ru», «.com», etc.)

regexp = re.compile("[0-9a-z._]+@([a-z]+(?:\\.[a-z]+)+)", re.IGNORECASE)


def test(f):
    if not re.match(regexp, f):
        print('Fail!')
        return
    print(re.findall(regexp, f)[0])


test('morj@gmail.com')  # gmail.com
test('morj@gmailcom')  # Fail!
test('morj@yandex.ru')  # yandex.ru
test('morj@gmail.')  # Fail!
test('100mo_r.j@gmail.com')  # gmail.com
