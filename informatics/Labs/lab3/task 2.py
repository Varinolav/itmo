# 466985 % 6 = 5
import re

# С помощью регулярного выражения найти в тексте все слова, в которых две гласные
# стоят подряд, а после этого слова идёт слово, в котором не больше 3 согласных.

regexp = re.compile(
    r"([а-я]*[еыаоэиюуя]{2}[а-я]*)[:,.]*\s[\\-]?\s?(?:[еыаоэиюуя]*[йцкнгшщзхъфвпрлджчсмтьб]?){3}[еыаоэиюуя,:;]*(?:\s|$)",
    re.IGNORECASE)


def test(f):
    print(re.findall(regexp, f))


test('Кривошеее существо гуляет по парку')
# real: гуляет  test: гуляет
test('Кривошеее существо гуляет, - по парку')
# real: гуляет  test: гуляет
test('Рецепт пельменееееей: свари, съешь')
# real: пельменееееей  test: пельменееееей
test("""У блондинки родилась двойня, она сидит на кровати и рыдает. заходит медсестра и спрашивает:
- Почему вы плачете?
- Что я скажу мужу? От кого второй ребенок?""")
# real: спрашивает, test: спрашивает
test("""Первое правило клуба – не упоминать о Бойцовском клубе. 
Второе правило клуба – никогда не упоминать о Бойцовском клубе! 
Третье правило клуба – если боец крикнул “стоп!”, выдохся или отключился, бой окончен. 
Четвертое правило – в бою участвуют лишь двое. 
Пятое правило – бои идут один за другим, а не одновременно. 
Шестое правило – снимать обувь и рубашки. 
Седьмое правило – бой продолжается столько, сколько нужно. 
Восьмое и последнее правило – тот, кто впервые пришел в клуб, должен драться.""")
# real: участвуют двое бои Восьмое  test: участвуют двое бои Восьмое