package ru.job4j.poly;

public interface Transport {
    void drive();

    /**
     *
     * @param passenger - число пассажиров
     */
    void passengers(int passenger);

    /**
     *
     * @param fuel - количество топлива;
     * @return возвращает цену
     */
    double refuel(int fuel);
}
