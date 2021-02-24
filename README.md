# ChatBotHospital
Проблема: 4 часовые очереди на прием, бесконечные звонки в регистратуру и излишняя нагрузка на рабочих, извечный недозвон в регистратуру клиентов

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

Дополнительно:
- провести опрос в поликлинике: клиентов и рабочих
