# Breeding_Clowns_Game
Надо:
Создать класс уровень мира. Он повышается при открытии нового клоуна lvl/2 + 1.
Создать класс клоунов: клоун(индекс_имя, уровень). индекс_имя генерируется переменной i: при появлении нового клоуна ему присваевается значение i, i++. уровень just to be, увеличивается при скрещивании двух одного уровня, второго убивает.
Методы для клоунов:
Избиение: при первом ударе запускается рандомайзер (от 0 до 7). На счет выпавшего удара клоун плачет и рандом запускается заново. Для каждого клоуна метод отдельный. клоун плачет (рандомно) дороже, если уровень мира выше.
избиение запускается по индекс_имя.
Переменная валюты: +, если клоун наплакал; -, если мы что-то купили.
Класс коробок. Раз в рандомное время падает новая каробка. Чем выше уровень мира, тем выше(рандомно) может быть уровень выпавшего клоуна.
(?)Класс рандомных штук. По таймеру появляется маленькая штука, при нажатии на которую дается валюта. Дорожает по уровню мира.
Магазин: запускает падение каробки нужного уровня и списывает валюту.
Библиотека открытых клоунов.
ArrayList из объектов класса клоун.
Метод скрещивания в классе клонов: пользователь выбирает, кого срестить. Если одного уровня, то скрещивает, если разного то пошли мы *****.
Поставить ограничение: если закрытых коробок > 6, то они рандомно не падают. Если нескрещаных клоунов одного уровня > 4, то рандомно коробки не падают. Покупать можно.
Макс лвл клоуна - 6. потом на другую планету.

Что надо сделать:
Класс мира
Класс клоунов
Метод избивать
Метод скрещивать
