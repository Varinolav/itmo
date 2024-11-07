import re


def test(value):
    print(re.sub(r'.* (\w)\.\1\. P0000\s', '', value))


test("Петров П.П. P0000\nАнищенко А.А. P33113\nПримеров Е.В. P0000\nВафлевич Р.Р. P0000\n")
