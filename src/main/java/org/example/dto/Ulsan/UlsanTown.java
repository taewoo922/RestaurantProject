package org.example.dto.Ulsan;

import org.example.dto.Dto;

public class UlsanTown extends Dto {
    public String town;
    public String food;
    public String foodtype;
    public String resname;
    public String num;
    public String address;

    public UlsanTown(int id, String food, String town, String resname, String address, String num) {
        this.id = id;
        this.food = food;
        this.town = town;
        this.resname = resname;
        this.address = address;
        this.num = num;
    }
}
