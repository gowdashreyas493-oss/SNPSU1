package day4.association.aggregation;

public class information {
    char blockNo;
    int floorNo,roomNo,bedNo;

    public information(int floorNo, int roomNo, int bedNo, char blockNo) {
        this.floorNo = floorNo;
        this.roomNo = roomNo;
        this.bedNo = bedNo;
        this.blockNo = blockNo;
    }
}
