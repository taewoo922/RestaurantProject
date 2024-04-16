package org.example.dto.Seoul;

import org.example.dto.Dto;

public class SeoulTown extends Dto {
    public String town;
    public String foodtype;
    public String resname;
    public String num;
    public String address;
    public int boardId;

    public SeoulTown( String foodtype, String town, String resname, String address, String num, int boardId) {
//        this.id = id;
        this.foodtype = foodtype;
        this.town = town;
        this.resname = resname;
        this.address = address;
        this.num = num;
        this.boardId = boardId;
    }
}
