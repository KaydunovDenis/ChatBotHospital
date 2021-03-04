# ChatBotHospital
Добро пожаловать на страницу разработки [ChatBotHospital|https://kaydunovdenis.github.io/ChatBotHospital]

Чат-бот решает следующие проблемы: 
1. многочасовое ожидание своей очереди на прием: расчет времени ожидания очереди, прямо из дома можно узнать ориентировочное время в очереди и свою позицию, или к примеру пойти в магазин
1. потеря очереди, двойная очередь: записанная. всем видная гибкая очередь, потерять очередь невозможно, если человек решил уйти он может удалить себя из очереди, если человека нету то в очереди видно кто перед ним или после него.
1. бесконечные звонки в регистратуру и излишняя нагрузка на рабочих: автоматическая онлайн запись
1. недозвон в регистратуру клиентов, потеря клиентов: онлайн запись
1. переработка врачей: создание гибкой очереди(нету строгой фиксации времени на одного человека, фиксированной по времени (к примеру до 20:00, значит если очередь уже забита до 20:00, то новых пациентов в очередь не будет добавляться)

## Функционал: https://github.com/KaydunovDenis/ChatBotHospital/blob/kaydunov_addFileFeatures/chatbothospital/Features.md
Клиент логинится/не логинится, чтобы бот знал данные о клиенте.
- выбрать врача/если не знает к какому врачу, то связаться с регистратурой
- выбрать день + время
- указать удобное время и подобрать доступный день
- просмотр всех своих записей к врачам.

Система
- записывает в базу, что время занято таким-то клиентом
- отправляет клиенту уведомление, что пора на прием к врачу.
-- за день до
-- за час до
- выставляет клиенту счет за услуги.
- предлагает пройти периодические осмотры (удержание клиента)
- предлагает услуги аптеки, бассейна, массажа, фитотерапии и др.
- уведомления о вирусах, необходимости приобрести маски и гели для рук.

Хранилище
- база клиентов: ФИО,
- база врачей: ФИО, рабочие дни и время
- необходимо сделать серверное предложение, чтобы администратор больницы мог вносить изменения в расписание.

## Дополнительно:
- провести опрос в поликлинике: клиентов и рабочих
