import re

d = {}
stack = []
with open('schedule1.xml', 'r', encoding='UTF-8') as xml:
    lines = [line.strip() for line in xml.readlines()]
    for line in lines:
        if line.strip() == '<?xml version="1.0" encoding="UTF-8" ?>':
            continue
        tag = re.findall(r'<(/?.*?)>', line)
        if len(tag) == 1:
            tag = tag[0]
            if tag not in stack and '/' not in tag:
                stack.append(tag)
            if '/' in tag:
                s = stack.pop()
            path = '_'.join(stack)
        print(path)
        if len(tag) == 2:
            path = '_'.join(stack) + f'_{tag[0]}'
            value = re.findall(r'>(.*)<', line)[0]
            print(path, value)
            if path not in d:
                d[path] = [value]
            else:
                d[path] += [value]

with open('dop_csv.csv', 'w', encoding='UTF-8') as csv:
    t = ','.join(d.keys()) + '\n'
    csv.write(t)
    for i in range(len(list(d.values())[0])):
        string = [v[i] for k, v in d.items()]
        res = ','.join(string) + '\n'
        csv.write(res)
