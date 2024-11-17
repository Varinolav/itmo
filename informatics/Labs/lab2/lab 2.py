a = input()
r1, r2, i1, r3, i2, i3, i4 = [int(i) for i in a]
s1 = (r1 + i1 + i2 + i4) % 2
s2 = (r2 + i1 + i3 + i4) % 2
s3 = (r3 + i2 + i3 + i4) % 2

s = int(f'{s3}{s2}{s1}', 2)
if s == 0:
    print(f'No errors: {i1}{i2}{i3}{i4}')
if s == 1:
    print("r1 error")
    print(f'Correct message: {i1}{i2}{i3}{i4}')
elif s == 2:
    print("r2 error")
    print(f'Correct message: {i1}{i2}{i3}{i4}')
elif s == 3:
    print("i1 error")
    print(f'Correct message: {int(not i1)}{i2}{i3}{i4}')
elif s == 4:
    print("r3 error")
    print(f'Correct message: {i1}{i2}{i3}{i4}')
elif s == 5:
    print("i2 error")
    print(f'Correct message: {i1}{int(not i2)}{i3}{i4}')
elif s == 6:
    print("i3 error")
    print(f'Correct message: {i1}{i2}{int(not i3)}{i4}')
elif s == 7:
    print("i4 error")
    print(f'Correct message: {i1}{i2}{i3}{int(not i4)}')
