#Пример: получение атрибутов

- поговорим про forward и sendRedirect
forward - только в пределах одного приложения
sendRedirect - можно отравить данные в респонзе в другое приложение
https://javarush.com/groups/posts/2529-chastjh-5-servletih-pishem-prostoe-veb-prilozhenie

- getWriter() налог System.out.println()

- Filter
https://proselyte.net/tutorials/servlets/filters/

-Session - хранит данные переданые в предыдущих запросах
написать пример что на формет логина мы ложим в сесию пароль и логин
req.setSession
req.getSession(false)
перейдем на другую страницу и там достанем.
