Мінімум: 

Використовуючи лямбди та StreamAPI моделюємо верховну раду. Створити клас Людина, описати його наступними полями : вага, ріст, додати джентельменський набір. Створити клас депутат , унаслідувати його від Людини. Описати його такими полями: прізвище, імя, вік, хабарник(Буліановське), розмір хабаря(непередавати в конструктор). Додати джентельменський набір . Додати метод : дати хабар(), в якому передбачити наступне :

Якщо поле хабарник false - то вивести на консоль :" Цей депутат не бере хабарів", якщо умова не виконується , то ввести з консолі суму хабаря яку ви даєте,якщо це сума більша 5000, вивести на консоль "Миліція увязнить депутата", якщо не більша то занести в поле класу хабар дану суму. Створити клас фракція ,якому описати наступні методи :

 - видалити депутата(вводимо з консолі)
 - вивести всіх хабарників у фракції
 - вивести найбільшого хабарника у фракції
 - вивести всіх депутатів фракції
 - очистити всю фракцію від депутатів
 - додати депутата (вводимо з консолі)
 
Створити клас верховна рада і реалізувати в ньому наступні методи(дозволено створити тільки
один екземпляр даного класу(singleton)):
 - додати фракцію
 - видалити фракцію
 - вивести всі фракції
 - вивести конкретну фракцію
 - додати депутата до конкретної фракції
 - видалити депутата(вводимо з консолі)
 - вивести всіх хабарників у фракції
 - вивести найбільшого хабарника у фракції
 - вивести всіх депутатів фракції

Створити клас Мейн в якому описати наступне консольне меню:

MINIMUM:
- Введіть 1 щоб додати фракцію
- Введіть 2 щоб видалити конкретну фракцію
- Введіть 3 щоб вивести усі  фракції
- Введіть 4 щоб очистити конкретну фракцію
- Введіть 5 щоб вивести конкретну фракцію

MAXIMUM:
- Введіть 6 щоб додати депутата в фракцію
- Введіть 7 щоб видалити депутата з фракції
- Введіть 8 щоб вивести список хабарників
- Введіть 9 щоб вивести найбільшого хабарника

Максимум:
Використовуючи лямбди та StreamAPI створити клас Зооклуб , як поля прописати в ньому Map.Створити клас Person , який описати двома полями : імя , вік. Створити клас Animal , який описати двома полями : тип тваринки(кіт,пес), імя тваринки. В класі Зооклуб як поле прописати наступне:

Map<Person, List<Pet>> map;

Реалізувати консольне меню, таким чином щоб можна було:
 - Додати учасника клубу
 - Додати тваринку до учасника клубу
 - Видалити тваринку з учасника клубу
 - Видалити учасника з клубу
 - Видалити конкретну тваринку зі всіх власників
 - Вивести на екран зооклуб
 - Вийти з програми

Використати для побудови меню Switch.

