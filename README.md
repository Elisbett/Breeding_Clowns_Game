# Breeding_Clowns_Game 
Autorid:"\n"
Daria Savtsenko, Elisabeth Serikova

Projekti Põhjalik Kirjeldus:
Projekti eesmärk on luua Java-mäng, mis loob klounide maailma, kus kasutajal on võimalus osta kloune, neid omavahel ristata, avada klounikarpe ning teenida pisaraid (raha). Programm koosneb mitmest klassist, mis on loodud erinevate funktsioonide jaoks, sealhulgas klounide, karbide, boonuste ja maailma taseme klassid.

Iga Klassi Kohta Eraldi:

1. Bonuses:
     - `tearsForBonuses(int level)`: genereerib ja tagastab pisarate arvu vastavalt tasemele ja juhuslikule tegurile.

2. BoxesClass:
   - Tühi klass, millel ei ole meetodeid. On tehtud graafilises etapis kasutamiseks.

3. ClownsClass:
     - `slapTheClown()`: simuleerib klouni peksmist ja arvutab välja teenitud pisarate arvu.
   - **compareTo meetod**: võrdleb kahe klouni taset vastavalt nende tasemele.

4. LevelInfo:
     - `getCost()`: arvutab ja tagastab taseme maksumuse vastavalt sellele, milline on kasutajal taseme valimisel.

5. World:
     - mitu meetodit, nagu `addClown`, `deleteClowns`, `breeding`, `buying`, mis vastutavad klounide lisamise, eemaldamise, ristamise ja ostmise eest vastavalt kasutaja tegevustele.
   - `main` meetod: programmi käivitamine ja kasutajaliides.

6. WorldLevel:
     - `clownsLevelInTheBox(int maxOpenedClown, int boxIndex)`: genereerib klouni taseme vastavalt kasutaja tasemele ja juhuslikule tegurile.
     - `startBoxesGenerator()`: algatab karbikoguja, mis loob uusi karpe vastavalt ajaintervallile.
     - `generateBox()`: loob uue karbi.
     - `bonusesGenerator()`: algatab boonuste genereerija, mis loob uusi boonuseid vastavalt ajaintervallile.
     - `addBonusToList()`: lisab uue boonuse boonuste loendisse.
     - `collectBonuses()`: kogub kõik boonused ja arvutab nende koguarvu pisarates.

Projekti Tegemise Protsess:
Idee tekkimine, struktureerimine ja tööplaani loomine, koodi kirjutamine (klasside loomine, meetodite arendamine ja optimeerimine), testimine, parandamine

Iga Rühmaliikme Panus:
Proovisime paarisprogrameerimist. Tegime põhimõtteliselt kõik koos. Oli umbes 22 tundi paaristööd.



Tegemise Mured:
Kuna see oli meie esimene kogemus selles projektitüübis, tekkis olukord, kus meil oli vaja päris palju tööd üle teha. Me proovisime enne klassi või meetodite loomist mõelda, kuidas me tahame seda kasutada ja kuidas seda teha efektiivsemalt, aga pärast tuli välja, et oli võimalik seda teha paremini. Oli raske kirjutada HashMap-i optimaalses vormis. 

Hinnang Töö Lõpptulemusele:
Oleme oma tulemusega rahul: kõik, mis oli plaanis, on tehtud. Küll tuleb arendada töö efektiivsust, kuna praegu mõjutab meie tööd töökogemuse puudus.

Selgitus ja/või Näited Testimisest:
Klassis World on pärast kommentaari "//testim vse" kirjeldatud mitmeid testimise näiteid ja protseduure, mis on läbi viidud programmi osade eraldi ja tervikuna toimimise kontrollimiseks. 

//testim vse
int ourWorldLevel = 1;
WorldLevel currentWorld = ourWorlds.get(ourWorldLevel);
HashMap<Integer, ClownsClass> currentWorldClowns = currentWorld.getClownIndex();

// Testime klounide loomist ja lisamist maailma tasemele
maxOpenedClown += addClown(6, currentWorldClowns, levelInfoMap, maxOpenedClown);
maxOpenedClown += addClown(6, currentWorldClowns, levelInfoMap, maxOpenedClown);

// Testime klounide ristamist
breeding(0, 1, currentWorldClowns, levelInfoMap, maxOpenedClown, ourWorlds, ourWorldLevel);

// Testime klounide ostmist ja rahakoti vähendamist
maxOpenedClown = addClown(2, currentWorldClowns, levelInfoMap, maxOpenedClown);
maxOpenedClown = addClown(2, currentWorldClowns, levelInfoMap, maxOpenedClown);

