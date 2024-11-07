def removeduplicate(data):
    countdict = {}
    for element in data:
        if element in countdict.keys():
            countdict[element] += 1
        else:
            countdict[element] = 1
    data.clear()
    for key in countdict.keys():
        data.append(key)


def lab_4():
    stack = []
    lines = []
    to_be_listed = []
    s = ''

    with open("schedule1.xml", "r", encoding="utf-8") as xml:
        lines.append('{\n')
        for line in xml.readlines():
            if line.strip() == '<?xml version="1.0" encoding="UTF-8" ?>':
                continue
            tag = line[line.find('<') + 1:line.find('>')]

            if s == tag:
                to_be_listed.append(tag)

            if '/' not in tag and tag not in stack:
                stack.append(tag)
                if not (f'<{tag}>' in line and f'</{tag}>' in line):
                    lines.append('\t' * len(stack) + f'"{tag}": ' + '{' + '\n')

            if f'<{tag}>' in line and f'</{tag}>' in line:
                value = line[line.find('>') + 1: line.rfind('<')]
                lines.append('\t' * len(stack) + f'"{tag}": ' + f'"{value}",' + '\n')
                s = stack.pop()

            if '/' in tag and tag[1:] in stack:
                lines.append('\t' * len(stack) + '},\n')
                s = stack.pop()

        lines.append('}')

    removeduplicate(to_be_listed)

    for i in range(len(lines) - 1):
        if lines[i + 1].strip() in ['},', '}']:
            lines[i] = lines[i].rstrip()[:-1] + '\n'

    for sp in to_be_listed:
        first = True
        tabs_start = 0
        for i in range(len(lines)):
            tabs = lines[i].count('\t')
            if sp in lines[i] and first:
                tabs_start = tabs
                lines[i] = lines[i].replace('{', '[\n' + ('\t' * (tabs + 1)) + '{')
                first = False
            elif sp in lines[i]:
                lines[i] = lines[i].replace(f'"{sp}": ', '')

            if tabs < tabs_start:
                lines[i - 1] = lines[i - 1] + ('\t' * (tabs + 1)) + ']\n'
                break

        add_tab = False
        for i in range(len(lines)):
            if f'"{sp}"' in lines[i]:
                add_tab = True
                continue
            if add_tab:
                lines[i] = '\t' + lines[i]
            if ']' in lines[i] and lines[i][lines[i].find('}'):].count('\t') == tabs_start:
                break

    with open("schedule1.json", "w", encoding="utf-8") as json:
        for i in lines:
            json.write(i)


lab_4()
