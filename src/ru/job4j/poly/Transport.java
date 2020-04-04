package ru.job4j.poly;

public interface Transport {
    void drive();

    /**
     *
     * @param Passenger - число пассажиров
     */
    void Passengers(int Passenger);

    /**
     *
     * @param fuel - количество топлива;
     * @return возвращает цену
     */
    double refuel(int fuel);
}
