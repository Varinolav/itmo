import xmltodict, json


def lab_4_1():
    with open('schedule1.xml', 'r') as xml:
        d = xmltodict.parse(''.join(xml.readlines()))

        json_obj = json.dumps(d, indent=4)

    with open('schedule1.json', 'w') as s:
        s.write(json_obj)


lab_4_1()
