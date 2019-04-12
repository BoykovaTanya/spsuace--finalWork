package ru.spsuace.projects.bank;

/**
 * Евсеева Елена
 *
 * Создать систему, имитирующую банк.
 * 1) Банк имеет на счету некоторую сумму
 * 2) Банк может дать кредит под плавающий процент (зависит от клиента) на плавающую сумму (зависит от клиента)
 * 3) Банк может положить сумму на депозит - процент зависит от срока
 * 4) Банк принимает платежи по кредиту (платежи могут быть ежемесячными, ежеквартальными или ежегодными)
 * 5) Клиенты это или люди (только ежемесячные кредиты) или компании
 * 6) За просрочку по кредиту начисляется пени (некоторый процент от суммы платежа)
 * 7) Пени оплачиваются после платежа по кредиту и на них так же капает процент (больший чем от просрочки по кредиту)
 * Пример платеж 10к, пени 1к. Человек заплатил 10к, пени так и осталось 1к
 * 8) Для удобство расчетов можно сделать метод который меняет текущую дату в нашей программе на 1 месяц вперед
 * 9) Банк должен иметь методы для предоставления всей доступной суммы, потенциальную сумму при закрытии всех вкладов и
 * и кредитов, а так же процентный доход (сумма между выплаченными процентами по вкладам и полченными процентами по
 * кредитам + штрафы)
 *
 *
 * Для удобство расчетов, считаем что процентная сумма за период постоянная. Т.е. если положили в банк 12к на год под 10%
 * То за год я получу 12к / 10 = 1200 или за месяц я буду получить по 100. Если вклад заберу через пол года,
 * то процентами получу 600р
 *
 * Аналогично для кредита, 36к на 3 года под 10% итого получится 36 / (3 * 0.1) = 10.8к переплата по кредиту.
 * А ежемесечный платеж (36к + 10.8) / 36 = 1300. И если я захочу закрыть кредит через год,
 * то заплатить придется 1300 * 12 + 1000 * 24 = 39600
 */
public class Bank {

}
