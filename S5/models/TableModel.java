package S5.models;

import S5.presenters.Model;

import java.util.*;

public class TableModel implements Model {


    private Collection<Table> tables;

    /**
     * Получение списка всех столиков
     * @return
     */
    public Collection<Table> loadTables(){
        if (tables == null){
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }
        return tables;
    }

    /**
     * Бронирование столика
     * @param reservationDate Дата бронирования
     * @param tableNo Номер столика
     * @param name Имя клиента
     * @return Номер брони
     */
    public int reservationTable(Date reservationDate, int tableNo, String name){
        for (Table table : tables) {
            if (table.getNo() == tableNo){
                Reservation reservation = new Reservation(reservationDate, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        return -1;
    }

    public int deleteReservationTable(Reservation reservation){
        return deleteReservationTable(reservation.getId());
    }
    public int deleteReservationTable(int idReservation){
        for (Table table : tables) {
            Collection<Reservation> reservations = table.getReservations();
            Iterator<Reservation> iterator = reservations.iterator();
            while (iterator.hasNext()){
                if (iterator.next().getId() == idReservation) {
                    iterator.remove();
                    return 1;
                }
            }
        }
        return -2;
    }


    /**TODO: Разработать метод самостоятельно в рамках домашнего задания
     * Поменять бронь столика
     * @return
     */
    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        int newReservation = reservationTable(reservationDate, tableNo, name);
        if(newReservation > 0){
            //Если удалось создать новую запись, удаляем старую.
            //Если не удалось удалить старую, удаляем новую и возвращаем - 2
            if(deleteReservationTable(oldReservation)<0) {
                deleteReservationTable(newReservation);
                return -2;
            }
            return newReservation;
        }
        return -1;
        //TODO: Для создания нового резерва столика стоит воспользоваться уже
        // существующим методом reservationTable
    }

}
