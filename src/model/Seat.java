package model;

import com.sun.tools.corba.se.idl.StringGen;

public class Seat {
    private int seatNo;
    private int rowNo;
    private SeatStatus seatStatus;
    private String seatType;
    private int price;

    public Seat(int seatNo, int rowNo, SeatStatus seatStatus, String seatType, int price) {
        this.seatNo = seatNo;
        this.rowNo = rowNo;
        this.seatStatus = seatStatus;
        this.seatType = seatType;
        this.price = price;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public int getRowNo() {
        return rowNo;
    }

    public void setRowNo(int rowNo) {
        this.rowNo = rowNo;
    }

    public SeatStatus getSeatStatus() {
        return seatStatus;
    }

    public void setSeatStatus(SeatStatus seatStatus) {
        this.seatStatus = seatStatus;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
                "seatNo=" + seatNo +
                ", rowNo=" + rowNo +
                ", seatStatus=" + seatStatus +
                ", seatType='" + seatType + '\'' +
                ", price=" + price +
                '}';
    }
}
