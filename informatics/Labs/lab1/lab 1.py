import re


def decode(osn=7, num='{^1}303{^2}'):
    num = num.replace('^', '-')
    l = re.findall('-[0-9]+|[0-9]', num)
    l = [int(i) for i in l]
    l.reverse()
    res = sum(i * osn ** k for k, i in enumerate(l))
    return res


def encode(osn=7, num=-1353):
    res = []
    while num != 0:
        ostatok = num % osn
        num //= osn
        if ostatok > osn // 2:
            ostatok -= osn
            num += 1
        res.append(ostatok)
    res = ["{^" + str(-i) + "}" if i < 0 else str(i) for i in res]
    return ''.join(res[::-1])


print(decode())
print(encode())
