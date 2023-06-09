package S5;

import S5.presenters.BookingPresenter;
import S5.views.BookingView;
import S5.models.TableModel;

import java.util.Date;

public class Program {

    /**
     * TODO: ДОМАШНЯЯ РАБОТА
     *  Метод changeReservationTable должен заработать!
     * @param args
     */
    public static void main(String[] args) {

        BookingView bookingView = new BookingView();
        TableModel tableModel = new TableModel();
        BookingPresenter bookingPresenter = new BookingPresenter(bookingView, tableModel);
        bookingPresenter.showTables();
        bookingView.reservationTableEvent(new Date(), 103, "Станислав");

        bookingView.changeReservationTable(9001,new Date(), 101, "Станислав");
    }

}
