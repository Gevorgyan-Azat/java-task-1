Задача:
Сформировать коробку со слодостями. Она может включать в себя разные сладости, у каждоой есть название, вес, цена и уникальный параметр.

Найти:
Общий вес подарка, общую стоимость подарка и вывести на консоль информацию о всех сладостях в коробке.

Сущности:
- Базовый абстрактный класс для всех видов сладостей и конкретные сладости, наследующиеся от базового.
- Интерфейс для коробки сладостей с методами добавить, удалить (по индексу/либо последний) сладость, вывести вес, стоимость коробки, вывести всю информацию обо всех сладостях.
- Конкретные реализации интерфейса коробки. Внутри коробка содержит массив сладостей и работает с ним. Вне коробки массив недоступен.
- Два метода для умной оптимизации подарка, для удаления сладостей с меньшим весом и с меньшей ценой из коробки до тех пор, пока вес коробки не станет меньше входного параметра.