// Testime klounide ristamist uuesti pärast ostu
breeding(0, 1, currentWorldClowns, levelInfoMap, maxOpenedClown, ourWorlds, ourWorldLevel);

// Testime klounide peksmist ja pisarate teenimist
currentWorldClowns.get(0).slapTheClown();

// Testime uue klouni genereerimist pärast karbikukkumist
maxOpenedClown = addClown(6, currentWorldClowns, levelInfoMap, maxOpenedClown);

// Testime klouni peksmist ja rahakoti suurenemist
moneyInWallet += currentWorldClowns.get(1).slapTheClown();

// Kuvame klounide andmed pärast kõiki tegevusi
System.out.println("Näitame meie HashMapi:");
for (Integer key : currentWorldClowns.keySet()) {
    ClownsClass value = currentWorldClowns.get(key);
    System.out.println("Võti: " + key + ", Väärtus: " + value.getName());
}
currentWorld.startBoxesGenerator();

// Simuleerime aja möödumist ja uue klouni genereerimist karbist
Timer timer = new Timer();
timer.schedule(new TimerTask() {
    @Override
    public void run() {
        int newClownLevel = currentWorld.clownsLevelInTheBox(maxOpenedClown, 0);
        System.out.println(newClownLevel + " Uus tase, mis kukkus karbist");
        maxOpenedClown = addClown(newClownLevel, currentWorldClowns, levelInfoMap, maxOpenedClown);
    }
}, 1 * 60 * 1000); // 1 minut millisekundites

// Testime klounide kogumist boonustest
int collectedTears = currentWorld.collectBonuses();
System.out.println("Kogusime " + collectedTears + " pisaraid!");







Что ещё осталось:
...................
ограничение в магазине
boolean массив для открытых миров
...................

Переменная валюты: +, если клоун наплакал; -, если мы что-то купили. 

+ сделать переход ля каждого мира отдельно
+ сделать max opened clown для каждого мира отдельно
+ НАДО после третьего:
+ можно ли совместить все значения клоунов (уровень, имя, стоимость) в один класс и потом выводить для магазина и распределения от уровней по мирам


Надо после второго:

+ доработатаь коробки (их работа в каждом миреб удаление после открытия конкретной коробки (чтобы в графике было заебись)

сделать общение с пользователем

+ сделать прыжки между мирами при повышении клоуна с 6 на 7 (мб, мы не уверены)



+ Надо после первого:

+ Доделать глваныц класс для миров (он шаблон для каждого мира) и отдельный класс для каждого уровня мира 

+ Разобраться с именем-индексом-уровнем клоуна
(красиво оформить для общения с пользователем и графики)

+ Доделать механизм создавания клоунов. добавить избиение клоуна в мир.

+ Надо:

+ (сделали another way) Создать класс уровень мира. Он повышается при открытии нового клоуна lvl/2 + 1.

+ Создать класс клоунов: клоун(индекс_имя, уровень). индекс_имя генерируется переменной i: при появлении нового клоуна ему присваевается значение i, i++. уровень just to be, увеличивается при скрещивании двух одного уровня, второго убивает. 

+ Методы для клоунов: 

+ Избиение: при первом ударе запускается рандомайзер (от 0 до 7). На счет выпавшего удара клоун плачет и рандом запускается заново. Для каждого клоуна метод отдельный. клоун плачет (рандомно) дороже, если уровень мира выше. 

+ избиение запускается по индекс_имя. 

* Переменная валюты: +, если клоун наплакал; -, если мы что-то купили. 


+ Класс коробок. Раз в рандомное время падает новая коробка. Чем выше уровень мира, тем выше(рандомно) может быть уровень выпавшего клоуна. 

+ Класс рандомных штук. По таймеру появляется маленькая штука, при нажатии на которую дается валюта. Дорожает по уровню мира. 

+ Магазин: запускает падение коробки нужного уровня и списывает валюту. 

(?) Библиотека открытых клоунов. 

++ ArrayList из объектов класса клоун. 


+ Метод скрещивания в классе клонов: пользователь выбирает, кого скрестить. Если одного уровня, то скрещивать можно. 

+ (?) Поставить ограничение: если закрытых коробок > 6, то они рандомно не падают. Если нескрещаных клоунов одного уровня > 4, то рандомно коробки не падают. Покупать можно. 

+ Макс лвл клоуна - 6. потом на другую планету. 

+ Что надо сделать: 

+ Класс мира 

+ Класс клоунов 

+ Метод избивать 

+ Метод скрещивать 
