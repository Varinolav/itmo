import xmltodict
import json


def lab_4_1():
    with open('schedule1.xml', 'r', encoding='UTF-8') as x:
        x = x.read()
        d = xmltodict.parse(x, encoding='utf-8')

        json_obj = json.dumps(d, indent=4, ensure_ascii=False)
    with open('schedule1.json', 'w') as s:
        s.write(json_obj)


lab_4_1()
