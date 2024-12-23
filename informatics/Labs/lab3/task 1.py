# 466985 % 6 = 5; % 4 = 1; % 8 = 1
import re

# Смайлик [<)

regexp = re.compile('\\[<\\)')


def test(f):
    print(len(re.findall(regexp, f)))


test('[<)(())))[[[]][p<p[[<)<<[<)')  # real: 3    test: 3
test('[<<)<){){[})[<)<><))')  # real: 1    test: 1
test("""Вот и все! Неплохая получилась история: интересная, весёлая, порой немного грустная, 
а главное поучительная. Она научила быть нас смелыми и не бояться вызовов, 
которые готовит нам жизнь. По[<)могала нам добавиться поставленных целей несмотря ни на что... 
Но, самое главное, что у этой истории счастливый конец. 
Вика согласилась остаться в Моск[<)(ве, а я стал Шеф-Поваром, 
мы снова будем работать вместе. Мечты сбываются! Прикиньте!""")  # real: 2   test: 2
test('GWF*(E7W[<))Gy-8WGHE_&&TWEV$@_)(*_)@#)_%>%@#@_)_@&#_&!_>@_$_!U%^')  # real: 1   test:1
test('odqfowoq9(!9940kdsakdasksakasdll##%%%">>>}[[[[[')  # real: 0   test: 0
