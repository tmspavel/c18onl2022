#Пример: html and css
html - язык текстовой разметки(описывает структуру)! нету логики.
http://htmlbook.ru/samlayout/verstka-na-html5
https://html5book.ru/html-html5/

- парные теги или контейнеры
<div>

</div>
<br>
вложенность нарушать нельзя!!

- рассказать про теги:
1) теги верхнего уровня
2) теги заголовка документа
3) блочные элементы
4) строчные элементы
5) универсальные элементы
6) списки
7) таблицы
8) фраймы

-- теги верхнего уровня в презентации
для формирования структы веб страницы и определяют раздел заголовка и тело документа
html head(title) body(тело)

-- title(тег заголовка документа), другие теги не отображаются
link - подключаем внешние ресурсы
meta(для хранения информации для браузеров и поисковых систем, кодировка)
https://html5book.ru/osnovy-html/#part5

-- блочные элементы(всю доступную ширину браузеров)
http://htmlbook.ru/html/blockquote
http://htmlbook.ru/html/div
http://htmlbook.ru/html/h1 - h6
http://htmlbook.ru/html/p
http://htmlbook.ru/html/pre
http://htmlbook.ru/html/hr

-- строчные
http://htmlbook.ru/html/type/inline
http://htmlbook.ru/html/input

-- универсальные
http://htmlbook.ru/html/type/universal

-- списки

ul->li
ol->li

--таблицы
table
th - table head
tr - row
td - столбец

--фраймы
http://htmlbook.ru/html/frame
https://html5book.ru/osnovy-html/#part2

- про атрибуты "" или ''
теги в нижнем регистре пишем!
браузер может игнорировать не правильные атрибуты или теги
допускается некоторым тегам не присваивать значения, например disabled

Css(внешний вид)
https://html5css.ru/html/html_css.php
цвет фон шрифт отступы выравнивания

как подключаем стили из презентации
подключаем google фонты
-через линк
-через импорт

vw - view window(область видимости) 10%

селекторы(https://developer.mozilla.org/ru/docs/Learn/CSS/Building_blocks/Selectors)
* {//универсальный
color :green;
}
- по типу
- по классу div class="index"
.index {
 color: 2em
}
-по индификатору(id) div id="demo"
#demo {
}

- про марженги.

1.5 em или 150% от дефолтного шрифта показать про страусы и вложенные дивы. Дефолтный 16px
https://learn.javascript.ru/css-units


